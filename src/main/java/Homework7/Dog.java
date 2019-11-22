package Homework7;

import java.util.Arrays;

public class Dog extends Pet implements PetBehaviour {
    Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void describe() {

        System.out.printf("Species: %s Name: %s Age: %d Trick level: %d, Habits: %s\n",
                getSpecies(), getNickname(), getAge(), getTrickLevel(), Arrays.toString(getHabits()));
    }

    @Override
    public void respond() {
        System.out.println("**bark bark**");
    }

    @Override
    public void foul() {
        System.out.println("I mess up and hoooman cleans");
    }
}
