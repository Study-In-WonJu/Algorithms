#include <iostream>
using namespace std;

int dp[15][15];

void val_insert(void){
  
  for(int i = 0; i < 15; i++){
    for(int j = 0; j < 15; j++){
      if(i == 0){
        dp[i][j] = j + 1;
      }
      else{
        if(j == 0){
          dp[i][j] = 1;
        }
        else{
          dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
        }
      }
    }
  }
  
}

int main(void){
  
  int n;
  cin >> n;
  
  val_insert();
  
  for(int i = 0; i < n; i++){
    int f, r;
    cin >> f >> r;
    cout << dp[f][r - 1] <<'\n';
  }
}