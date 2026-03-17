CREATE TABLE IF NOT EXISTS products_groups (
    id serial PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    enabled BOOLEAN DEFAULT TRUE
);

CREATE INDEX IF NOT EXISTS products_groups_name_idx ON products_groups (name);