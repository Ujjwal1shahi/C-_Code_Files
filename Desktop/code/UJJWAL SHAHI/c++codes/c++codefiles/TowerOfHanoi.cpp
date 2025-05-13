#include <iostream>
using namespace std;

class TowerOfHanoi{
    public:

    void TOH(int n, int src, int help, int dest){
        // Return conditions
        if(n == 1){
            cout << "Move disk "<< n << " from " << src << " to " << dest << endl;
            return;
        }

        TOH(n-1, src, dest, help);
        cout << "Move disk "<< n << " from " << src << " to " << dest << endl;
        TOH(n-1, help, src, dest);
    }
};

int main(){
    int src, dest, help, n;

    cout << "Enter the no. of disk : ";
    cin >> n;

    cout << "Enter the Source : ";
    cin >> src;

    cout << "Enter the Destination : ";
    cin >> dest;

    cout << "Enter the Help : ";
    cin >> help;

    TowerOfHanoi th;
    th.TOH(n, src, help, dest);

    return 0;
}