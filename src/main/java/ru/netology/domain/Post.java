package ru.netology.domain;

public class Post {
    private int ownerId;
    private int data;
    private boolean hide;

    public class Banner {
        private String text;
        private boolean save;
        private int idUrl;

        public class Interaction {
            private int likes;
            private String comments;
            private int reposts;
            private int views;

            //             + get/set на все поля
        }
    }
}
