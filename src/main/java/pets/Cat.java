package pets;


private String name;
private int hungry;
private static int countPet;


public class Cat {
countPet++;
}

    public Cat(String name, int hungry) {
        countPet++;
        this.name = name;
        this.hungry = hungry;
    }

    ////2-nd
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
////2-nd



    public static int getCountPet() {
        return countPet;
    }

    public static void setCountPet(int countPet) {
        Cat.countPet = countPet;









}
