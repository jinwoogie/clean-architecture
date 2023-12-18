DROP TABLE IF EXISTS Member;

CREATE TABLE Member
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(255),
    password VARCHAR(255)
);
