package OOP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();//Экземпляр класса
        cat.setName("Barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"petr", LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCircle();
        cat.toGo();
        Duck duck = new Duck();
        Fish fish = new Fish();
        duck.fly();
        fish.fly();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck);
        //System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());






    }
}
