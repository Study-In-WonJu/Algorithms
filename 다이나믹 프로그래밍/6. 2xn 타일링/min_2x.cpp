#include <iostream>
using namespace std;

int main(void){
  int n;
  cin >> n;
  
  // 1, 2면 그 수 그대로 출력
  if(n < 3){
    cout << n;
    return 0;
  }
  
  // 배열 선언
  int dp[n + 1];
  
  // 초기값
  dp[1] = 1; dp[2] = 2;
  
  // 배열에 그 전 + 그전전 값 넣고 10007로 나눔
  for(int i = 3; i <= n; i++){
    dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
  } 
  
  cout << dp[n];
}