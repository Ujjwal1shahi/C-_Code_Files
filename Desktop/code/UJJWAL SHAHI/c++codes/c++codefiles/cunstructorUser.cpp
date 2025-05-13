#include <iostream>
using namespace std;

class customer{
    string name, address;
    int data, account_no, cust_id;

    public:

    customer(string name, string address, int data, int account_no, int cust_id){
        this->name = name;
        this->address = address;
        this->data = data;
        this->account_no = account_no;
        this->cust_id = cust_id;
    }

    void display(){
        cout << name << " " << address << " " << data << " " << account_no << " " << cust_id << endl;
    }
};

int main(){

    string name, address;
    int data, account_no, cust_id;

    cout << "Enter the name : ";
    cin >> name;
    cout << "Enter the address : ";
    cin >> address;
    cout << "Enter the data : ";
    cin >> data;
    cout << "Enter the account number : ";
    cin >> account_no;
    cout << "Enter the coustomer ID : ";
    cin >> cust_id;

    customer c1(name, address, data, account_no, cust_id);
    c1.display();

    return 0;
}