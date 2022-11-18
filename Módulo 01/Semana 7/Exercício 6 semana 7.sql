CREATE DATABASE Empresa;

CREATE TABLE Empregados(
id_emp INT NOT NULL AUTO_INCREMENT,
nome_emp VARCHAR(100) NOT NULL,
endereco VARCHAR(100) NOT NULL,
idade TINYINT NOT NULL,
PRIMARY KEY (id_emp)
)

CREATE TABLE Cargos(
id_cargo INT NOT NULL AUTO_INCREMENT,
nome_cargo VARCHAR(50) NOT NULL,
PRIMARY KEY (id_cargo)
)

CREATE TABLE Gestores(
id_gestor INT NOT NULL AUTO_INCREMENT,
nome_gestor VARCHAR(100) NOT NULL,
PRIMARY KEY (id_gestor)
)
SELECT * FROM gestores;

INSERT INTO Empregados (nome_emp, endereco, idade)
VALUES('Marta Silva', 'Rua dos Bobos, 0', '34'),
('Cristiane Roseira', 'Rua dos Bobos, 1', '32'),
('Beatriz Zaneratto', 'Rua dos Bobos, 2','28'),
('Tamires Dias', 'Rua dos Bobos, 3', '35'),
('Ary Borges', 'Rua dos Bobos, 4', '22'),
('Ludmilla da Silva', 'Rua dos Bobos, 5', '20'),
('Leticia Silva','Rua dos Bobos, 6', '18'),
('Milene Maia','Rua dos Bobos, 7','20'),
('Gabriela Nunes','Rua dos Bobos, 8','25'),
('Miraildes Mota','Rua dos Bobos, 9','44');


INSERT INTO cargos (nome_cargo)
VALUES
('Atacante de Investimentos'),
('Centroavante de Resultados'),
('Pivô de Relacionamentos'),
('Defensora de Dados'),
('Criadora de Projetos'),
('Impulsionadora de Projetos'),
('Guarda Redes'),
('Auxiliar de Limpeza'),
('Recursos Humanos'),
('Volante de Negócios');

INSERT INTO gestores (nome_gestor)
VALUES
('Ana Paula'),
('Tiago Albuquerque'),
('Gabriel Augustin'),
('Andrezza Damasceno'),
('Gustavo Dias'),
('Anelise Silva'),
('Silvana Pekel'),
('Marina Hoffmann'),
('Fabiane Zanoni'),
('Laura Zanoni');