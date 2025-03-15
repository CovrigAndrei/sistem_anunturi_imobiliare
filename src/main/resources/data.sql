-- Insert into UTILIZATOR table
INSERT INTO UTILIZATOR (nume, email, telefon) VALUES ('Ion Popescu', 'john@example.com', '123456789');
INSERT INTO UTILIZATOR (nume, email, telefon) VALUES ('Maria Bogza', 'mary@example.com', '987654321');
INSERT INTO UTILIZATOR (nume, email, telefon) VALUES ('Mihai Enache', 'mike@example.com', '555555555');

-- Insert into IMOBIL table
INSERT INTO IMOBIL (tip, suprafata, adresa) VALUES ('Apartament', 75.5, 'Str. Mihai Eminescu 12, Bucuresti');
INSERT INTO IMOBIL (tip, suprafata, adresa) VALUES ('Casa', 120.0, 'Str. Florilor 5, Cluj-Napoca');
INSERT INTO IMOBIL (tip, suprafata, adresa) VALUES ('Apartament', 60.0, 'Str. Libertatii 8, Timisoara');

-- Insert into ANUNT table (referencing UTILIZATOR and IMOBIL)
INSERT INTO ANUNT (titlu, pret, utilizator_id, imobil_id) VALUES ('Apartament de vanzare in Bucuresti', 85000.00, 1, 1);
INSERT INTO ANUNT (titlu, pret, utilizator_id, imobil_id) VALUES ('Casa spatioasa in Cluj', 150000.00, 2, 2);
INSERT INTO ANUNT (titlu, pret, utilizator_id, imobil_id) VALUES ('Apartament modern in Timisoara', 65000.00, 3, 3);