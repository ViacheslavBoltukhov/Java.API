package src.seminar13.task3;

public class Main {
    public static void main(String[] args) {
        // Используем Строителя для пошагового создания объекта "Компьютер".
        Computer computer = new Computer.Builder()
                .setProcessor("Intel Core i7")
                .setMemory("16GB DDR4")
                .setHardDisk("512GB SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3070")
                .build();

        // Выводим информацию о компьютере.
        System.out.println("Процессор: " + computer.getProcessor());
        System.out.println("Оперативная память: " + computer.getMemory());
        System.out.println("Жесткий диск: " + computer.getHardDisk());
        System.out.println("Графическая карта: " + computer.getGraphicsCard());
    }
}
