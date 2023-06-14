package com.library.lolmodel.models;

import java.io.Serializable;
import java.util.Objects;

public class SpellEffectPK implements Serializable {
    private String championName;
    private String letter;

    // Constructeur par défaut
    public SpellEffectPK() {
    }

    public SpellEffectPK(String championName, String letter) {
        this.championName = championName;
        this.letter = letter;
    }

    // Getters et Setters

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    // Equals et HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpellEffectPK that = (SpellEffectPK) o;
        return Objects.equals(championName, that.championName) && Objects.equals(letter, that.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championName, letter);
    }
}
