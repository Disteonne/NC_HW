CREATE TABLE public."Employee"
(
    employee_code serial NOT NULL,
    team_id integer,
    manager_id integer,
    location_name "char"[] NOT NULL,
    first_name "char"[] NOT NULL,
    last_name "char"[] NOT NULL,
    phone_num "char"[],
    address "char"[] NOT NULL,
    country "char"[] NOT NULL,
    postal_code "char"[] NOT NULL,
    email "char"[],
    birth_date date NOT NULL,
    hire_date date NOT NULL,
    "position" "char"[] NOT NULL,
    salary double precision NOT NULL,
    commission_pct double precision NOT NULL,
    PRIMARY KEY (employee_code)
);

ALTER TABLE public."Employee"
    OWNER to postgres;