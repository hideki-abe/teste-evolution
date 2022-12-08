CREATE SCHEMA public

CREATE TABLE public.pessoas (
  "idpessoas" SERIAL PRIMARY KEY NOT NULL,
  "cpf" VARCHAR(45) NOT NULL,
  "nome" VARCHAR(45) NOT NULL,
  "email" VARCHAR(45) NOT NULL,
  "cep" VARCHAR(45),
  "logradouro" VARCHAR(45),
  "complemento" VARCHAR(45),
  "bairro" VARCHAR(45),
  "uf" VARCHAR(45)
);

CREATE TABLE public.contatos (
  "idcontatos" SERIAL PRIMARY KEY NOT NULL,
  "nome" VARCHAR(45) NOT NULL,
  "telefone" VARCHAR(45) NOT NULL,
  "celular" VARCHAR(45) NOT NULL
);