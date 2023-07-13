# [[2908] 상수](https://www.acmicpc.net/problem/2908)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 입력받은 두 수를 뒤집고, 그 중에서 큰 수를 출력하기

## 🗝️ 풀이 방법

- **구현**
  - ```StringBuilder.reverse()```를 사용하면 문자열을 뒤집을 수 있다. 이를 활용하자.

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(new StringBuilder().reverse().toString());
    }
}
```

## 📌 피드백

