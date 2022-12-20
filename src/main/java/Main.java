public class Main {
    public static void main(String[] args) {
        Container con = new Container();
        for(int i = 0; i<=15; i++) con.addB(i);

        con.printL();

        con.addB(17);
        con.addB(23);
        con.addB(65);
        con.addB(53);

        con.addF();

        con.delE(15);
        con.delE(7);

        con.printL();
    }
}