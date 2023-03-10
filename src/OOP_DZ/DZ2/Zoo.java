package OOP_DZ.DZ2;

import OOP_DZ.DZ2.Clases.*;
import OOP_DZ.DZ2.Interfaces.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private final Wolf wolf1 = new Wolf("Akella", 2, 30, "blue",
            "Zoo Cage№2", LocalDate.of(2018, 1, 1), true);
    private final Chiken chicken1 = new Chiken("Margo", 0.2, 1, "yellow");
    private final Chiken chicken2 = new Chiken("Stella", 0.2, 1, "yellow");
    private final Stork stork1 = new Stork("Dimitriy", 0.6, 4, "Grey", 500);
    private final Dog dog1 = new Dog("Graf Velinsky", 0.8, 20, "Brown", "Graf", "Doberman", "Brown", true,
            LocalDate.of(2015, 1, 1), false);
    private final Tiger tiger1 = new Tiger("Alex", 1.5, 160, "Yellow", "Zoo Cage№1", LocalDate.of(2010, 1, 1));
    private final Cat cat1 = new Cat("Cassie-Mur", 0.2, 1.2, "Green-Gray", "Cassie", "Canadian Sphinx", "",
            true, LocalDate.of(2008, 1, 1), false);
    //=================================================================================================================
    private final Cat cat2 = new Cat("Bonya Lane", 0.25, 1.4, "Yellow-Green", "Bonya", "british shorthair", "Gray",
            true, LocalDate.of(20018, 4, 2), true);
    private final Wolf wolf2 = new Wolf("Ronald", 1.8, 28, "blue-Grey",
            "Riverdale Forests", LocalDate.of(2019, 2, 4),false);
    private List<Animal> zoolist = new ArrayList<>(Arrays.asList(wolf1, chicken1, chicken2,
            stork1, dog1, tiger1, cat1));
    private List<Animal> tempZoolist = new ArrayList<>(Arrays.asList(cat2, wolf2));

    public void showAnimalsId(List<Animal> animalList) {
        for (Animal animal : animalList) {
            System.out.println(animal.getClass().getSimpleName() + " " +
                    animal.getNameInZoo() + " id = " + animal.getId());
        }
    }

    public void addAnimal(Integer index) {
        boolean flag = false;
        for (Animal animal : tempZoolist) {
            if (animal.getId() == index) {
                flag = true;
                zoolist.add(animal);
                tempZoolist.remove(animal);
                break;
            }
        }
        if (!flag){
            System.out.println("Animal with your index is absent");
        }
    }


    public void removeAnimal(Integer index) {
        boolean flag = false;
        for (Animal animal : zoolist) {
            if (animal.getId() == index) {
                flag = true;
                zoolist.remove(animal);
                tempZoolist.add(animal);
                break;
            }
        }
        if (!flag){
            System.out.println("Animal with your index is absent");
        }
    }

    public void getInfoAboutAnimal(Integer index) {
        boolean flag = false;
        for (Animal animal : zoolist) {
            if (animal.getId() == index) {
                flag = true;
                System.out.println(animal.info());
                break;
            }
        }
        if (!flag){
            System.out.println("Animal with your index is absent");
        }
    }

    public void getInfoAboutAllAnimal() {
        for (Animal animal : zoolist) {
            System.out.println(animal.info());
        }
    }

    public void makeAnimalNoize(Integer index) {
        boolean flag = false;
        for (Animal animal : zoolist) {
            if (animal.getId() == index) {
                flag = true;
                animal.makeNoize();
                break;
            }
        }
        if (!flag){
            System.out.println("Animal with your index is absent");
        }
    }

    public void makeAllNoize() {
        for (Animal animal : zoolist) {
            animal.makeNoize();
        }
    }

    public void whatAnimalDo(Integer index) {
        boolean flag = false;
        for (Animal animal : zoolist) {
            if (animal.getId() == index) {
                if (animal instanceof Fly) {
                    ((Fly) animal).fly();
                }
                if (animal instanceof Hunting) {
                    ((Hunting) animal).goHunting();
                }
                if (animal instanceof ShowAffection) {
                    System.out.println(((ShowAffection) animal).showAffection());
                }
                if (animal instanceof Train) {
                    ((Train) animal).train();
                }
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Animal with your index is absent");
        }
    }

    public List<Animal> getZoolist() {
        return zoolist;
    }

    public List<Animal> getTempZoolist() {
        return tempZoolist;
    }
}
