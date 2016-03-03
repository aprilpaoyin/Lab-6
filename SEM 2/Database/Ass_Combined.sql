/*
*       Creating tables
*/
CREATE
  TABLE CLASSES
  (
    Class_Id      VARCHAR(10) PRIMARY KEY,
    Class_Teacher VARCHAR(30) NOT NULL
  );


CREATE
  TABLE EXAM
  (
    Class_Id      VARCHAR(10) NOT NULL REFERENCES CLASSES,
    Teacher_Id    VARCHAR(10) NOT NULL REFERENCES TEACHER,
    Subject_Id    VARCHAR(10) NOT NULL REFERENCES SUBJECT,
    Exam_Id       VARCHAR(10) PRIMARY KEY,
    Exam_Session  VARCHAR(30) NOT NULL,
    Exam_Date     DATE,
    Start_Time    NUMBER(5),
    Exam_Duration NUMBER(5) NOT NULL,
    Exam_Result   NUMBER(5,2) NOT NULL,
    Result_Date   DATE
  );

CREATE
  TABLE CLASS_SUBJECT
  (
    Subject_Id VARCHAR(10) NOT NULL REFERENCES SUBJECT,
    Class_Id   VARCHAR(10) NOT NULL REFERENCES CLASSES
  );
  
CREATE
  TABLE TEACHER
  (
    TEACHER_ID   VARCHAR(10) PRIMARY KEY,
    TEACHER_NAME VARCHAR(30) NOT NULL
  );
  
CREATE
  TABLE SUBJECT
  (
    SUBJECT_ID   VARCHAR(10) PRIMARY KEY,
    SUBJECT_NAME VARCHAR(30) NOT NULL
  );
  
CREATE
  TABLE TEACHER_SUBJECT
  (
    TEACHER_ID VARCHAR(10) NOT NULL REFERENCES TEACHER,
    SUBJECT_ID VARCHAR(10) NOT NULL REFERENCES SUBJECT
  );
  
/*
*       End of creating tables
*       Start of inserts
*/
INSERT
INTO
  exam VALUES
  (
    'DT211C',
    'T14526587',
    'CMPU2014',
    'X00404',
    'Summer',
    '01-DEC-15',
    9.15,
    3.00,
    5,
    '26-FEB-16'
  );
  
INSERT
INTO
  class_subject VALUES
  (
    'CMPU2014',
    'DT211C'
  );
  select * from teacher_subject;
INSERT
INTO
  teacher_subject VALUES
  (
    'T14526587',
    'CMPU2014'
  );

INSERT
INTO
  classes VALUES
  (
    'DT211C',
    'John'
  );

INSERT
INTO
  TEACHER VALUES
  (
    'T14526587',
    'John'
  );
  
INSERT
INTO
  SUBJECT VALUES
  (
    'CMPU2014',
    'Databases'
  );
  

/*
*       Other random functions I copy paste instead of looking up
*
UPDATE classes
SET CLASS_ID = 'DT211C'
WHERE CLASS_TEACHER = 'John';


DESCRIBE EXAM;
DROP TABLE EXAM;*/