# [[2745] 진법 변환](https://www.acmicpc.net/problem/2745)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- N진수 수를 10진수로 바꾸기

## 🗝️ 풀이 방법

- **구현**
  - 입력받은 수를 자리수별로 ```String.charAt()```을 활용해 검사한다.
    - 만일 'A'~'Z'사이 ```char```값이라면, ```-'A'+10```을 해준다.
    - 만일 아니라면, ```'0'```을 해준다.
  - 위 과정으로 해당 자리수의 수를 10진수로 얻을 수 있다. 이를 각 자리에 맞게 곱해준다.
  - 모든 값을 더한 후, 결과를 출력한다.

## 💻 핵심 코드

```java
```

## 📌 피드백
