create table Endereco (
    ID INT primary key auto_increment,
    Endereco varchar(100),
    Num varchar(100),
    Complemento varchar(150),
    Cep varchar(9),
    cnpj varchar(20)
);

insert into Endereco (Endereco, Num, Complemento, Cep, cnpj) values ('Av. Elisio Texeira Leite', '960', 'Bloco 3 Apto 18', '09876-000',  '96.044.446/0001-97');
insert into Endereco (Endereco, Num, Complemento, Cep, cnpj) values ('Rua Jose Debieux', '145', 'Esquina Rua Sem Saida', '09656-000', '88.430.859/0001-81');
insert into Endereco (Endereco, Num, Complemento, Cep, cnpj) values ('Rua Fox', '55', 'Bloco 2 Apto 45', '12176-000', '89.261.045/0001-23');
insert into Endereco (Endereco, Num, Complemento, Cep, cnpj) values ('Av. Pampulha', '676', 'Casa 2', '09800-000', '36.600.129/0001-88');
insert into Endereco (Endereco, Num, Complemento, Cep, cnpj) values ('Rua Leblom', '135', 'Apto 69', '09876-001', '36.154.775/0001-69');