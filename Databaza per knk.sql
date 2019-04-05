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

insert into Drenica () values (6,1,"Kosove",'Pt',"Arion Ymeri");
insert into Drenica () values (6,3,"Kosove",'Mb',"Drilon Bekteshi");
insert into Drenica () values (6,4,"Liberi",'Mb',"Prince Balde");
insert into Drenica () values (6,5,"Shqiperi",'Mb',"Arsen Sykaj");
insert into Drenica () values (6,6,"Kosove",'Mf',"Arbios Thaçi");
insert into Drenica () values (6,7,"Kosove",'Mf',"Hysen Tahiri");
insert into Drenica () values (6,8,"Kosove",'Mf',"Diar Mustafa");
insert into Drenica () values (6,9,"Kosove",'Mf',"Armend Abazi");
insert into Drenica () values (6,10,"Kosove",'Mf',"Argjend Bardhi");
insert into Drenica () values (6,11,"Kosove",'Mf',"Kreshnik Uka");
insert into Drenica () values (6,14,"Kosove",'Mf',"Atdhe Grajqevci");
insert into Drenica () values (6,16,"Kosove",'Mb',"Azem Bejta ");
insert into Drenica () values (6,17,"Kosove",'Mb',"Shkëlzen Lushtaku");
insert into Drenica () values (6,18,"Kosove",'Mf',"Besart Islamaj");
insert into Drenica () values (6,19,"Kosove",'Mb',"Adnan Haxhaj");
insert into Drenica () values (6,20,"Kosove",'Pt',"Besnik Shehu");
insert into Drenica () values (6,21,"Kosove",'Mf',"Taulant Dajaku(Kapiten)");
insert into Drenica () values (6,22,"Kosove",'Mf',"Drilon Osmani");
insert into Drenica () values (6,23,"Kosove",'Mf',"Ermal Veliqi");
insert into Drenica () values (6,24,"Kosove",'Mb',"Edon Pasoma");
insert into Drenica () values (6,25,"Kosove",'Mf',"Altin Vojvoda");
insert into Drenica () values (6,28,"Liberi",'Mf',"Nicholas Andrews");
insert into Drenica () values (6,45,"Kosove",'Sm',"Diar Prokshi");
insert into Drenica () values (6,77,"Kosove",'Mf',"Qemajl Elshani");
insert into Drenica () values (6,99,"Kosove",'Sm',"Osman Mëziu");

insert into Gjilani () values (8,1,"Kosove",'Pt',"Donat Kaqiu");
insert into Gjilani () values (8,2,"Kosove",'Mb',"Premton Isufi");
insert into Gjilani () values (8,3,"Kosove",'Mb',"Armend Halili");
insert into Gjilani () values (8,4,"Kosove",'Mb',"Ylber Kastrati(Kapiten)");
insert into Gjilani () values (8,6,"Shqiperi",'Mb',"Endrien Magani");
insert into Gjilani () values (8,7,"Shqiperi",'Mf',"Ansi Nika");
insert into Gjilani () values (8,8,"Kosove",'Mf',"Salih Kosumi");
insert into Gjilani () values (8,9,"Maqedoni",'Mf',"Shpend Asani");
insert into Gjilani () values (8,10,"Serbi",'Mf',"Semir Hadžibulic");
insert into Gjilani () values (8,11,"Kosove",'Mf',"Fiton Hajdari");
insert into Gjilani () values (8,12,"Kosove",'Pt',"Petrit Terziu");
insert into Gjilani () values (8,13,"Bregu i Fildishte",'Mf',"Kéita Alassane Raza");
insert into Gjilani () values (8,14,"Kosove",'Mf',"Arbër Mustafa");
insert into Gjilani () values (8,15,"Bregu i Fildishte",'Mf',"Kéita Lanzeni Aziz");
insert into Gjilani () values (8,17,"Shqiperi",'Df',"Vilson Lila");
insert into Gjilani () values (8,18,"Guatemala",'Sm',"Wilber Pérez");
insert into Gjilani () values (8,19,"Shqiperi",'Mf',"Kledi Koçi");
insert into Gjilani () values (8,20,"Kosove",'Mf',"Edison Kqiku");
insert into Gjilani () values (8,22,"Brazil",'Mf',"Jefferson");
insert into Gjilani () values (8,23,"Kosove",'Mf',"Roland Ajeti");
insert into Gjilani () values (8,25,"Kosove",'Mf',"Kushtrim Shabani");
insert into Gjilani () values (8,27,"Shqiperi",'Sm',"Vilfor Hysa");
insert into Gjilani () values (8,30,"Kosove",'Pt',"Kenan Haxhihamza");
insert into Gjilani () values (8,33,"Kosove",'Mb',"Fisnik Papuçi");

insert into Vllaznimi () values (9,1,"Kosove",'Pt',"Alban Gecaj");
insert into Vllaznimi () values (9,5,"Kosove",'Mb',"Yll Myrta");
insert into Vllaznimi () values (9,3,"Kosove",'Mb',"Gentian Mazrekaj");
insert into Vllaznimi () values (9,4,"Kosove",'Mb',"Ilir Syla");
insert into Vllaznimi () values (9,5,"Kosove",'Mb',"Besnik Krasniqi");
insert into Vllaznimi () values (9,6,"Nigeria",'Sm',"Odi Henry Chibuze");
insert into Vllaznimi () values (9,17,"Kosove",'Mf',"Lorik Rudi");
insert into Vllaznimi () values (9,20,"Kosove",'Mf',"Jeton Dushi");
insert into Vllaznimi () values (9,9,"Kosove",'Sm',"Leke Vula");
insert into Vllaznimi () values (9,3,"Kosove",'Mb',"Tun Bardhoku");
insert into Vllaznimi () values (9,11,"Kosove",'Sm',"Egzon Gashi");
insert into Vllaznimi () values (9,8,"Kosove",'Mf',"Ardit Vokshi");
insert into Vllaznimi () values (9,13,"Kosove",'Pt',"Artik Muhaxhiri");
insert into Vllaznimi () values (9,6,"Kosove",'Mf',"Kushtrim Gashi");
insert into Vllaznimi () values (9,2,"Kosove",'Mb',"Yll Myrta");




