ALTER SESSION SET CURRENT_SCHEMA = PTAN;

/*
DROP TABLE MUSIC;
CREATE TABLE MUSIC
(
  CGenre VARCHAR2(50),
  CName VARCHAR2(50),
  CDuration  number(20),
  CDatePlayed DATE,
  CDateAdded DATE,
  CArtist VARCHAR2(50),
  CAlbum VARCHAR2(50),
  CCost number(5,2)
);

INSERT INTO MUSIC VALUES('Jazz', 'A Wonderful World', 5, '05-FEB-16', 
                        '01-FEB-16', 'Bing Crosby', 'Everlasting', 10.20);

INSERT INTO MUSIC VALUES('Punk', 'Big Time', 6, '20-FEB-16', 
                        '15-FEB-16', 'Bob Marley', '420', 4.20);
                        
insert INTO MUSIC(CGenre, CName, CCost) values ('Classical', 
                 'Sonata in D major', 6.66);
              
insert INTO MUSIC(CDuration, CArtist, CAlbum) values (4, 'Bach',
                  'Winter Sonata Collection');
                  
--SELECT * FROM MUSIC;

DROP TABLE CARS;

CREATE TABLE CARS
(
  COwnerName VARCHAR2(50),
  CEMail VARCHAR2(50),
  CMake VARCHAR2(50),
  CColour VARCHAR2(20),
  CReg VARCHAR2(8),
  CHolds number(15)
);

INSERT INTO CARS VALUES('Ken Delvin', 'ken@dit.ie', 'Toyota Lexus', 
                        'Silver', '07D11211', 6);

insert INTO CARS(COwnerName, CMake, CReg, CHolds) values ('Ken Delvin',
                'Volkswagen Golf', '00D12831', 5);

insert INTO CARS(COwnerName, CMake, CReg, CHolds) values ('Ken Delvin',
                  'Audi 100', '90D10800', 5);

INSERT INTO CARS VALUES('Fred Bloggs', 'fred@ibm.ie', 'Ford Escort', 
                        'Brown', '80D2002', 5);
                        
insert INTO CARS(COwnerName, CMake, CColour, CReg, CHolds) values 
                ('Fred Bloggs', 'Ford Anglia', 'Black', '50D03', 4);

--SELECT * FROM CARS;
*/


/*EVALUATION WORKSHEET*/
DROP TABLE MODLIST;
CREATE TABLE MODLIST
(
  CPrgYr VARCHAR2(10),
  CModCode VARCHAR2(10)PRIMARY KEY,
  CModName VARCHAR2(80),
  CLecturer VARCHAR2(50) default 'N/A'
);

INSERT INTO MODLIST VALUES('DT211/2', 'CMPU2007', 'Databases 1', 
                            'Patricia O''Byrne');
                            
INSERT INTO MODLIST(CPrgYr, CModCode, CModName) VALUES('DT211/3', 
                    'CMPU3004', 'Applied Intelligence');

SELECT * FROM MODLIST;