#include <bits/stdc++.h>
using namespace std;

struct person{
    int age;
    string name;

} person_t;
int main(){
    vector<person> array (5);
    for (auto &x : array) {
        string s; cout << "Idade: "; getline(cin, s); x.age = stoi(s);
        cout << "Nome: "; getline(cin, x.name);
    }
    sort(array.begin(), array.end(), [] (const person &a, const person &b){
        return a.age > b.age;
    });
    for (auto &x : array){
        cout << "Idade do " << x.name << " é :" << x.age << '\n';
    }
}