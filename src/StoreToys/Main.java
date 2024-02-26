package src.StoreToys;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Плюшевый мишка", 30);
        Toy toy2 = new Toy(1, "Конструктор металлический", 25);
        Toy toy3 = new Toy(2, "Квадрокоптер на пульте управления", 5);
        Toy toy4 = new Toy(3, "Пазл", 40);
        Toy toy5 = new Toy(4, "Пластилин", 50);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }


}