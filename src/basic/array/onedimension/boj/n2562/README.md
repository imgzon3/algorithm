# [[2562] 최댓값](https://www.acmicpc.net/problem/2562)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 수 9개를 입려받고, 그충 최댓값과 몇번째 수인지를 출력

## 🗝️ 풀이 방법

- **구현**
  - ```Collections```클래스의 ```max()```, ```List```인터페이스 메서드 중 ```indexOf()``` 활용하기

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        int max = Collections.max(arr);
        int index = arr.indexOf(max) + 1;
    }
}
```

## 📌 피드백

