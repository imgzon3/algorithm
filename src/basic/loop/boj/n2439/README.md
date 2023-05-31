# [[2439] 별찍기 - 2](https://www.acmicpc.net/problem/2439)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 문제 조건에 맞추어 ```*``` 출력하기

## 🗝️ 풀이 방법
- **구현**
  - 각 줄마다 필요한만큼 ```공백```과 ```*```를 출력하자

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        ...
        for (int i=1; i<=count; i++) {
            for(int k=1; k<=(count-i); k++) {
                bw.write(" ");
            }
            for(int k=1; k<=i; k++) {
                bw.write("*");
            }
          bw.newLine();
        }
        ...
    }
}
```

## 📌 피드백

