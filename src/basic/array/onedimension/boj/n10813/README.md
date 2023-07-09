# [[10813] 공 바꾸기](https://www.acmicpc.net/problem/10813)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 숫자 N, M을 입력받음
- N개의 바구니가 있으며, 각각 바구니에 순서대로 1~N 번호가 적힌 공 존재
- M번동안 공을 바꿈
  - i, j 정수를 입력받고, 해당 두 바구니에 들어가있는 공을 교환
- 마지막에 각 바구니에 어떤 공이 들어있는지 확인

## 🗝️ 풀이 방법

- **구현**
  - ```Collections```클래스의 ```swap()``` 활용

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        Collections.swap(arr, i, j);
    }
}
```

## 📌 피드백

