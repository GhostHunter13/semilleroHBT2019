 CREATE TABLE "DB_SEMILLERO"."PERSONA_COMIC" (
  "SPCID" NUMBER(3,0) NOT NULL ENABLE, 
	"SPCDOC_PERSONA" NUMBER(13,0) NOT NULL ENABLE, 
	"SPCID_COMIC" NUMBER(3,0) NOT NULL ENABLE,
  "SPCFECHA_VENTA" DATE NOT NULL ENABLE,
   CONSTRAINT "PERSONA_COMIC_FK_DOC_PERSONA" FOREIGN KEY (SPCDOC_PERSONA) REFERENCES PERSONA(SPDOCUMENTO),
   CONSTRAINT "PERSONA_COMIC_FK_ID_COMIC" FOREIGN KEY (SPCID_COMIC) REFERENCES COMIC(SCID),   
	 CONSTRAINT "PERSONA_COMIC_PK_ID" PRIMARY KEY (SPCID));
   
comment on column PERSONA_COMIC.SPCID is 'El id del registro en la tabla';
comment on column PERSONA_COMIC.SPCDOC_PERSONA is 'Documento de la persona que compra el comic';
comment on column PERSONA_COMIC.SPCID_COMIC is 'Id del comic que compra una persona';
comment on column PERSONA_COMIC.SPCFECHA_VENTA is 'Fecha de venta del comic a una persona';

--Notas a tener en cuenta
--SPC indica el prefijo de la tabla S=semillero, P=persona, C=comic
--Crear una secuencia para utilizarla como incremento del identificador
CREATE SEQUENCE "DB_SEMILLERO"."SEQ_PERSONA_COMIC" MINVALUE 1 START WITH 1  INCREMENT BY 1 NOCACHE;