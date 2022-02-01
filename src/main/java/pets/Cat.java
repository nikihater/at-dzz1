package pets;

public class Cat {





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    private int hungry;



    private static int countPet;

    public static int getCountPet() {
        return countPet;
    }

    public static void setCountPet(int countPet) {
        Cat.countPet = countPet;

    }







}
