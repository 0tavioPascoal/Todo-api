CREATE TABLE tb_todo(
    id  INT NOT NULL PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(300),
    completed BIT
);