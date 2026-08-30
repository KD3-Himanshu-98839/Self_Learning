#include<iostream>
using namespace std;

class Laptop
{
private:
    int brandId;
    double price;
public:
    Laptop(): brandId(1), price(50000.0)
    {
        cout<<"Laptop Constructor Called."<<endl;
    }
    ~Laptop(){
        cout<<"Laptop Desstructor Called."<<endl;
    }
    void display(){
        cout<<"Brand Id is:"<<brandId<<endl;
        cout<<"Price is:"<<price<<endl;
    }
    
};


int main()
{
    Laptop c1;
    c1.display();
    
    return 0;
}
