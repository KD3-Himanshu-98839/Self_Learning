#include <iostream>
using namespace std;
class BankAccount
{
private:
    long accountNumber;
    string accountHolderName;
    double balance = 0.0;

public:
    void deposit(double deposit)
    {
        balance = balance + deposit;
    }
    void withdraw(double withdraw)
    {
        balance = balance - withdraw;
    }
    double displayBalance()
    {
        return balance;
    }
};

int menuList(void)
{
    int choice;

    cout << "1. Deposit" << endl;
    cout << "2. Withdraw" << endl;
    cout << "3. Check the Balance" << endl;
    cout << "4. Exits" << endl;
    cin >> choice;
    return choice;
}

int main()
{

    BankAccount B1;
    int choice;

    while ((choice = menuList())!=4)
    {
        switch (choice)
        {
        case 1:{
            int deposit;
            cout<<"Enter the Amount for deposite: ";
            cin>>deposit;
            B1.deposit(deposit);
            cout<<"Amount deposit successfully"<<endl;

           break; 
        }
        case 2:{
            int withdraw;
            cout<<"Enter the Amount for Withdraw:";
            cin>>withdraw;
            if (B1.displayBalance() < withdraw)
            {
                cout<<"insufficient balance"<<endl;
            }else{
                B1.withdraw(withdraw);
                cout<<"Amount Withdraw successfully"<<endl;
            }
           break; 
        }
        case 3:{
            double balance = B1.displayBalance();
            cout<<"Balance is:"<<balance<<endl;
           break; 
        }
        default:
        cout<<"Invalid choice"<<endl;
            break;
        }
        
    }
    return 0;
}
