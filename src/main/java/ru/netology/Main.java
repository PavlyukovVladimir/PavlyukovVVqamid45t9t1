package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setBirthday(13, Month.JUNE, 1999);
        post.setName("Иван");
        post.setPassport("4444 № 44444444");
        post.setPatronymic("Иванович");
        post.setPhone("+7 (999)-999-99-99");
        post.setSurname("Иванов");
        post.setSubscription(true);
        System.out.println(post);
    }
}