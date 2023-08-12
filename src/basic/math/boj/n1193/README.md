# [[1193] 분수 찾기](https://www.acmicpc.net/problem/1193)

![1.png](img%2F1.png)
![2.png](img%2F2.png)

***

## 📃 문제 분석

- 문제 규칙에 따라 X가 주어질경우, X번째 분수 구하기

## 🗝️ 풀이 방법

- **구현**
  - 해당 문제는 분수의 나열을 가로순, 세로순이 아닌 대각선으로 확인해야 한다.
    - 1/1
    - 1/2, 2/1
    - 3/1, 2/2, 1/3
    - 1/4, 2/3, 3/2, 4/1
    - ...
  - 따라서 대각선 n번째 줄에 입력받은 수가 있는지 확인한 후, 계산해준다.
  - 단, 아래 경우를 꼭 주의하자
    - n이 짝수일 경우 분자가 큰수 -> 작은수, 분모가 작은수 -> 큰수
    - n이 홀수인 경우 그 반대이다.

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
       ...
       if (when%2 == 0) {
         System.out.println((when+num) + "/" + (1-num));
       }
       else {
         System.out.println(1-num + "/" + (when+num));
       }
       ...
    }
}
```

## 📌 피드백

