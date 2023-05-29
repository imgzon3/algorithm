# [[1000] A+B](https://www.acmicpc.net/problem/1000)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 공백으로 구분된 두 숫자 입력 받은 후, 출력해보기

## 🗝️ 풀이 방법

- **구현**
  - 자바에서 입력을 받을 수 있는 주요 방법들은 다음과 같다.
    - Scanner
    - BufferedReader
    - StringTokenizer
  - ```BufferedReader```를 사용하는 것이 Scanner를 사용하는 것보다 빠르다.
  - 만일 공백 처리를 하고 싶으면, ```StringTokenizer```를 사용하자

## 💻 핵심 코드

```java
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    ...
  }
}
```

## 📌 피드백

