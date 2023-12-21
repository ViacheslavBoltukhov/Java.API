package scr.homeWork9;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potok> {
    @Override
    public int compare(Potok potok1, Potok potok2) {
        return potok1.iterator().next().getName().compareTo(potok2.iterator().next().getName());
    }
}



