public class Classroom {
    public static void main(String[] args) {
        Wilder valou = new Wilder("Valérian", true);
        Wilder val = new Wilder("Valentin", true);
        Wilder ben = new Wilder("Benjamin", false);
        Wilder alex = new Wilder("Alexandra", false);
        System.out.println(valou.whoAmI());
        System.out.println(val.whoAmI());
        System.out.println(ben.whoAmI());
        System.out.println(alex.whoAmI());
    }
}