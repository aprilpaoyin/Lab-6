DROP TABLE CLASSES;
CREATE TABLE CLASSES
(
  Class_Id      VARCHAR(10) PRIMARY KEY,
  Class_Teacher VARCHAR(30) NOT NULL
);

DROP TABLE EXAM;
CREATE TABLE EXAM
(
  Class_Id      VARCHAR(10) NOT NULL REFERENCES CLASSES,
  Teacher_Id    VARCHAR(10) NOT NULL REFERENCES TEACHER,
  Subject_Id    VARCHAR(10) NOT NULL REFERENCES SUBJECT,
  Exam_Id       VARCHAR(10)  NOT NULL PRIMARY KEY, 
  Exam_Session  VARCHAR(30) NOT NULL,
  Exam_Date     DATE,
  Start_Time    NUMBER(5),
  Exam_Duration NUMBER(5)     NOT NULL,
  Exam_Result   NUMBER(5,2) NOT NULL,
  Result_Date   DATE
);

DROP TABLE CLASS_SUBJECT;
CREATE TABLE CLASS_SUBJECT
(
  Subject_Id    VARCHAR(10) NOT NULL REFERENCES SUBJECT,
  Class_Id      VARCHAR(10) NOT NULL REFERENCES CLASSES
);

DESCRIBE EXAM;