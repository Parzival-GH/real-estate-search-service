insert into currency_type (active, name)
values (true, 'Доллар'),
       (true, 'Сом');

insert into exchange_types (name, active)
values ('Рассмотрю варианты', true),
       ('С доплатой продавца', true),
       ('Ключ на ключ', true),
       ('Обмен не предлагать', true);

insert into heating_types (name, active)
values ('Электрическое', true),
       ('Центральное', true),
       ('На газе', true),
       ('Без отопления', true);

insert into installment (name, active)
values ('Да', true),
       ('Нет', true);

insert into mortgage (name, active)
values ('Да', true),
       ('Нет', true);

insert into room_count (room_count, active)
values ('1', true),
       ('2', true),
       ('3', true),
       ('4', true),
       ('5', true),
       ('6', true),
       ('6 и более', true);

insert into series (name, active)
values ('Индивид. планировка', true),
       ('102', true),
       ('104', true),
       ('Сталинка', true),
       ('Хрущевка', true),
       ('Элитка', true);

insert into states (name, active)
values ('Под самоотделку', true),
       ('Евроремонт', true),
       ('Хорошее', true),
       ('Среднее', true),
       ('Не достроено', true);

insert into transaction_types(name, active)
values ('Аренда', true),
       ('Покупка', true);

insert into type_of_structure (name, active)
values ('Кирпичный', true),
       ('Панельный', true),
       ('монолитный', true);

insert into price_type (name, active)
values ('За м2', true),
       ('За все', true);

insert into property_types(active, name)
values (true,'Квартира'),
       (true,'Дом'),
       (true,'Комм. недвижимость'),
       (true,'Комната'),
       (true,'Участок'),
       (true,'Дача'),
       (true,'Гараж/паркинг');

insert into location_types(active, name)
values (true, 'Страна'),
       (true, 'Регион'),
       (true, 'Населенный пункт'),
       (true, 'Район');

insert into location (active, name, location_id, location_type_id)
values (true, 'Кыргызстан', null, 1),

       (true, 'Чуйская обл.', 1, 2),
       (true, 'Иссык-кульская обл.', 1, 2),

       (true, 'Бишкек', 2,3),
       (true, 'Каракол', 3, 3),

       (true, 'Октябрьский', 4,4),
       (true, 'Ак-Суу', 5,4);