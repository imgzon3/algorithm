# [[2903] 중앙 이동 알고리즘](https://www.acmicpc.net/problem/2903)

![1.png](img%2F1.png)
![2.png](img%2F2.png)

***

## 📃 문제 분석

- 문제 조건대로 점을 만들 시, N번 거친 후 점의 개수를 출력

## 🗝️ 풀이 방법

- **구현**
  - 한 줄의 네모가 n개 있다고 하면, 총 점의 개수는 ```(n+1)*(n+1)```
  - 한 줄의 네모는 2, 4, 8, 16, ... 순으로 늘어남

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
       System.out.println((int) Math.pow(Math.pow(2, num)+1, 2));
    }
}
```

## 📌 피드백

