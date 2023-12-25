create schema master;



CREATE TABLE IF NOT EXISTS master.status
(
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    description character varying(200),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS master.flag_type
(
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    description character varying(200),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS master.flag
(
    id integer NOT NULL,
    flagtype integer,
    name character varying(50),
    description text,
    parentflag integer,
    PRIMARY KEY (id)
);

ALTER TABLE master.flag
	ADD CONSTRAINT flag_flagtype_fk
	FOREIGN KEY (flagtype)
	REFERENCES master.flag_type (id)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION;

CREATE TABLE IF NOT EXISTS master.units
(
    id SERIAL PRIMARY KEY,
    name character varying(50)
);

CREATE TABLE IF NOT EXISTS master.product
(
    id integer NOT NULL,
    name character varying(500) NOT NULL,
    description text,
    units integer,
    display_name character varying(500),
    status integer,
    created_time timestamp without time zone,
    updated_time timestamp without time zone,
    PRIMARY KEY (id)
);

ALTER TABLE master.product
	ADD CONSTRAINT product_units_fk
	FOREIGN KEY (units)
	REFERENCES master.units (id)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION;


CREATE TABLE master.unit_conversions (
    id SERIAL PRIMARY KEY,
    product INT,
    from_unit_id INT,
    to_unit_id INT,
    conversion_rate NUMERIC(10,5) NOT NULL,
    FOREIGN KEY (product) REFERENCES master.product(id),
    FOREIGN KEY (from_unit_id) REFERENCES master.units(id),
    FOREIGN KEY (from_unit_id) REFERENCES master.units(id)
);


CREATE TABLE IF NOT EXISTS master.sku
(
    id SERIAL PRIMARY KEY,
    product integer NOT NULL,
    name character varying(500),
    stock numeric(25, 5),
    units int,
	PRBT numeric(25, 5),
	PRAT numeric(25, 5),
	SRBT numeric(25, 5),
	SRAT numeric(25, 5),
	MRP numeric(25, 5),
    status integer NOT NULL,
    availability_tag character varying(50),
    created_time timestamp without time zone,
    updated_time timestamp without time zone,
    FOREIGN KEY (product) REFERENCES master.product(id),
    FOREIGN KEY (units) REFERENCES master.units(id),
    FOREIGN KEY (status) REFERENCES master.status(id)
);

CREATE TABLE master.variant (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);


CREATE TABLE master.product_variant (
    id SERIAL PRIMARY KEY,
    product INT REFERENCES master.product(id),
    variant_id INT REFERENCES master.variant(id)
);

CREATE TABLE master.sku_variant (
    id SERIAL PRIMARY KEY,
    sku INT REFERENCES master.sku(id),
    variant INT REFERENCES master.variant(id),
    value VARCHAR(50) NOT NULL
);



