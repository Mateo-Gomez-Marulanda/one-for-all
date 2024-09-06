package com.example.PatronesCreacionales.Builder.taller0;

import java.util.List;

public class CharacterCreator {
    private CharacterBuilder builder;

    public CharacterCreator(CharacterBuilder builder) {
        this.builder = builder;
    }

    public Character constructor(String name, String CharacterCLass, int level, List<String> skills,
            List<String> attributes, List<String> inventory, String description, String nickName, double money) {

        builder.name(name);
        builder.characterClass(CharacterCLass);
        builder.level(level);
        builder.skills(skills);
        builder.attributes(attributes);
        builder.inventory(inventory);
        builder.description(description);
        builder.nickName(nickName);
        builder.money(money);
        return builder.build();

    }
}
