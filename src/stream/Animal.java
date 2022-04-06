package stream;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private Classification classification;

    public Animal() {
    }

    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name)
                && classification == animal.classification;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classification);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                '}'+"\n";
    }
}
