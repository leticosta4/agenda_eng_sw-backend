
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS agenda (
    "id" UUID NOT NULL DEFAULT uuid_generate_v4(),
    "nome" VARCHAR(50) NOT NULL,
    PRIMARY KEY("id")
);

CREATE TABLE IF NOT EXISTS contato (
    "id" UUID NOT NULL DEFAULT uuid_generate_v4(),
    "agenda_id" UUID DEFAULT NULL,
    "nome" VARCHAR(50) NOT NULL,
    "telefone" VARCHAR(11) NOT NULL,
    PRIMARY KEY("id"),
    CONSTRAINT "FK_agenda_id" FOREIGN KEY ("agenda_id") REFERENCES "agenda"("id") ON UPDATE CASCADE ON DELETE SET NULL
);

