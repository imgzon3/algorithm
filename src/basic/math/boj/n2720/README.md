# [[2720] 세탁소 사장 동혁](https://www.acmicpc.net/problem/2720)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 수를 입력받고, 거스름돈 계산하는 문제

## 🗝️ 풀이 방법

- **구현**
  - 입력받은 수를 나머지와 나누기를 통해 요구한 값을 구하자
  - 단, 니켈 값을 구할때 주의!
    - ```money%25%10/5```이런 식으로 값을 구해야 한다.

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
       ...
       sb.append(money%25%10/5).append(" ");
       ...
    }
}
```

## 📌 피드백

