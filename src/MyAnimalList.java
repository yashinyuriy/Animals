public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;
    public void add(Animal a)
    {
        if(nextIndex < animals.length)
        {
            animals[nextIndex] = a;
            System.out.println("Animal is added to a place "+nextIndex);
            nextIndex++;
        }
    }

    public boolean remove (int index){
        if(index<0 || index>=animals.length) return false;
        else{
            animals[index] = null;
            return true;
        }
    }
}
