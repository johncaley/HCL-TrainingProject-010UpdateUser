CREATE Table User (
    userID int NOT NULL,
    username varchar(255),
    password varchar(255),
    address varchar(255),
    city varchar(55),
    state varchar(2),
    zipcode varchar(55),
    phone varchar(11),
    email varchar(255),
    PRIMARY KEY (userID)
);