package SEMINARI.sem2;
// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAminal(new Cat("Pashka", "Andrey", 4))
            .addAminal(new Dog("Sharik", "Andrey", 4))
            .addAnimal(new Swim("Kit", "Bob", 0, 15));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        
    }
    
}
