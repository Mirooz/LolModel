package com.library.lolmodel.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Spells {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
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
    @Column(name = "tooltip")
    private String tooltip;
    @Basic
    @Column(name = "maxrank")
    private Integer maxrank;
    @Basic
    @Column(name = "cooldown")
    private Object cooldown;
    @Basic
    @Column(name = "cooldownburn")
    private String cooldownburn;
    @Basic
    @Column(name = "cost")
    private Object cost;
    @Basic
    @Column(name = "costburn")
    private String costburn;
    @Basic
    @Column(name = "resource")
    private String resource;
    @Basic
    @Column(name = "rangeburn")
    private String rangeburn;
    @Basic
    @Column(name = "leveltip_label")
    private Object leveltipLabel;
    @Basic
    @Column(name = "leveltip_effect")
    private Object leveltipEffect;
    @Basic
    @Column(name = "effect")
    private Object effect;
    @Basic
    @Column(name = "effectburn")
    private Object effectburn;
    @Basic
    @Column(name = "costtype")
    private String costtype;
    @Basic
    @Column(name = "maxammo")
    private Integer maxammo;
    @Basic
    @Column(name = "range")
    private Object range;
    @Basic
    @Column(name = "image_id")
    private Integer imageId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Integer getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(Integer maxrank) {
        this.maxrank = maxrank;
    }

    public Object getCooldown() {
        return cooldown;
    }

    public void setCooldown(Object cooldown) {
        this.cooldown = cooldown;
    }

    public String getCooldownburn() {
        return cooldownburn;
    }

    public void setCooldownburn(String cooldownburn) {
        this.cooldownburn = cooldownburn;
    }

    public Object getCost() {
        return cost;
    }

    public void setCost(Object cost) {
        this.cost = cost;
    }

    public String getCostburn() {
        return costburn;
    }

    public void setCostburn(String costburn) {
        this.costburn = costburn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRangeburn() {
        return rangeburn;
    }

    public void setRangeburn(String rangeburn) {
        this.rangeburn = rangeburn;
    }

    public Object getLeveltipLabel() {
        return leveltipLabel;
    }

    public void setLeveltipLabel(Object leveltipLabel) {
        this.leveltipLabel = leveltipLabel;
    }

    public Object getLeveltipEffect() {
        return leveltipEffect;
    }

    public void setLeveltipEffect(Object leveltipEffect) {
        this.leveltipEffect = leveltipEffect;
    }

    public Object getEffect() {
        return effect;
    }

    public void setEffect(Object effect) {
        this.effect = effect;
    }

    public Object getEffectburn() {
        return effectburn;
    }

    public void setEffectburn(Object effectburn) {
        this.effectburn = effectburn;
    }

    public String getCosttype() {
        return costtype;
    }

    public void setCosttype(String costtype) {
        this.costtype = costtype;
    }

    public Integer getMaxammo() {
        return maxammo;
    }

    public void setMaxammo(Integer maxammo) {
        this.maxammo = maxammo;
    }

    public Object getRange() {
        return range;
    }

    public void setRange(Object range) {
        this.range = range;
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
        Spells spells = (Spells) o;
        return Objects.equals(id, spells.id) && Objects.equals(championid, spells.championid) && Objects.equals(name, spells.name) && Objects.equals(description, spells.description) && Objects.equals(tooltip, spells.tooltip) && Objects.equals(maxrank, spells.maxrank) && Objects.equals(cooldown, spells.cooldown) && Objects.equals(cooldownburn, spells.cooldownburn) && Objects.equals(cost, spells.cost) && Objects.equals(costburn, spells.costburn) && Objects.equals(resource, spells.resource) && Objects.equals(rangeburn, spells.rangeburn) && Objects.equals(leveltipLabel, spells.leveltipLabel) && Objects.equals(leveltipEffect, spells.leveltipEffect) && Objects.equals(effect, spells.effect) && Objects.equals(effectburn, spells.effectburn) && Objects.equals(costtype, spells.costtype) && Objects.equals(maxammo, spells.maxammo) && Objects.equals(range, spells.range) && Objects.equals(imageId, spells.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, championid, name, description, tooltip, maxrank, cooldown, cooldownburn, cost, costburn, resource, rangeburn, leveltipLabel, leveltipEffect, effect, effectburn, costtype, maxammo, range, imageId);
    }
}
