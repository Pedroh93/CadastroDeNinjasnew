--Migrations para add coluna de rank na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN IF NOT EXISTS rank VARCHAR(255);