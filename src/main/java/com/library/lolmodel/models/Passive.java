package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Passive {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "championid")
    private String championid;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "image_id")
    private Integer imageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChampionid() {
        return championid;
    }

    public void setChampionid(String championid) {
        this.championid = championid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passive passive = (Passive) o;
        return id == passive.id && Objects.equals(championid, passive.championid) && Objects.equals(name, passive.name) && Objects.equals(description, passive.description) && Objects.equals(imageId, passive.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, championid, name, description, imageId);
    }
}
