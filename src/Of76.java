

import java.util.Arrays;

public class Of76 extends Clowns {
    public static void main(String[] args){
        Cat myCat = new Cat();
        MyAnnotation myAn = (MyAnnotation)myCat.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(myAn.huita() +" "+myAn.name()+" "+myAn.type());

    }
}

interface Nose{
    public int iMethod();
}

abstract class Picasso implements Nose{
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso {}

class Acts implements Nose{
    public int iMethod(){
        return 5;
    }
}