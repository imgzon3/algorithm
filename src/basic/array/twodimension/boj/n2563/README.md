# [[2563] 색종이](https://www.acmicpc.net/problem/2563)

![1.png](img%2F1.png)

***

## 📃 문제 분석

- 도화지에서 검은부분의 넓이를 구하자
- 단, 도화지의 가로 세로 크기는 100, 검은 색종이의 가로 세로 크기는 10이다.
- 겹친 영역은 한번만 더한다.
- 첫 줄에 검은 색동이의 개수를 입력받고,
- 색종이로부터 왼쪽과의 간격, 아래와의 간격을 나타낸 수를 입력받는다.

## 🗝️ 풀이 방법

- **구현**
  - ```boolean[101][101]```배열을 생성한다.
    - 햇갈림 방지를 위해 0번째 위치는 사용하지 않는다.
  - 배열의 값은 검은 색종이로 인해 색칠되어있는지를 나타낸다.
    - 색칠되면 ```true```, 안색칠되면 ```false```
  - 입력받은 색종이의 위치에 맞추어 해당 영역의 값을 ```true```로 바꾼다.
  - 마지막에 배열에서 ```true```인 값의 개수를 출력한다.

## 💻 핵심 코드

```java
```

## 📌 피드백

