package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Stats {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "championid")
    private String championid;
    @Basic
    @Column(name = "hp")
    private Integer hp;
    @Basic
    @Column(name = "hpperlevel")
    private Integer hpperlevel;
    @Basic
    @Column(name = "mp")
    private Integer mp;
    @Basic
    @Column(name = "mpperlevel")
    private Integer mpperlevel;
    @Basic
    @Column(name = "movespeed")
    private Integer movespeed;
    @Basic
    @Column(name = "armor")
    private Integer armor;
    @Basic
    @Column(name = "armorperlevel")
    private Double armorperlevel;
    @Basic
    @Column(name = "spellblock")
    private Integer spellblock;
    @Basic
    @Column(name = "spellblockperlevel")
    private Double spellblockperlevel;
    @Basic
    @Column(name = "attackrange")
    private Integer attackrange;
    @Basic
    @Column(name = "hpregen")
    private Double hpregen;
    @Basic
    @Column(name = "hpregenperlevel")
    private Double hpregenperlevel;
    @Basic
    @Column(name = "mpregen")
    private Double mpregen;
    @Basic
    @Column(name = "mpregenperlevel")
    private Double mpregenperlevel;
    @Basic
    @Column(name = "crit")
    private Double crit;
    @Basic
    @Column(name = "critperlevel")
    private Double critperlevel;
    @Basic
    @Column(name = "attackdamage")
    private Double attackdamage;
    @Basic
    @Column(name = "attackdamageperlevel")
    private Double attackdamageperlevel;
    @Basic
    @Column(name = "attackspeedperlevel")
    private Double attackspeedperlevel;
    @Basic
    @Column(name = "attackspeed")
    private Double attackspeed;

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

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(Integer hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(Integer mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public Integer getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(Integer movespeed) {
        this.movespeed = movespeed;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(Double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public Integer getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(Integer spellblock) {
        this.spellblock = spellblock;
    }

    public Double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(Double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public Integer getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(Integer attackrange) {
        this.attackrange = attackrange;
    }

    public Double getHpregen() {
        return hpregen;
    }

    public void setHpregen(Double hpregen) {
        this.hpregen = hpregen;
    }

    public Double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(Double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public Double getMpregen() {
        return mpregen;
    }

    public void setMpregen(Double mpregen) {
        this.mpregen = mpregen;
    }

    public Double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(Double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public Double getCrit() {
        return crit;
    }

    public void setCrit(Double crit) {
        this.crit = crit;
    }

    public Double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(Double critperlevel) {
        this.critperlevel = critperlevel;
    }

    public Double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(Double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public Double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(Double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public Double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(Double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public Double getAttackspeed() {
        return attackspeed;
    }

    public void setAttackspeed(Double attackspeed) {
        this.attackspeed = attackspeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return id == stats.id && Objects.equals(championid, stats.championid) && Objects.equals(hp, stats.hp) && Objects.equals(hpperlevel, stats.hpperlevel) && Objects.equals(mp, stats.mp) && Objects.equals(mpperlevel, stats.mpperlevel) && Objects.equals(movespeed, stats.movespeed) && Objects.equals(armor, stats.armor) && Objects.equals(armorperlevel, stats.armorperlevel) && Objects.equals(spellblock, stats.spellblock) && Objects.equals(spellblockperlevel, stats.spellblockperlevel) && Objects.equals(attackrange, stats.attackrange) && Objects.equals(hpregen, stats.hpregen) && Objects.equals(hpregenperlevel, stats.hpregenperlevel) && Objects.equals(mpregen, stats.mpregen) && Objects.equals(mpregenperlevel, stats.mpregenperlevel) && Objects.equals(crit, stats.crit) && Objects.equals(critperlevel, stats.critperlevel) && Objects.equals(attackdamage, stats.attackdamage) && Objects.equals(attackdamageperlevel, stats.attackdamageperlevel) && Objects.equals(attackspeedperlevel, stats.attackspeedperlevel) && Objects.equals(attackspeed, stats.attackspeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, championid, hp, hpperlevel, mp, mpperlevel, movespeed, armor, armorperlevel, spellblock, spellblockperlevel, attackrange, hpregen, hpregenperlevel, mpregen, mpregenperlevel, crit, critperlevel, attackdamage, attackdamageperlevel, attackspeedperlevel, attackspeed);
    }
}
