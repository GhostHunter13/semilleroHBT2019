CREATE TABLE "DB_SEMILLERO"."PERSONA" 
   (	"SPDOCUMENTO" NUMBER(13,0) NOT NULL ENABLE, 
	"SPTIPO_DOCUMENTO" VARCHAR2(50 BYTE) NOT NULL ENABLE, 
	"SPNOMBRE" VARCHAR2(50 BYTE) NOT NULL ENABLE,
  "SPFECHA_NACIMIENTO" DATE NOT NULL ENABLE,
	 CONSTRAINT "PERSONA_DOCUMENTO" UNIQUE (SPDOCUMENTO), 
	 CONSTRAINT "PERSONA_TIPO_DOCUMENTO" CHECK (SPTIPO_DOCUMENTO IN ('C.C', 'C.E', 'T.I', 'LICENCIA CONDUCCION')) ENABLE, 
	 CONSTRAINT "PERSONA_PK" PRIMARY KEY ("SPDOCUMENTO"));
   
comment on column PERSONA.SPDOCUMENTO is 'El numero de documento de una persona';
comment on column PERSONA.SPNOMBRE is 'Nombre de la persona';
comment on column PERSONA.SPTIPO_DOCUMENTO is 'Tipo de documento de la persona.';
comment on column PERSONA.SPFECHA_NACIMIENTO is 'Fecha de nacimiento de la persona.';

--Notas a tener en cuenta
--SP indica el prefijo de la tabla S=semillero, R=persona

--Crear una secuencia para utilizarla como incremento del identificador
CREATE SEQUENCE "DB_SEMILLERO"."SEQ_PERSONA" MINVALUE 1 START WITH 1  INCREMENT BY 1 NOCACHE;