public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("wooow");
    }
    public void greets(Dog d){
        System.out.println("woooooow");
    }
    public void greets(BigDog d){
        System.out.println("wooooooooow");
    }
}
