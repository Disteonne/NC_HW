CREATE TABLE public."Project"
(
    project_id serial NOT NULL,
	project_name "char"[] NOT NULL,
    cost double precision NOT NULL,
    start_date date NOT NULL,
    deadline_date date NOT NULL,
    customer_code integer NOT NULL,
    project_requierements "char"[] NOT NULL,
    CONSTRAINT "Project_pkey" PRIMARY KEY (project_id, project_name)
)

TABLESPACE pg_default;

ALTER TABLE public."Project"
    OWNER to postgres;