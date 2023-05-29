# [[2480] 주사위 세개](https://www.acmicpc.net/problem/2480)

![1.png](img%2F1.png)
![2.png](img%2F2.png)

***

## 📃 문제 분석

- 3개 수 a, b, c가
  - 다 같으면 10000 + a*1000
  - 2개가 같으면 1000 + a*100 (a==b)
  - 다 다르면 a*100 (a가 가장 큰 수)

## 🗝️ 풀이 방법

- **구현**
  - 다 같은 경우, 2개만 같은 경우, 모두 다른 경우로 나누기

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
      ...
      if (a==b && b==c) {
        System.out.println(10000 + 1000*a);
      }
      else if (a==b || b==c) {
        System.out.println(1000 + 100*b);
      }
      else if (c==a) {
        System.out.println(1000 + 100*c);
      }
      else {
        System.out.println(100 * Math.max(Math.max(a, b), c));
      }
    }
}
```

## 📌 피드백

