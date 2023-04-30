#include <iostream>
using namespace std;

int main(void){
  // 입력
  int n;
  cin >> n;
  
  // 배열 선언 
  int dp[n + 1];
  
  // 나눌 수 없는 경우
  dp[1] = dp[2] = dp[4] = -1;
  // 나눌 수 있는 경우 (3, 5)
  dp[3] = dp[5] = 1;
  
  // 원하는 수까지 반복
  for(int i = 6; i <= n; i++){
    // 5로 나눠질 경우
    if(dp[i - 5] != -1){
      dp[i] = dp[i - 5] + 1;
    }
    // 5로 안 나눠지지만 3으로 나눠질 경우
    else if(dp[i - 3] != -1){
      dp[i] = dp[i - 3] + 1;
    }
    // 아예 안 나눠질 경우
    else{
      dp[i] = -1;
    }
  }
  
  // 출력
  cout << dp[n];
}