package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;


    public class Comments {
        private int count;
        private boolean canPost;
        private boolean groupsCanPost;
        private boolean canClose;
        private boolean canOpen;

        public class Copyright {
            private int id;
            private String link;
            private String name;
            private String type;

            public class Likes {
                private int count;
                private boolean userLikes;
                private boolean canLikes;
                private boolean canPublish;

                public class Reposts {
                    private int count;
                    private boolean userReposted;

                    public class Views {
                        private int count;

                        public class Donut {
                            private boolean isDonut;
                            private int paidDuration;
                            private boolean canPublishFreeCopy;
                            private String editMode;
                        }


                        //             + get/set на все поля
                    }
                }
            }
        }
    }
}
