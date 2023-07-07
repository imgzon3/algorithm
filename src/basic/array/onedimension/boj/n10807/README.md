# [[10807] 개수 세기](https://www.acmicpc.net/problem/10807)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 입력된 값들을 배열에 저장 후, 마지막에 입력받은 숫자의 빈도 수 출력하기

## 🗝️ 풀이 방법

- **알고리즘/자료구조**
  - ```Collections```클래스의 ```frequency()```메서드를 활용하자.
  - ```frequency(Collection<?> c, Object o)```: 컬렉션에 주어진 원소의 빈도수를 반환

- **구현**
  - 입력받은 숫자들을 List에 저장한 후, ```frequency()```메서드를 활용해 빈도수를 출력한다.

## 💻 핵심 코드

```java
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    System.out.println(Collections.frequency(arr, num));
  }
}
```

## 📌 피드백

