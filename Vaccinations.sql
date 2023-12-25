-- database.sql

-- Create COUNTRY table
CREATE TABLE COUNTRY (
    ID INT PRIMARY KEY,
    NAME VARCHAR(100)
);

-- Create VACCINATION table
CREATE TABLE VACCINATION (
    ID INT PRIMARY KEY,
    COUNTRY_ID INT,
    DATE DATE,
    VACCINE VARCHAR(100),
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID)
);

-- Create AGE_GROUP table
CREATE TABLE AGE_GROUP (
    ID INT PRIMARY KEY,
    COUNTRY_ID INT,
    AGE_GROUP VARCHAR(50),
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID)
);

-- Create MANUFACTURER table
CREATE TABLE MANUFACTURER (
    ID INT PRIMARY KEY,
    COUNTRY_ID INT,
    MANUFACTURER_NAME VARCHAR(100),
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID)
);

-- Create LOCATION table
CREATE TABLE LOCATION (
    ID INT PRIMARY KEY,
    COUNTRY_ID INT,
    LOCATION_NAME VARCHAR(100),
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID)
);

-- Create US_STATE table
CREATE TABLE US_STATE (
    ID INT PRIMARY KEY,
    VACCINATION_ID INT,
    STATE_NAME VARCHAR(100),
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (VACCINATION_ID) REFERENCES VACCINATION(ID)
);

-- Create COUNTRY_DATA table
CREATE TABLE COUNTRY_DATA (
    ID INT PRIMARY KEY,
    VACCINATION_ID INT,
    AGE_GROUP_ID INT,
    MANUFACTURER_ID INT,
    LOCATION_ID INT,
    DATE DATE,
    TOTAL_VACCINATIONS INT,
    FOREIGN KEY (VACCINATION_ID) REFERENCES VACCINATION(ID),
    FOREIGN KEY (AGE_GROUP_ID) REFERENCES AGE_GROUP(ID),
    FOREIGN KEY (MANUFACTURER_ID) REFERENCES MANUFACTURER(ID),
    FOREIGN KEY (LOCATION_ID) REFERENCES LOCATION(ID)
);