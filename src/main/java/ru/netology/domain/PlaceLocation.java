package ru.netology.domain;

import java.util.Date;

public class PlaceLocation {
    private long id;
    private String title;
    private int latitude;
    private int longitude;
    private Date created;
    private String iconUrl;
    private String country;
    private String city;
    private int type;
    private long groupId;
    private String groupPhotoUrl;
    private int checkins;
    private Date updated;
    private long address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
