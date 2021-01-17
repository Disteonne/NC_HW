CREATE TABLE public."Location"
(
    location_name "char"[] NOT NULL,
    country_name "char"[] NOT NULL,
    address "char" NOT NULL,
    postal_code "char"[] NOT NULL,
    CONSTRAINT "Location_pkey" PRIMARY KEY (location_name)
)

TABLESPACE pg_default;

ALTER TABLE public."Location"
    OWNER to postgres;