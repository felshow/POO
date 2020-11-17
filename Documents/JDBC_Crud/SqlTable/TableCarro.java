CREATE TABLE public.carro
        (
        numero_chassi integer NOT NULL,
        nome character varying NOT NULL,
        cor character varying NOT NULL,
        ano integer NOT NULL,
        potencia integer NOT NULL,
        valor double precision NOT NULL,
        CONSTRAINT carro_pkey PRIMARY KEY (numero_chassi)
        )