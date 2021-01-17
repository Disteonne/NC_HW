CREATE TABLE public."Team"
(
    team_id serial NOT NULL,
    teamlead_id integer NOT NULL,
    project_id integer,
    CONSTRAINT "Team_pkey" PRIMARY KEY (team_id)
)

TABLESPACE pg_default;

ALTER TABLE public."Team"
    OWNER to postgres;