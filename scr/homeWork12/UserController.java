package scr.homeWork12;

public interface UserController<T extends User> {
    void create(String surname, String firstname, String patronymic);
}
