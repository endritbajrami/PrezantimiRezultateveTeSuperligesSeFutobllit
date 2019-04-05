create database knk;
create table Rangimi
(eid integer,
Nr integer,
Ekipi varchar(25),
NrLojëve integer,
Fitore integer,
Barazime integer,
Humbje integer,
Golplus integer,
Golminus integer,
Average integer,
Pikët integer,
Primary key(eid));

create table RangimiVendor
(eid integer,
Nr integer,
Ekipi varchar(25),
NrLojëve integer,
Fitore integer,
Barazime integer,
Humbje integer,
Golplus integer,
Golminus integer,
Average integer,
Pikët integer,
foreign key(eid) references Rangimi(eid));

create table RangimiMysafir
(eid integer,
Nr integer,
Ekipi varchar(25),
NrLojëve integer,
Fitore integer,
Barazime integer,
Humbje integer,
Golplus integer,
Golminus integer,
Average integer,
Pikët integer,
foreign key(eid) references Rangimi(eid));

create table BesaPeje
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Trepça89
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Prishtina
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Liria
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table KFLlapi
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table KFFeronikeli
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Gjilani
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Flamurtari
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Drita
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Drenica
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Vllaznimi
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table VllazniaPozhoran
(eid integer,
Numri integer,
Shtetesia varchar(20),
Pozicioni char(2),
EmriMbiemri varchar(30),
foreign key(eid) references Rangimi(eid));

create table Ekipet
(eid integer,
Ekipi varchar(25),
Presidenti varchar(25),
Trajneri varchar(25),
FanellatVendas varchar(30),
FanellatMysafir varchar(30),
foreign key(eid) references Rangimi(eid));

create table Stadiumet
(eid integer,
Ekipi varchar(25),
EmriStadiumit varchar(40),
Qyteti varchar(20),
Kapaciteti integer,
Nofka varchar(30),
foreign key(eid) references Rangimi(eid));





