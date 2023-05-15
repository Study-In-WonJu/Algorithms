#include <iostream>
#include <algorithm>
using namespace std;

int main(void){
  int n;
  cin >> n;
 
 // 최대값 입력 배열, 계단 배열
  int dp[n + 1], st[n + 1];
  
  // 계단의 숫자 입력
  for(int i = 1; i <= n; i++){
    cin >> st[i];
  } 
  
  // 초기값 대입
  dp[1] = st[1]; dp[2] = st[2] + st[1];
  dp[3] = max(st[1] + st[3], st[2] + st[3]);
  
  // 수 대입
  for(int i = 4; i <= n; i++){
    dp[i] = max(dp[i - 2] + st[i], dp[i - 3] + st[i - 1] + st[i]);
  }
  
  cout << dp[n];
 }