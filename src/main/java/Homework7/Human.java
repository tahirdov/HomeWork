package Homework7;

public class Human {
    private static Pet pet;
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Human father;
    private Human mother;
    private String[][] schedule;

    Human(String name, String surname, int year, int iq,
          Human father, Human mother, String[][] schedule, Pet pet) {
        this(name, surname, year);
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
        Human.pet = pet;
    }

    Human(String name, String surname, int year) {
        this();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    private Human() {
        super();
    }

    public static void greetPet() {
        System.out.printf("Hello, %s", pet.getNickname());
    }


    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    Human getMother() {
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
        Human.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{name = " + getName() + ", surname = " + getSurname() +
                ", father = " + getFather() + ", mother = " + getMother() +
                ", year = " + getYear() + ", pet " + getPet() + "}";
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize worked in Human class");
    }
}
