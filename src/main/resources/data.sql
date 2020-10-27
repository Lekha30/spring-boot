
INSERT INTO Person (name, phone_number, email_address) VALUES
    ('Alex', 0412345678, 'alex@abc.com'),
    ('Bob', 0412345679, 'bob@abc.com'),
    ('Cyril', 0470345679, 'cyril@abc.com');

INSERT INTO Book (title, author, isbn, publication, person_id) VALUES
('The Wings of Fire', 'Abdul Kalaam', 91234876108424, 'Oxford', [1,3]),
('The Lost Symbol', 'Dan Brown', 91234872308424, 'Oxford', [1]),
('False Impression', 'Jeffery Archer', 91564876108412, 'Oxford', [2,3]);