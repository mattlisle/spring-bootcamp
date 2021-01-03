DROP TABLE IF EXISTS currency;
CREATE TABLE currency(
  id VARCHAR(3) PRIMARY KEY NOT NULL,
  usd_rate DECIMAL(20,6) NOT NULL
);
INSERT INTO currency(id,usd_rate) values('USD',1);
INSERT INTO currency(id,usd_rate) values('EUR',1.21);
INSERT INTO currency(id,usd_rate) values('INR',0.0136);
