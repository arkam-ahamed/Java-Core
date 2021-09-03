public class Main {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("bulldog");
        System.out.println(dog.getName());



    }
    public static class Dog extends Animal{
    }
}
