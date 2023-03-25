package homework;

public class ArrayListOfInts implements ListOfInts {

    private int size;
    private int[] array;

    public ArrayListOfInts() {
        this.size = 0;
        this.array = new int[size];
    }

    private boolean isCorrectIndex(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        if (!isCorrectIndex(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        return array[index];
    }

    @Override
    public void set(int index, int value) {
        if (!isCorrectIndex(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        array[index] = value;
    }

    @Override
    public void insert(int index, int value) {
        if (!isCorrectIndex(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        int [] copyArray = new int[size + 1];
        System.arraycopy(array, index, copyArray, index + 1, size - index);
        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }

        array = copyArray;
        ++size;
        array[index] = value;
    }

    @Override
    public void remove(int index) {
        if (!isCorrectIndex(index)) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        int [] copyArray = new int[size - 1];
        System.arraycopy(array, index + 1, copyArray, index, size - index - 1);
        for (int i = 0; i < index; i++) {
            copyArray[i] = array[i];
        }
        array = copyArray;
        size--;

    }

    @Override
    public void add(int value) {
        if (size == 0) {
            size++;
            array = new int[size];
            array[0] = value;
            return;
        }
        int [] copyArray = new int[size + 1];
        System.arraycopy(array, 0, copyArray, 0, size);
        array = copyArray;
        ++size;
        array[size - 1] = value;

    }

    public String toString() {
        StringBuilder resault = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            resault.append(array[i] + ", ");
        }
        resault.append(array[size - 1]);
        resault.append("]");
        return resault.toString();
    }
}