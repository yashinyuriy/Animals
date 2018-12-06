public class MyDogListTestDrive {
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.name = "Vasya";
        Dog d2 = new Dog();
        d2.name = "Shurik";
        Dog d3 = new Dog();
        d3.name = "Hui Pushistiy";
        Dog d4 = new Dog();
        d4.name = "Sifoznik";
        Dog d5 = new Dog();
        d5.name = "Klitor";
        MyDogList m = new MyDogList();
        m.add(d1);
        m.add(d2);
        m.add(d3);
        m.add(d4);
        m.add(d5);
        m.readDogList();

    }
}
