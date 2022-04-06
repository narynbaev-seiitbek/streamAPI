package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<Animal> animals = getAnimals();

        Set<Animal> set = new HashSet<>(animals);

        List<Animal> list = new LinkedList<>(animals);
        list.add(2,new Animal("Snake",65,Classification.PREDATORY));


        Deque<Integer> in = new ArrayDeque<>();
        in.addFirst(4);
        in.addFirst(8);
        in.addFirst(7);
        in.addFirst(6);
        in.addFirst(1);
        for (Integer integer : in) {
            System.out.println(integer);
        }


    }
    public static List<Animal> getAnimals() {
        return List.of(
                new Animal("Lion", 8, Classification.PREDATORY),
                new Animal("Turtle", 15, Classification.OMNIVORS),
                new Animal("Eagle", 5, Classification.PREDATORY),
                new Animal("Cow", 3, Classification.HERBIVORES),
                new Animal("Dog", 4, Classification.OMNIVORS),
                new Animal("Sheep", 2, Classification.HERBIVORES),
                new Animal("Tiger", 12, Classification.PREDATORY),
                new Animal("Cat", 8, Classification.PREDATORY),
                new Animal("Cat", 8, Classification.PREDATORY));
    }
}
