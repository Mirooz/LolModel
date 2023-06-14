package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Champions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "key")
    private Integer key;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Champions{" +
                "id='" + id + '\'' +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", lore='" + lore + '\'' +
                ", blurb='" + blurb + '\'' +
                ", partype='" + partype + '\'' +
                ", image=" + image +
                ", allytips=" + allytips +
                ", enemytips=" + enemytips +
                ", tags=" + tags +
                ", infoDefense=" + infoDefense +
                ", infoMagic=" + infoMagic +
                ", infoDifficulty=" + infoDifficulty +
                ", infoAttack=" + infoAttack +
                '}';
    }

    @Basic
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "lore")
    private String lore;

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    @Basic
    @Column(name = "blurb")
    private String blurb;

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    @Basic
    @Column(name = "partype")
    private String partype;

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    @Basic
    @Column(name = "allytips")
    private Object allytips;

    public Object getAllytips() {
        return allytips;
    }

    public void setAllytips(Object allytips) {
        this.allytips = allytips;
    }

    @Basic
    @Column(name = "enemytips")
    private Object enemytips;

    public Object getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(Object enemytips) {
        this.enemytips = enemytips;
    }

    @Basic
    @Column(name = "tags")
    private Object tags;

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "info_defense")
    private Integer infoDefense;

    public Integer getInfoDefense() {
        return infoDefense;
    }

    public void setInfoDefense(Integer infoDefense) {
        this.infoDefense = infoDefense;
    }

    @Basic
    @Column(name = "info_magic")
    private Integer infoMagic;

    public Integer getInfoMagic() {
        return infoMagic;
    }

    public void setInfoMagic(Integer infoMagic) {
        this.infoMagic = infoMagic;
    }

    @Basic
    @Column(name = "info_difficulty")
    private Integer infoDifficulty;

    public Integer getInfoDifficulty() {
        return infoDifficulty;
    }

    public void setInfoDifficulty(Integer infoDifficulty) {
        this.infoDifficulty = infoDifficulty;
    }

    @Basic
    @Column(name = "info_attack")
    private Integer infoAttack;

    public Integer getInfoAttack() {
        return infoAttack;
    }

    public void setInfoAttack(Integer infoAttack) {
        this.infoAttack = infoAttack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Champions champions = (Champions) o;
        return Objects.equals(id, champions.id) && Objects.equals(key, champions.key) && Objects.equals(name, champions.name) && Objects.equals(title, champions.title) && Objects.equals(lore, champions.lore) && Objects.equals(blurb, champions.blurb) && Objects.equals(partype, champions.partype) && Objects.equals(image, champions.image) && Objects.equals(allytips, champions.allytips) && Objects.equals(enemytips, champions.enemytips) && Objects.equals(tags, champions.tags) && Objects.equals(infoDefense, champions.infoDefense) && Objects.equals(infoMagic, champions.infoMagic) && Objects.equals(infoDifficulty, champions.infoDifficulty) && Objects.equals(infoAttack, champions.infoAttack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key, name, title, lore, blurb, partype, image, allytips, enemytips, tags, infoDefense, infoMagic, infoDifficulty, infoAttack);
    }
}
