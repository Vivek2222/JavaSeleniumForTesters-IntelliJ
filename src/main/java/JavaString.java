public class JavaString {

    public static void main(String[] args) {

        String name = new String("Vivek");

        String lastName= "Polos";

        System.out.println(lastName.length()); //4
        System.out.println(name.charAt(2)); //v
        System.out.println(name.toLowerCase()); //vivek
        System.out.println(lastName.substring(2, 4)); //lo

    }
}
