# 입출력과 사칙연산

## 💡개념

### 자바 입력 클래스
- **Scanner**
  - 처음 자바 학습 시 사용하게 되는 클래스
  - 실행 속도가 느리다
    ```java
    import java.util.Scanner;
      
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    String b = in.next();
    ```
- **BufferedReader**
  - 코테 문제 풀이 시 자주 사용되는 클래스
  - 실행 속도가 빠르다
  - String만 입력받을 수 있어서, ```Integer.parseInt()```등의 변환 함수가 필요하다
    ```java
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    int b = Integer.parseInt(br.readLine());
    ```
- **StringTokenizer**
  - 입력 값이 공백으로 구분되어 있는 경우, 사용되는 클래스   
  ![1.png](img%2F1.png)
    ```java
    import java.io.BufferedReader;
    import java.io.OutputStreamWriter;
    import java.util.StringTokenizer;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine);
    
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    ```

### 자바 출력 클래스
- **System.out.println("")**
  - 처음 자바 학습 시 사용하게 되는 클래스
  - 여러번 실행하게 되면, 비교적 실행속도가 느리다
    ```java
    System.out.println("hi");
    ```
- **BufferedWriter**
  - 출력 횟수가 많아질 경우, 실행속도가 빠른 강점을 지닌 클래스
  - ```BufferedWriter```를 사용한 후에는, 버퍼를 비우기 위해 반드시 ```flush()```혹은 ```close()```를 사용해 주자
    ```java
    import java.io.BufferedWriter;
    import java.io.OutputStreamWriter;
    
    BufferedWriter bw = new BufferedWriter(new OutputStreamReader(System.out));
    bw.write("hi");
    bw.newLine();
    bw.flush(); //bw.close();
    ```