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
    - ```flush()``` 혹은 ```close()```를 사용하면 버퍼에 있던 내용이 파일에 사용된다
    - 아래 코드의 상황에서는 터미널에 출력된다
    - ```close()``` 사용 시 스트림이 아예 닫혀 해당 스트림을 다시 이용하여 파일에 쓰는 것이 불가능해진다
      ```java
      import java.io.BufferedWriter;
      import java.io.OutputStreamWriter;
    
      BufferedWriter bw = new BufferedWriter(new OutputStreamReader(System.out));
      bw.write("hi");
      bw.newLine();
      bw.flush(); //bw.close();
      ```

### 기타
- **StringBuilder**
  - String은 ```불변(immutable) 객체```이므로, ```+```연산자를 이용한 문자열 덧셈 시 새로운 객체를 만들어서 처리한다
  - 따라서 변경 가능한 문자열을 만들어주는 ```StringBuilder``` 클래스를 활용해보자
    - 객체를 만든 후 ```.append()```를 통해 문자열울 추가하자
    - 그후, 객체를 ```.toString()```을 통해 String으로 변환하거나, 바로 출력하면 된다
      ```java
      StringBuilder sb = new StringBuilder();
      sb.append("Hello").append(" String").append("Builder!");
      String str = sb.toString();
      
      System.out.println(sb);
      System.out.println(str);
      ```