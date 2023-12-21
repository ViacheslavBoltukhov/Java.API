package scr.homeWork9;

import java.util.List;

public class Controller {
    private static PotokService potokService;

    public Controller(PotokService potokService) {
        Controller.potokService = potokService;
    }

    public static void SortPotok(List<Potok> potokList) {
        potokService.SortPotok(potokList);
    }
}
