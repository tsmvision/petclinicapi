CREATE TABLE IF NOT EXISTS vets (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    INDEX(last_name)
);

CREATE TABLE IF NOT EXISTS specialties (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(80),
    INDEX(name)
);

CREATE TABLE IF NOT EXISTS vet_specialties (
    vet_id INTEGER UNSIGNED NOT NULL,
    specialty_id INTEGER UNSIGNED NOT NULL,
    FOREIGN KEY (vet_id) REFERENCES vets(id),
    FOREIGN KEY (specialty_id) REFERENCES specialties(id),
    UNIQUE (vet_id, specialty_id)
);

CREATE TABLE IF NOT EXISTS types (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(80),
    INDEX(name)
);

CREATE TABLE IF NOT EXISTS owners (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    address VARCHAR(255),
    city VARCHAR(80),
    telephone VARCHAR(20),
    INDEX(last_name)
);

CREATE TABLE IF NOT EXISTS pets (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    birth_date DATE,
    type_id INTEGER UNSIGNED NOT NULL,
    owner_id INTEGER UNSIGNED NOT NULL,
    INDEX(name),
    FOREIGN KEY (type_id) REFERENCES types(id),
    FOREIGN KEY (owner_id) REFERENCES owners(id)
);

CREATE TABLE IF NOT EXISTS visits (
    id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pet_id INTEGER UNSIGNED NOT NULL,
    visit_date DATE,
    description VARCHAR(255),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);

