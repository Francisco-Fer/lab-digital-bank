public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;


    public Account(Client client){
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }


    @Override
    public void Withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account DestinationAccount) {
        this.Withdraw(value);
        DestinationAccount.deposit(value);
    }

    public void printCommonInfo(){
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Número: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }


    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


}
