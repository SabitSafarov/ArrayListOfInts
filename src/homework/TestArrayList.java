package homework;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayListOfInts list = new ArrayListOfInts();
        list.add(75);
        list.add(34);
        list.add(86);
        list.add(16);
        list.add(99);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(4);
        list.remove(1);
        System.out.println(list);
        list.add(4);
        list.set(3, 41);
        System.out.println(list);
        list.insert(1, 54);
        list.insert(0, 80);
        list.insert(4, 45);

        System.out.println(list);
        System.out.println(list.size());

    }
}
