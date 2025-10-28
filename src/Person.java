public class Person {
    private String name;
    private String adr;
    public Person(String name, String adr)
    {
        this.adr = adr;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adr='" + adr + '\'' +
                '}';
    }
}

