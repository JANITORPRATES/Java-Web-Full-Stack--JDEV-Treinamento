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


SELECIONA SÓ A COLUNA id 
	SELECT id FROM userposjava


ATUALIZA REGISTRO DA TABELA ONDE ID = 2
UPDATE userposjava SET nome = 'nome atualizado' WHERE id = 2;


CRIAR UMA SEQUENCIA
CREATE SEQUENCE usersequence
INCREMENT 1
MINVALUE 1
MAXVALUE 2147483647
start 3;

CONFIGURAR O id COM A SEQUENCIA CRIADA
ALTER TABLE userposjava ALTER COLUMN id SET DEFAULT nextval('usersequence'::regclass);

DELETAR
DELETE FROM userposjava WHERE id = " + id


CONFIGURAR PRIMARY KEY
ALTER TABLE userposjava ADD UNIQUE (id);


CRIAÇÃO DE UMA TABELA COM CHAVE ESTRANGEIRA
CREATE TABLE telefoneuser
(
id BIGINT NOT NULL,
numero CHARACTER VARYING(255) NOT NULL,
tipo CHARACTER VARYING(255) NOT NULL,
usuariopessoa BIGINT NOT NULL,
CONSTRAINT telefone_id PRIMARY KEY (id));


ALTER TABLE telefoneuser ADD FOREIGN KEY (usuariopessoa) REFERENCES userposjava(id)



MOSTRAR TODOS OS DADOS UNIDOS DAS DUAS TABELAS
SELECT * FROM telefoneuser AS fone INNER JOIN userposjava AS userp ON fone.usuariopessoa = userp.id


MOSTRAR OS DADOS UNIDOS numero e nome DAS DUAS TABELAS
SELECT numero, nome FROM telefoneuser AS fone INNER JOIN userposjava AS userp ON fone.usuariopessoa = userp.id

MOSTRAR coluna nome antes da coluna numero
SELECT nome, numero FROM telefoneuser AS fone INNER JOIN userposjava AS userp ON fone.usuariopessoa = userp.id

MOSTRAR coluna nome, coluna numero MAIS todas as colunas da tabela inclusive repete as colunas nome e numero
SELECT nome, numero, * FROM telefoneuser AS fone INNER JOIN userposjava AS userp ON fone.usuariopessoa = userp.id


Selecionando todas as colunas da tabela telefoneusário juntanto com a tabela userposjava ONDE (ON) a tabela telefone na coluna de usuario é igual ao
id da tabela userposjava ONDE (WHERE) usuário é 10
SELECT * FROM telefoneuser AS fone INNER JOIN userposjava AS userp ON fone.usuariopessoa = userp.id WHERE userp.id = 10


*/