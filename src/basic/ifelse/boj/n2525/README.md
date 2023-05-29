# [[2525] 오븐 시계](https://www.acmicpc.net/problem/2525)

![1.png](img%2F1.png)
![2.png](img%2F2.png)

***

## 📃 문제 분석

- 첫 번째 줄에 시간, 분을 받는다.
- 두 번째 줄에서 입력받은 분 만큼 지난 시간을 출력

## 🗝️ 풀이 방법

- **구현**
  - 다음과 같은 사항을 확인하자.
    - 분을 더한 경우 60분을 넘어가는가?
    - 계산후 시간이 23시를 넘어가는가?

## 💻 핵심 코드

```java
public class Main {
    public static void main(String[] args) {
      ...
      if (m+addM < 60) { ... }
      else if ((t+(m+addM)/60) < 24) { ... }
      else { ... }
      ...
    }
}
```

## 📌 피드백

