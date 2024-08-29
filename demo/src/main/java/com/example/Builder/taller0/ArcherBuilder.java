package com.example.Builder.taller0;

import java.util.ArrayList;
import java.util.List;

public class ArcherBuilder implements CharacterBuilder {
    private String name;
    private String characterClass;
    private int level;
    private List<String> skills;
    private List<String> attributes;
    private List<String> inventory;
    private String description;
    private String nickName;
    private double money;

    public ArcherBuilder() {
        this.skills = new ArrayList<>();
        this.attributes = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    public void name(String name) {
        this.name = name;
    }

    public void characterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public void level(int level) {
        this.level = level;
    }

    public void skills(List<String> skills) {
        this.skills = skills;
    }

    public void attributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public void inventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public void description(String description) {
        this.description = description;
    }

    public void nickName(String nickName) {
        this.nickName = nickName;
    }

    public void money(double money) {
        this.money = money;
    }

    public Character build() {
        Character character = new Character();

        character.setName(name);
        character.setCharacterClass(characterClass);
        character.setLevel(level);
        character.setSkills(skills);
        character.setAttributes(attributes);
        character.setInventory(inventory);
        character.setDescription(description);
        character.setNickName(nickName);
        character.setMoney(money);
        return character;
    }
}
