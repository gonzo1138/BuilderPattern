public class Main {

    public static void main(String[] args) {

        Person p = new PersonBuilder().addName("Fred F.").addGeburtstag("4-4-1984").addLieblingsfarbe("blau").build();
        Person q = new PersonBuilder().addName("Q Anon").addGeburtstag("1-1-1").addLieblingsfarbe("lila").build();

        System.out.println(p);
        System.out.println(q);
    }
}
