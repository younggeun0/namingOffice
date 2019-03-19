# 👨‍🏫Young's Naming Office 

## 설명

![01](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/NOF/01.png?raw=true)

* 위키 시대별 가장 흔한 이름 10선을 DB로 사용
    *  [연도별 가장 인기있는 이름](https://ko.wikipedia.org/wiki/%ED%95%9C%EA%B5%AD%EC%9D%98_%EC%84%B1%EC%94%A8%EC%99%80_%EC%9D%B4%EB%A6%84)
* 성별, 연도 선택, 성(Last Name)을 입력받아 랜덤이름을 작명해주는 프로그램
  * PLSQL Procedure를 이용, 데이터 처리 후 결과만 String형태로 전달받아 보여줌
  * 데이터를 입력하는 클래스를 전처리로 실행하여 DB에 insert수행

## UI 설계

![02](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/NOF/02.png?raw=true)

## DB 테이블 생성 및 프로시저 생성

```sql
CREATE TABLE name_rank(
    year NUMBER(4),
    rank NUMBER(2),
    gender CHAR(1),
    name CHAR(6)
);
```

```sql
CREATE OR REPLACE PROCEDURE select_name(
    i_gender IN CHAR,
    i_year IN NUMBER,
    i_last_name IN VARCHAR2,
    i_random_idx IN NUMBER,
    msg OUT VARCHAR2
)
IS
    first_name CHAR(6);
BEGIN

    SELECT name
    INTO first_name
    FROM name_rank
    WHERE year=i_year AND rank= i_random_idx AND gender= i_gender;
    msg := '만들어진 이름은 '||i_last_name||first_name||'입니다!';

END;
/
```

## 시연

![시연](https://github.com/younggeun0/namingOffice/blob/master/naming_office.gif?raw=true)

