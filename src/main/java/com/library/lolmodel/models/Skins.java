package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Skins {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "championid")
    private String championid;
    @Basic
    @Column(name = "num")
    private Integer num;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "chromas")
    private Boolean chromas;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChromas() {
        return chromas;
    }

    public void setChromas(Boolean chromas) {
        this.chromas = chromas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skins skins = (Skins) o;
        return id == skins.id && Objects.equals(championid, skins.championid) && Objects.equals(num, skins.num) && Objects.equals(name, skins.name) && Objects.equals(chromas, skins.chromas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, championid, num, name, chromas);
    }
}
