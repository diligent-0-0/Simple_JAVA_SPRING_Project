package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "stream_note")
public class Note implements Serializable {

    @Id
    private String id;
    private String title;
    private String Content;
    private Date addedDate;
    private boolean live=false;

    public Note(String id, String title, String content, Date addedDate, boolean live) {
        this.id = id;
        this.title = title;
        Content = content;
        this.addedDate = addedDate;
        this.live = live;
    }

    public Note() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return Content;
    }

    public boolean isLive() {
        return live;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
