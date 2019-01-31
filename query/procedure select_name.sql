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