package src.seminar13.task2;

// Шаг 4: Создание конкретных фабрик для каждой фигуры.
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
