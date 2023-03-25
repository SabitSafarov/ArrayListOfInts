package homework;

public interface ListOfInts {

    int size();
    int get(int index);
    void set(int index, int value);
    void insert(int index, int value);
    void remove(int index);
    void add(int value);
}
