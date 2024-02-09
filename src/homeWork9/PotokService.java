package src.homeWork9;

import java.util.List;

public class PotokService {
    public void SortPotok(List<Potok> potokList) {
        potokList.sort(new StreamComparator());
    }
}
