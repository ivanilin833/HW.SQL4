--changeset Ilyin:1

create table persons
(
    name           varchar(10),
    surname        varchar(15),
    age            smallint,
    phone_number   varchar(11),
    city_of_living varchar(20),
    primary key (name, surname, age)
);
--rollback drop table persons

-- changeset Ilyin:2

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Иван', 'Иванов', 25, '12345678901', 'Москва');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Алексей', 'Петров', 30, '98765432101', 'Санкт-Петербург');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Екатерина', 'Сидорова', 22, '11122334455', 'Новосибирск');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ольга', 'Козлова', 28, '55566677788', 'Екатеринбург');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Дмитрий', 'Александров', 35, '99900011122', 'Казань');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Татьяна', 'Смирнова', 27, '33344455566', 'Нижний Новгород');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Сергей', 'Кузнецов', 32, '77788899900', 'Омск');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Марина', 'Морозова', 26, '12312345678', 'Омск');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Артем', 'Николаев', 31, '87654321098', 'Омск');

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Елена', 'Комарова', 29, '45678901234', 'Ростов-на-Дону');
