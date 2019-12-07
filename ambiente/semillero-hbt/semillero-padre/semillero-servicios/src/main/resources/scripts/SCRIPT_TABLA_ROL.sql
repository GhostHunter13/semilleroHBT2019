CREATE TABLE "DB_SEMILLERO"."ROL" 
(	"SRID" NUMBER(3,0) NOT NULL ENABLE,
"SRNOMBRE" VARCHAR2(50 BYTE) NOT NULL  ENABLE, 
"SRESTADO" VARCHAR2(50 BYTE) NOT NULL  ENABLE,
CONSTRAINT "ROL_PK" PRIMARY KEY ("SRID", "SRNOMBRE"),
CONSTRAINT "CHK_ROL" CHECK (SRESTADO IN ('ACTIVO', 'INACTIVO'))
);

comment on column ROL.SRID is 'Campo para identificar el comic';
comment on column ROL.SRNOMBRE is 'Nombre del rol';
comment on column ROL.SRESTADO is 'Estado del rol';

--Notas a tener en cuenta
--SR indica el prefijo de la tabla S=semillero, R=rol

--Crear una secuencia para utilizarla como incremento del identificador
CREATE SEQUENCE "DB_SEMILLERO"."SEQ_ROL" MINVALUE 1 START WITH 1  INCREMENT BY 1 NOCACHE;