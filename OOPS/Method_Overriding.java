public class Method_Overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
        // Deer d2 = new Animal(); --> gives error
        // d2.eat(); 
        Animal a = new Deer();
        a.eat();
        Animal a1 = new Animal();
        a1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
