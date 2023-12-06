create table if not exists prime
(
    id varchar primary key,
    value text,
    creation_datetime timestamp default CURRENT_TIMESTAMP
);