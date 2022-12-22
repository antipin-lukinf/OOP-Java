package SEMINARI.sem2;
// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAminal(new Cat("Pashka", "Andrey", 4))
            .addAminal(new Dog("Sharik", "Andrey", 4))
            .addAminal(new Duck("Donald", "Bill", 2))
            .addAminal(new Eagle("Grud", "Ivan", 2));
            // .addAnimal(new Swim("Kit", "Bob", 0));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());

        for (Runable i:zoo.getRunables()){       //определение самого быстрого
            System.out.println(i.runSpeed());
        }

        System.out.println(zoo.getChampionSpeed());
        System.out.println("-----------------------");
        
        for (Flyable i:zoo.getFlyables()){       //определение самого быстрого
            System.out.println(i.flySpeed());
        }

        for (SwimSpeed i:zoo.getSwimSpeed()){       //определение самого быстрого
            System.out.println(i.swimSpeed());
        }

        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());
    }
    
}
