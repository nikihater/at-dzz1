package abstract_class;


import pets.Cat;

public abstract class Pet {
    public static void main(String[] args) {


        Cat cat1 = new Cat();
        cat1.setName("Штопор");
        cat1.setHungry(10);

        Cat cat2 = new Cat();
        cat2.setName("Вилка");
        cat2.setHungry(18);




    }
    public String say(){

        return null;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
