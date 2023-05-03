#include <iostream>
#include <utility>
using namespace std;

pair <int, int> arr[41];

void fib(){
  arr[0].first = 1; arr[0].second = 0;
  arr[1].first = 0; arr[1].second = 1;
  
  for(int i = 2; i <= 40; i++){
    arr[i].first = arr[i - 1].first + arr[i - 2].first;
    arr[i].second = arr[i - 1].second + arr[i - 2].second;
  }
}

int main(void){
  int num;
  cin >> num;
  
  fib();
  
  for(int i = 0; i < num; i++){
    int n;
    cin >> n;
    
    cout << arr[n].first << ' ' << arr[n].second << '\n';
  }
}