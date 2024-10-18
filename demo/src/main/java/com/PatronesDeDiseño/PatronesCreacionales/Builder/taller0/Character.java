package com.PatronesDeDiseño.PatronesCreacionales.Builder.taller0;

import java.util.ArrayList;
import java.util.List;

public class Character {
    
    private String name;
    private String characterClass;
    private int level;
    private List<String> skills;
    private List<String> attributes;
    private List<String> inventory;
    private String description;
    private String nickName;
    private double money;

    public Character() {
        this.skills = new ArrayList<>();
        this.attributes = new ArrayList<>();
        this.inventory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Personaje {" +
                " nombre: " + name + '\'' +
                ", clase de personaje: " + characterClass + '\'' +
                ", nivel: " + level +
                ", habilidades: " + skills + '\'' +
                ", atributos: " + attributes + '\'' +
                ", inventario: " + inventory +
                ", descripcion: " + description + '\'' +
                ", apodo: " + nickName + '\'' +
                ", dinero: " + money +
                '}';
    }
}
