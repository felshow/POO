CREATE TABLE public.venda
        (
        id_venda SERIAL,
        data_venda character varying NOT NULL,
        id_pessoa_fk integer NOT NULL,
        id_carro_fk integer NOT NULL,
        CONSTRAINT venda_pkey PRIMARY KEY (id_venda),
        CONSTRAINT venda_id_carro_fk_fkey FOREIGN KEY (id_carro_fk)
        REFERENCES public.carro (numero_chassi) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION,
        CONSTRAINT venda_id_pessoa_fk_fkey FOREIGN KEY (id_pessoa_fk)
        REFERENCES public.pessoa (cpf) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION,
        CONSTRAINT venda_id_carro_fk_key UNIQUE (id_carro_fk)
        )