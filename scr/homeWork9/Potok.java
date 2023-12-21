package scr.homeWork9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok implements Iterable<StudentGroup> {
    private final List<StudentGroup> groups;

    public Potok() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

}
