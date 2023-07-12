# [[9086] 문자열](https://www.acmicpc.net/problem/9086)

![1.png](img%2F1.png)

***

## 📃 문제 분석

## 🗝️ 풀이 방법

- **구현**
  - ```String.charAt()```, ```String.length()```활용해서 각 단어의 첫 번째, 마지막 글자를 가져오자.

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
        sb.append(word.charAt(0)).append(word.charAt(word.length()-1)).append("\n");
    }
}
```

## 📌 피드백

