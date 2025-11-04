public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog d){
        System.out.println("Woooof");
    }
}
