CREATE TABLE produtos (id INT PRIMARY KEY, nome VARCHAR(256) NOT NULL, descricao VARCHAR(256), quantidade INT NOT NULL);

INSERT INTO produtos VALUES (1, 'Geladeira', 'Utensílio eletrodoméstico utilizado na conservação de alimentos', 10);
INSERT INTO produtos VALUES (2, 'Fogão', 'Utensílio culinário usado para cozinhar, geralmente em panelas ou frigideiras, e por meio de calor', 32);
INSERT INTO produtos VALUES (3, 'Máquina de lavar roupas', 'Máquina projetada para limpeza de roupas', 6);
INSERT INTO produtos VALUES (4, 'Ar Condicionado', 'Responsável pelo tratamento do ar interior em espaços fechados', 14);
INSERT INTO produtos VALUES (5, 'Lava-louça', 'Aparelho eletrodoméstico cuja finalidade é lavar os apetrechos utilizados na cozinha ', 27);
INSERT INTO produtos VALUES (6, 'Micro-ondas', 'Aparelho eletrodoméstico que possibilita a preparação rápida de alimentos para o consumo humano ou de animais', 10);

SELECT * FROM produtos;