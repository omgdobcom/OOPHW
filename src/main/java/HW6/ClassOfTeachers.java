package HW6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassOfTeachers<T extends Teacher> implements Iterable<Teacher> {

    private String nameGroup;
    private List<T> numberOfTeachers;
    private int index;

    public ClassOfTeachers(String nameGroup) {
        this.numberOfTeachers = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    public void add(T teacher){
        numberOfTeachers.add(teacher);
    }

    public int count() {
        return numberOfTeachers.size();
    }

    public T get(Integer index) {
        return numberOfTeachers.get(index);
    }

    public TeachersIterator TeachersIterator() {
        return new TeachersIterator(numberOfTeachers);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeachersIterator(numberOfTeachers);
    }

    private class TeachersIterator implements Iterator<Teacher> {
        private List<T> numberOfTeachers;
        private int counter;

        public TeachersIterator(List<T> numberOfTeachers) {
            this.numberOfTeachers = numberOfTeachers;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return index < numberOfTeachers.size() - 1;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return numberOfTeachers.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            numberOfTeachers.remove(numberOfTeachers.get(index));
        }
    }

}
