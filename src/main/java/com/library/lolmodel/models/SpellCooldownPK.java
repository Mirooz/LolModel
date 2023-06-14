package com.library.lolmodel.models;


import java.io.Serializable;
import java.util.Objects;

public class SpellCooldownPK implements Serializable {
    private int level;
    private String championName;
    private String letter;

    // Constructeurs, getters, setters, equals(), hashCode()...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpellCooldownPK that = (SpellCooldownPK) o;
        return level == that.level && Objects.equals(championName, that.championName) && Objects.equals(letter, that.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, championName, letter);
    }
}
