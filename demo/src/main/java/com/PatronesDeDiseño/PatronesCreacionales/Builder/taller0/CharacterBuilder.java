package com.PatronesDeDiseño.PatronesCreacionales.Builder.taller0;

import java.util.List;

public interface CharacterBuilder {
    void name(String name);

    void characterClass(String characterClass);

    void level(int level);

    void skills(List<String> skills);

    void attributes(List<String> attributes);

    void inventory(List<String> inventory);

    void description(String description);

    void nickName(String nickName);

    void money(double money);

    Character build();
}
