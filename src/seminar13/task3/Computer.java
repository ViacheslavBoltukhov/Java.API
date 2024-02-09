package src.seminar13.task3;

// Класс, представляющий объект "Компьютер".
public class Computer {
    private String processor;
    private String memory;
    private String hardDisk;
    private String graphicsCard;

    // Приватный конструктор, чтобы объект "Компьютер" можно было создать только с помощью Строителя.
    private Computer() {}

    // Геттеры для компонентов компьютера.
    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Вложенный статический класс "Строитель" для создания объектов "Компьютер".
    public static class Builder {
        private Computer computer;

        // Конструктор Строителя, создает новый объект "Компьютер".
        public Builder() {
            computer = new Computer();
        }

        // Методы для настройки компонентов компьютера.
        public Builder setProcessor(String processor) {
            computer.processor = processor;
            return this;
        }

        public Builder setMemory(String memory) {
            computer.memory = memory;
            return this;
        }

        public Builder setHardDisk(String hardDisk) {
            computer.hardDisk = hardDisk;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }

        // Метод для построения объекта "Компьютер".
        public Computer build() {
            return computer;
        }
    }
}
