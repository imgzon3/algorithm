# [[10951] A+B - 4](https://www.acmicpc.net/problem/10951)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- EOF(End of File) 상황 해결하기

## 🗝️ 풀이 방법

- **구현**
  - ```BufferedReader```는 ```Scanner```와 다르게 EOF를 처리하는 내장 함수가 없다.
  - ```while```문을 활용하자

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        ...
        String inputStr = "";
        while ((inputStr = br.readLine()) != null) {
            ... 
        }
        ...
    }
}
```

## 📌 피드백

