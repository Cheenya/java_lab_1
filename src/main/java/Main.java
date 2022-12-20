public class Main {
    public static void main(String[] args) {
        Container con = new Container();
        for(int i = 0; i<=15; i++) con.addB(i);

        System.out.println("\nКонтейнер до манипуляций:");
        con.printL();

        con.addB(17);
        con.addB(23);
        con.addB(65);
        con.addB(53);

        con.addF();
        System.out.println("\nДо удаления элементов:");
        System.out.print(con.getE(16) + " ");
        System.out.println(con.getE(8));

        con.delE(15);
        con.delE(7);

        System.out.println("\nПосле удаления элементов:");
        System.out.print(con.getE(16) + " ");
        System.out.println(con.getE(8));

        System.out.println("\nКонтейнер после манипуляций:");
        con.printL();
    }
}