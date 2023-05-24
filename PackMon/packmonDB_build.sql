/*
SQL to Create the PackMon database
*** COPY AND PASTE THIS CODE THEN RUN IT WHEN CONNECTED TO A SERVER
*/

DROP DATABASE IF EXISTS packmon;
CREATE DATABASE packmon;
USE packmon;

/*
Creating the monster table
*/
CREATE TABLE monster (
	monsterID 	INT 		NOT NULL,
    monsterName	VARCHAR(20)	NOT NULL,
    monsterVal	CHAR(3)		NOT NULL,
    attackName	VARCHAR(20)	NOT NULL,	
    attackPow	CHAR(3)		NOT NULL,
	CONSTRAINT	monPK
		PRIMARY KEY	(monsterID)
) ENGINE INNODB
;

/*
Creating the player table
*/
CREATE TABLE player (
	playerID 	INT 		NOT NULL,
    playerName	VARCHAR(20)	NOT NULL,
    weapon		VARCHAR(15)	NOT NULL,
	CONSTRAINT	playerPK
		PRIMARY KEY (playerID)
) ENGINE INNODB
;

/*
Creating the score table
*/
CREATE TABLE score (
	playerID 	INT 		NOT NULL,
    monsSlayed	CHAR(1)	    NOT NULL,
    playerName	VARCHAR(35)	NOT NULL,
    score		INT			NOT NULL,
	CONSTRAINT	scorePK
		PRIMARY KEY (playerID)
) ENGINE INNODB
;

/*
Creating the save file table
*/
CREATE TABLE save (
	playerID 	INT 		NOT NULL,
    level		CHAR(1)		NOT NULL,
	CONSTRAINT	savePK
		PRIMARY KEY (playerID)
) ENGINE INNODB
;

SET FOREIGN_KEY_CHECKS=0;

INSERT INTO monster VALUES
	(1,'Chickoala',2,'Slash',15), (2,'Rake',5,'Bite',35), (3,'Sloblin',10,'Gobble',50), (4, 'Smark', 8, 'SharkDance', 10) 
    
;

