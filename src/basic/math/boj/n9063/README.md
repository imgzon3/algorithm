# [[9063] 대지](https://www.acmicpc.net/problem/9063)

![1.png](img%2F1.png)
![2.png](img%2F2.png)

***

## 📃 문제 분석

- 문제 내용은 길지만, 실제 구하고자 하는 값은
- 첫째 줄에 점의 개수를 입력받고, 그 후 좌표 값을 입력받는다.
- 해당 점들로 가장 큰 직사각형을 만들어, 그 넓이를 구한다. 

## 🗝️ 풀이 방법

- **구현**
  - 결국, x좌표의 최소값 xMin, 최대값 xMax, y좌표의 최소값 yMin, 최대값 yMax을 구한 후
  - ```(xMax - xMin) * (yMax - yMin)```을 계산하면 되는 문제이다.
  - 최소 최댓값을 구하기 위해 배열에 저장후, Java8의 ```Stream```을 활용하자.

## 💻 핵심 코드

```java
public class Main {
  public static void main(String[] args) {
    int xLen = Arrays.stream(x).max().getAsInt() - Arrays.stream(x).min().getAsInt();
    int yLen = Arrays.stream(y).max().getAsInt() - Arrays.stream(y).min().getAsInt();

    System.out.println(xLen*yLen);
  }
}
```

## 📌 피드백

