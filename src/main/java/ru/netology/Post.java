package ru.netology;

public class Post {
    private Date birthday;
    private String name;
    private String passport;
    private String patronymic;
    private String phone;
    private String surname;
    private boolean subscription;

    public Post() {
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(int day, Month month, int year) {
        this.birthday = new Date(day, month, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isSubscription() {
        return subscription;
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Post otherObj = (Post) obj;
        if (!this.birthday.equals(otherObj.getBirthday())) return false;
        if (!this.name.equals(otherObj.getName())) return false;
        if (!this.passport.equals(otherObj.getPassport())) return false;
        if (!this.patronymic.equals(otherObj.getPatronymic())) return false;
        if (!this.phone.equals(otherObj.getPhone())) return false;
        if (!this.surname.equals(otherObj.getSurname())) return false;
        return this.subscription == otherObj.isSubscription();
    }

    @Override
    public String toString() {
        return String.format("\nPost{\n\tbirthday: %s\n\tname: %s\n\tpassport: %s\n\tpatronymic: %s\n\tphone: %s\n\tsurname: %s\n\tsubscription: %s\n}",
                birthday.toString(), name, passport, patronymic, phone, surname, subscription);
    }
}