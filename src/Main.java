public class Main {

    public static void main (String[] args){
        Client rodrigo = new Client();
        rodrigo.setName("Rodigo");

        Client amanda = new Client();
        amanda.setName("Amanda");

        Account ca = new CheckingAccount(rodrigo);
        Account sa = new SavingAccount(amanda);

        ca.deposit(100);
        sa.deposit(100);

        ca.printInfo();
        sa.printInfo();

        ca.transfer(50, sa);

        System.out.println("\n ====Extrato Após Transfrência==== \n");

        ca.printInfo();
        sa.printInfo();
    }
}
