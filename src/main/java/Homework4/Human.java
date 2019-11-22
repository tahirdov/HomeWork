package Homework4;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Human father;
    private Human mother;
    private String[][] schedule;
    private Pet pet;

    Human(String name, String surname, int year, int iq, Human father,
          Human mother, String[][] schedule, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
        this.pet = pet;
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {

    }

    Human(String name, String surname, int year, int iq, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
    }

    void greetPet() {
        System.out.println("Hello " + pet.getNickname() + "!");
    }

    void describePet() {
        System.out.print("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is ");
        if (pet.getTrickLevel() < 50)
            System.out.println("almost not sly.");
        else System.out.println("very sly.");
    }


    public String toString() {
        return String.format("Human{name = %s, surname=%s, year = %d, iq = %d, schedule = %s",
                name, surname, year, iq, Arrays.toString(schedule));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfYear() {
        return year;
    }

    public void setDateOfYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
