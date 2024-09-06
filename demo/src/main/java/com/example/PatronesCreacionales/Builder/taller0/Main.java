package com.example.PatronesCreacionales.Builder.taller0;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterBuilder builder = new ArcherBuilder();
        CharacterCreator creator = new CharacterCreator(builder);

        creator.constructor("juanitoAlcachofa", "Archer", 0, List.of(""), List.of("hawk eye"), List.of("basic bow", "arrows"), "great shooter with good aim", "alcachofa", 1000);

        Character Archer = builder.build();
        System.out.println("Archer create " + Archer);
    }
    
}
