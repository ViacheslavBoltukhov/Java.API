package scr.Seminar8.Task4;

public class DataAnalyzer implements DataProcessor {
    private String data;

    @Override
    public void readData(String data) {
        this.data = data;
    }

    @Override
    public void processData() {
        // Обработка данных (здесь можно добавить логику)
    }
}

 class ReportGenerator implements DataProcessor {
    private String data;

    @Override
    public void readData(String data) {
        this.data = data;
    }

    @Override
    public void processData() {
        // Генерация отчета на основе данных (здесь можно добавить логику)
    }

    @Override
    public void printReport() {
        System.out.println("Отчет сгенерирован и готов к печати.");
    }
}