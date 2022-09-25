package ru.netology;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private DateTimeFormatter dateFormatter;

    private DateTimeFormatter getDateTimeFormatter() {
        if (dateFormatter == null) {
            dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        }
        return dateFormatter;
    }

    private int day;
    private int month;
    private int year;

    // поле не используется, но может быть в дальнейшем использовано,
    // все установки даты проходят через парсинг, для этого поля это, для того чтобы проверить реальность даты,
    // так как если дата не правдоподобна будет брошено исключение
    private LocalDate dateWithJavaTime;

    public Date(int day, Month month, int year) {
        this.dateWithJavaTime = LocalDate.parse(String.format("%02d/%02d/%04d", day, month.ordinal() + 1, year), getDateTimeFormatter());
        this.day = day;
        this.month = month.ordinal() + 1;
        this.year = year;
    }

    public void setBirthday(int day, Month month, int year) {
        this.dateWithJavaTime = LocalDate.parse(String.format("%02d/%02d/%04d", day, month.ordinal() + 1, year), getDateTimeFormatter());
        this.day = day;
        this.month = month.ordinal() + 1;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.dateWithJavaTime = LocalDate.parse(String.format("%02d/%02d/%04d", day, this.month, this.year), getDateTimeFormatter());
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.dateWithJavaTime = LocalDate.parse(String.format("%02d/%02d/%04d", this.day, month.ordinal() + 1, this.year), getDateTimeFormatter());
        this.month = month.ordinal() + 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.dateWithJavaTime = LocalDate.parse(String.format("%02d/%02d/%04d", this.day, this.month, year), getDateTimeFormatter());
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Date otherObj = (Date) obj;
        if (this.day != otherObj.getDay()) return false;
        if (this.month != otherObj.getMonth()) return false;
        return this.year == otherObj.getYear();
    }
}
