# [[2588] 곱셈](https://www.acmicpc.net/problem/2588)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 입력받은 숫자들을 순서대로 a, b라고 한다면
  - a*(b의 일의 자리 수), a*(b의 십의 자리수), a*(b의 백의 자리수), a*b를 출력해야 한다.

## 🗝️ 풀이 방법

- **알고리즘/자료구조**

- **구현**
  - 나누기, 나머지 연산자를 활용하여 계산


## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        ...
        
        bw.write(a*(b%10) + "\n");
        bw.write(a*(b%100/10) + "\n");
        bw.write(a*(b/100) + "\n");
        bw.write(a*b + "\n");
        
        ...
    }
}
```

## 📌 피드백

