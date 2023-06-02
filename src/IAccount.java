public interface IAccount {

    void Withdraw(double value);

    void deposit (double value);

    void  transfer (double value, Account DestinationAccount);

    void printInfo();
}
