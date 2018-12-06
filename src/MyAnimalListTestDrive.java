public class MyAnimalListTestDrive {
    public static void main(String[] args) {
        MyAnimalList m = new MyAnimalList();
        Cat c = new Cat();
        Dog d = new Dog();
        m.add(c);
        m.add(d);
        d.roam();
        Canine cn = d;
        cn.roam();

    }
}
