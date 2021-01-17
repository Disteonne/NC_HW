CREATE TABLE public."Customer"
(
    customer_code serial NOT NULL,
    first_name "char"[] NOT NULL,
    last_name "char"[] NOT NULL,
    phone_num "char"[],
    address "char"[] NOT NULL,
    postal_code "char"[] NOT NULL,
    country "char"[] NOT NULL,
    fax "char"[],
    city "char"[] NOT NULL,
    CONSTRAINT "Customer_pkey" PRIMARY KEY (customer_code)
)

TABLESPACE pg_default;

ALTER TABLE public."Customer"
    OWNER to postgres;