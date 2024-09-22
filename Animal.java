class Animal {
    public Animal() {
        System.out.println("create animal");
    }

    public void sound(){
        System.out.println("animal make a sound");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete animal");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("dog");
    }

    @Override
    public void sound(){
        System.out.println("dog bark");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete dog");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("cat");
    }

    @Override
    public void sound(){
        System.out.println("cat meows");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete cat");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal an = new Dog();  // Polymorphic variable
        an = c;
        
        a.sound(); // Output: animal make a sound
        an.sound(); // Output: cat meows (Polymorphism)
        d.sound(); // Output: dog bark
        c.sound(); // Output: cat meows
    }
}
