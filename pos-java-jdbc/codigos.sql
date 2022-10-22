/*
CRIA BANCO DE DADOS

CREATE DATABASE posjava
   WITH OWNER = postgres
	ENCODING = 'UTF8'
	TABLESPACE = pg_default
	CONNECTION LIMIT = -1;

CRIA TABELA PARA O BANCO DE DADOS

CREATE TABLE userposjava (
   id BIGINT NOT NULL,
   nome CHARACTER VARYING(255),
   email CHARACTER VARYING(255),
   CONSTRAINT user_pk PRIMARY KEY (id)

)

CRIAR UM REGISTRO NA TABELA userposjava

INSERT INTO userposjava (id, nome, email)
VALUES (1, 'Janitor', 'janitorcacule@hotmail.com');

INSERT INTO public.userposjava(
            id, nome, email)
    VALUES (2, 'joão', 'teste@gmail.com');


LER TODAS AS COLULAS (*) DA TABELA userposjava

SELECT * FROM userposjava



*/