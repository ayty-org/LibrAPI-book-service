CREATE TABLE book(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    specific_id VARCHAR(36) NOT NULL,
    isbn VARCHAR(17) UNIQUE NOT NULL,
    title VARCHAR(50) NOT NULL,
    synopsis VARCHAR(500) NOT NULL,
    author VARCHAR(50) NOT NULL,
    publication_year DATE NOT NULL,
    sell_price float8 NOT NULL,
    available_quantity INTEGER NOT NULL,
    category_id INTEGER NOT NULL
);

ALTER TABLE book ADD CONSTRAINT category_id_fk FOREIGN KEY (category_id) REFERENCES category(id);