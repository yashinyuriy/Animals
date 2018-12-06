public class MyDogList {
    private Dog[] spisokSobak = new Dog[1];
    private int ukazatel = 0;
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d)
    {
       spisokSobak[ukazatel] = d;
       ukazatel++;
       Dog[] newSpisok = new Dog[ukazatel+1];
       for(int i = 0; i < ukazatel; i++)
       {
           newSpisok[i] = spisokSobak[i];
       }
       spisokSobak = newSpisok;
    }

    public void add2(Dog d)
    {
        if(nextIndex < dogs.length)
        {
            dogs[nextIndex] = d;
            System.out.println("Dog is added to a place "+nextIndex);
            nextIndex++;
        }
    }
    public void readDogList(){
        for(Dog viviod : spisokSobak){
            System.out.println(viviod.name);
        }
    }
}
