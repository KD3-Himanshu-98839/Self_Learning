#include <iostream>
using namespace std;


int myStrlen(const char *str)
{
    int length = 0;
    while (str[length] != '\0')
    {
        length++;
    }
    return length;
}


char* myStrcpy(char *dest, const char *src)
{
    int i = 0;
    while (src[i] != '\0')
    {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';   
    return dest;
}

int main()
{
    char source[100];
    char destination[100];

    cout << "Enter a string: ";
    cin.getline(source, 100);

    cout << "Length of string (myStrlen): " << myStrlen(source) << endl;

    myStrcpy(destination, source);
    cout << "Copied string (myStrcpy): " << destination << endl;

    return 0;
}