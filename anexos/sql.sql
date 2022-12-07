CREATE SCHEMA public
CREATE TABLE public.pessoas (
  "idpessoas" SERIAL PRIMARY KEY NOT NULL,
  "cpf" VARCHAR(45),
  "nome" VARCHAR(45),
  "email" VARCHAR(45),
  "cep" VARCHAR(45),
  "logradouro" VARCHAR(45),
  "complemento" VARCHAR(45),
  "bairro" VARCHAR(45),
  "uf" VARCHAR(45)
);

CREATE TABLE public.contatos (
  "idcontatos" SERIAL PRIMARY KEY NOT NULL,
  "nome" VARCHAR(45),
  "telefone" VARCHAR(45),
  "celular" VARCHAR(45),
  "pessoas_idpessoas" INT NOT NULL
);

CREATE INDEX "fk_contatos_pessoas_idx" ON "contatos" ("pessoas_idpessoas");

ALTER TABLE "contatos" ADD CONSTRAINT "fk_contatos_pessoas" FOREIGN KEY ("pessoas_idpessoas") REFERENCES "pessoas" ("idpessoas") ON DELETE NO ACTION ON UPDATE NO ACTION;
