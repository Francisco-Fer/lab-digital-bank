public class SavingAccount extends Account {

    public SavingAccount(Client client) {
        super(client);
    }

    @Override
    public void printInfo() {
        System.out.println("====Extrato Conta Poupança");
        super.printCommonInfo();
    }

}
