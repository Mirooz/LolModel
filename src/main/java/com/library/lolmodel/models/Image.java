package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Image {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "sprite")
    private String sprite;
    @Basic
    @Column(name = "groupname")
    private String groupname;
    @Basic
    @Column(name = "x")
    private Integer x;
    @Basic
    @Column(name = "y")
    private Integer y;
    @Basic
    @Column(name = "w")
    private Integer w;
    @Basic
    @Column(name = "h")
    private Integer h;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return id == image.id && Objects.equals(fullname, image.fullname) && Objects.equals(sprite, image.sprite) && Objects.equals(groupname, image.groupname) && Objects.equals(x, image.x) && Objects.equals(y, image.y) && Objects.equals(w, image.w) && Objects.equals(h, image.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, sprite, groupname, x, y, w, h);
    }
}
