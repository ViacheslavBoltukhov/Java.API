package src.seminar5.Task1;
/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Main {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addPassports("123456", "Иванов");
        passports.addPassports("321456", "Васильев");
        passports.addPassports("234561", "Петрова");
        passports.addPassports("234432", "Иванов");
        passports.addPassports("654321", "Петрова");
        passports.addPassports("345678", "Иванов");
        System.out.println(passports);
        System.out.println(passports.searchId("Иванов"));
    }
}
