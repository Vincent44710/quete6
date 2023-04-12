public class Classroom {
    public static void main(String[] args) {
        Wilder samy = new Wilder("Samy", true);
        Wilder denis = new Wilder("Denis", false);
        Wilder alban = new Wilder("Alban", true);
        Wilder guillaume = new Wilder("Guillaume", false);
        System.out.println(samy.whoAmi());
        System.out.println(denis.whoAmi());
        System.out.println(alban.whoAmi());
        System.out.println(guillaume.whoAmi());
    }
}
