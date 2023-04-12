public class Wilder {
    public String firstName;
    public boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean getAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmi() {
        return "My name is " + this.firstName + " and I'm " + (this.aware ? "aware" : "not aware");

    }

    public static void main(String[] args) {
        Wilder bla = new Wilder("bla", true);
        System.out.println(bla.whoAmi());
    }
}