CREATE EXTENSION IF NOT EXISTIS "uuid-ossp"

CREATE TABLE IF NOT EXISTS contato{
    id UUID  NOT NULL generate_random_uuid(),
    agenda_id UUID NOT NULL
    nome VARCHAR(50) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    PRIMARY KEY("id")
    CONSTRAINT "FK_agenda_id" FOREIGN KEY ("agenda_id") REFERENCES "agenda"("id") ON UPDATE CASCADE ON DELETE,
}

CREATE TABLE IF NOT EXISTIS agenda{
    id UUID NOT NULL generate_random_uuid(),
    nome VARCHAR(50) NOT NULL,
    PRIMARY KEY("id")
}