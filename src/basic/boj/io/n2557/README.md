# [[2557] Hello World](https://www.acmicpc.net/problem/2557)

![1.png](img%2F1.png)![2557.png](img%2F2557.png)

***

## 📃 문제 분석

- 출력해보기

## 🗝️ 풀이 방법

- **구현**
  - 자바에서 출력을 하는 주요 방식들은 다음과 같다.
    - System.out.println("");
    - BufferedWriter
    - StringBuilder
  - 적은 양의 출력에서는 System.out.println(""); 을 사용해도 무방하지만,
  - 많은 양의 출력을 사용하면 ```BufferedWriter```를 사용하자
  - 해당 문제는 한번만 출력하지만, 연습을 위해 BufferedWriter를 사용해보자
  > 마지막에 flush() 메서드를 호출하여 버퍼를 비우고, 스트림을 닫자.


## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      bw.write("Hello World!");
      bw.flush();
    }
}
```

## 📌 피드백

