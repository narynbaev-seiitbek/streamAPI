package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

//        List<Animal> predators = new ArrayList<>();
//
//        for (Animal animal : animals) {
//            if (animal.getClassification().equals(Classification.PREDATORY)) {
//                predators.add(animal);
//            }
//        }
//
//        predators.forEach(System.out::println);

        List<Animal> predators = animals.stream().filter(animal -> animal.getClassification()
                .equals(Classification.PREDATORY)).collect(Collectors.toList());
        //predators.forEach(System.out::println);

        List<Animal> sortedByAge = animals.stream().sorted(Comparator.comparing(Animal::getAge).reversed())
                .collect(Collectors.toList());
        //sortedByAge.forEach(System.out::println);

        boolean allMatch = animals.stream().allMatch(animal -> animal.getAge() < 20);
        //System.out.println(allMatch);

        boolean anyMatch = animals.stream().anyMatch(animal -> animal.getAge() > 15);
        // System.out.println(anyMatch);

        boolean noneMatch = animals.stream().noneMatch(animal -> animal.getName().equals("Lion"));
        //System.out.println(noneMatch);

        animals.stream().max(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

        // animals.stream().min(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);

//        Map<Classification, List<Animal>> classificationListMap = animals.stream()
//                .collect(Collectors.groupingBy(Animal::getClassification));
//        classificationListMap.forEach((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//            System.out.println();
//        });

        Optional<String> oldestPredator = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATORY))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        oldestPredator.ifPresent(System.out::println);

        Set<String> collect = animals.stream().map(Animal::getName).collect(Collectors.toSet());
        collect.forEach(System.out::println);


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
                new Animal("Cat", 8, Classification.PREDATORY));
    }
}
