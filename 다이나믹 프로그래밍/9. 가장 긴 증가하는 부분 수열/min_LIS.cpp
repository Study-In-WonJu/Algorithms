#include <iostream>
#include <algorithm>
using namespace std;

int main(void){
  int n;
  cin >> n;
  
  int num[n], dp[n];
  
  // 수 입력
  for(int i = 0; i < n; i++){
    cin >> num[i];
  }
  
  // 최댓값 초기화
  int m = 0;
  
  for(int i = 0; i < n; i++){
    // dp 값을 우선 1로 설정
    dp[i] = 1;
    

    for(int j = 0; j < i; j++){
      // 더 작은 수가 나오면
      if(num[i] > num[j]){
        // 원래의 값과 그 dp값 + 1을 비교해 더 큰 수를 넣음
        dp[i] = max(dp[j] + 1, dp[i]);
      }
    }
    
    // 최댓값보다 더 큰 수가 나오면 최댓값에 대입
    if(m < dp[i]){
      m = dp[i];
    }
  }
  
  cout << m;
}