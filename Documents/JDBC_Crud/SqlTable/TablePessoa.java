CREATE TABLE public.pessoa
        (
        cpf integer NOT NULL,
        rg integer NOT NULL,
        idade integer NOT NULL,
        nome character varying NOT NULL,
        CONSTRAINT pessoa_pkey PRIMARY KEY (cpf),
        CONSTRAINT pessoa_rg_key UNIQUE (rg)
