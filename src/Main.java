public class Main {
    public static void main(String[] args) {
        Auteur a1 = new Auteur("n1","p1","em1","tel1",40,1235685);
        System.out.println(a1.toString());
        Adherent ad1 = new Adherent("n2","p2","em2","tel2",30,2345689);
        System.out.println(ad1.toString());
        Livre livre1=new Livre("titre1",a1);
        System.out.println(livre1.toString());
    }
}