package scr.seminar12.task1;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("Текст1");
        journal.addEntry("Text2");
        Printer printer = new Printer(journal);
        printer.print();
        journal.removeEntry("Text2");
        printer.print();
    }
}
