# [[10926] ??!](https://www.acmicpc.net/problem/10926)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 문자열 덧셈

## 🗝️ 풀이 방법

- **구현**
  - 문자열 덧셈을 사용한다.
    - ```+``` 연산자를 사용할 수도 있지만, ```StringBuilder```클래스를 사용해보자
    - 적은 횟수의 연산 시에는 성능 차이가 미미하지만, 연습을 위해 사용해보자

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
      ...
      StringBuilder sb = new StringBuilder();
      sb.append(br.readLine()).append("??!");
      ...
    }
}
```

## 📌 피드백

