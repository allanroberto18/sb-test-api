CREATE TABLE IF NOT EXISTS products (
    id serial PRIMARY KEY,
    product_group_id int not null,
    name VARCHAR(150) NOT NULL,
    description TEXT,
    price NUMERIC(10,2) NOT NULL,
    enabled BOOLEAN DEFAULT TRUE,
    constraint products_groups_fk
        FOREIGN KEY (product_group_id)
            REFERENCES products_groups(id)
);

CREATE UNIQUE INDEX IF NOT EXISTS products_group_id_name_idx ON products (product_group_id, name);