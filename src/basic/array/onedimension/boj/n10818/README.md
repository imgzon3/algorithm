# [[10818] 최소, 최대](https://www.acmicpc.net/problem/10818)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 수 입력받고, 최솟값 최댓값 출력

## 🗝️ 풀이 방법

- **구현**
  - ```Collections```클래스의 ```max()```, ```min()```함수 이용하기

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Collections.min(arr) + " " + Collections.max(arr));
    }
}
```

## 📌 피드백

