# [[3009] 네 번째 점](https://www.acmicpc.net/problem/3009)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 세 점의 좌표가 주어지고, 해당 점들과 직사각형을 만들기 위한 네 번째 점 출력하기

## 🗝️ 풀이 방법

- **구현**
  - 결국 문제를 분석해보면,
    - x좌표 3개중 겹치지 않은 한개와
    - y좌표 3개중 겹치지 않은 한개의 값을 출력하는 문제이다.

## 💻 핵심 코드

```java
public class Main {
  public static void main(String[] args) {
    if (x[0] == x[1]) {
        sb.append(x[2]).append(" ");
      } else if (x[1] == x[2]) {
        sb.append(x[0]).append(" ");
      } else {
        sb.append(x[1]).append(" ");
      }

      if (y[0] == y[1]) {
        sb.append(y[2]);
      } else if (y[1] == y[2]) {
        sb.append(y[0]);
      } else {
        sb.append(y[1]);
      }
  }
}
```

## 📌 피드백

