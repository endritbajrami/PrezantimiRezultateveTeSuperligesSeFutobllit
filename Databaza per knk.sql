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
create table REZULTATET2017_18
(Java integer,
Dita varchar(15),
Data_ora datetime,
Ekipi_vendas varchar(25),
Rezultati varchar(5),
Ekipi_mysafir varchar(25));

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

insert into Rangimi() values (1,1,"Drita",33,18,13,2,53,21,32,67 );
insert into Rangimi() values(2,2, "Prishtina",33,18,10,5,39,18,21,64);
insert into Rangimi() values(3,3,"KF Llapi",33,16,6,11,51,41,10,54);
insert into Rangimi() values(4,4,"Trepça",89,33,14,11,8,41,25,16,53);
insert into Rangimi() values(5,5 ,"KF-Feronikeli",33,10,18,5,32,18,14,48);
insert into Rangimi() values(6,6, "Drenica",33,13,9,11,34,27,7,48);
insert into Rangimi() values(7,7, "Liria",33,13,9,11,34,30,4,48);
insert into Rangimi() values(8,8, "Gjilani",33,10,16,7,29,21,8,46);
insert into Rangimi() values(9,9, "Vellaznimi",33,10,14,9,29,28,1,44);
insert into Rangimi() values(10,10, "Flamurtari",33,6,7,20,28,53,-25,25);
insert into Rangimi() values(11,11, "Besa Peje",33,6,4,23,28,64,-36,22);
insert into Rangimi() values(12,12, "Vllaznia Pozhoran",33,3,5,25,16,68,-52,14);

insert into BesaPeje() values(11, 1, "Kosove", 'Pt', "Visar Haxhijaj");
insert into BesaPeje() values(11, 3, "Kosove", 'Mb', "Fatlum Pishtani");
insert into BesaPeje() values(11, 4, "Kosove", 'Mb', "Mergim Rexhaj");
insert into BesaPeje() values(11, 5, "Kosove", 'Mb', "Rinor Berisha");
insert into BesaPeje() values(11, 7, "Kosove", 'Mf', "Liridon Balaj");
insert into BesaPeje() values(11, 8, "Kosove", 'Mf', "Donart Sheqerolli");
insert into BesaPeje() values(11, 9, "Kosove", 'SM', "Arber Hoxha");
insert into BesaPeje() values(11, 10, "Kosove", 'Mf', "Fetim Kasapi(Kapiten)");
insert into BesaPeje() values(11, 12,"Kosove", 'Pt', "Kreshnik Ndreca");
insert into BesaPeje() values(11, 13,"Kosove", 'Mf', "Florent Papuqi");
insert into BesaPeje() values(11, 14,"Kosove", 'Mf', "Elvis Hysenaj");
insert into BesaPeje() values(11, 15,"Kosove", 'Mb', "Landrit Rama");
insert into BesaPeje() values(11, 17,"Kosove", 'Sm', "Florent Qorraj");
insert into BesaPeje() values(11, 19,"Kosove", 'Mf',"Fatlum Gashi");
insert into BesaPeje() values(11, 21,"Kosove", 'Mf', "Fatlum Gashi");
insert into BesaPeje() values(11, 27,"Kosove", 'Mf', "Endrit Maloku");
insert into BesaPeje() values(11, 22,"Kosove", 'Mf', "Robert Gjeraj");
insert into BesaPeje() values(11, 2,"Kosove", 'Sm', "Shkëmbim Salihu");
insert into BesaPeje() values(11, 6,"Kosove", 'Mf', "Burim Fetahu");
insert into BesaPeje() values(11, 11,"Kosove", 'Mf',"Fatmir Molabecirovic");
insert into BesaPeje() values(11, 16,"Kosove", 'Sm',"Tihomir Živkovic");
insert into BesaPeje() values(11, 20,"Kosove", 'Mf',"Benjamin Rexha");

insert into Drita() values (1, 1, "Kosove" ,'Pt',"Leutrim Rexhepi");
insert into Drita ()values(1, 1,"Kosove",'Pt',"Leutrim Rexhepi");
insert into Drita  ()values(1, 2,"Kosove",'Mb',"Premton Isufi");
insert into Drita ()values (1, 4,"Kosove",'Mb',"Fidan Gërbeshi");
insert into Drita () values(1, 5,"Kosove",'Mb',"Ardian Limani (Kapiten)");
insert into Drita  ()values(1, 6,"Kosove",'Mb',"Taulant Haliti");
insert into Drita () values(1, 7,"Kosove",'Mf',"Endrit Krasniqi");
insert into Drita () values(1, 8,"Brazil",'Mf',"Edenilson");
insert into Drita () values(1, 9,"Brazil",'Sm',"Ricardo Verza" );
insert into Drita () values(1, 10,"Kosove",'Mf',"Xhevdet Shabani");
insert into Drita ()values(1, 11,"Kosove",'Mf',"Përparim Livoreka");
insert into Drita() values (1, 13,"Kosove",'Mb',"Liridon Leci");
insert into Drita() values (1,14,"Kosove",'Mf',"Fillonit Shaqiri");
insert into Drita ()values (1, 15,"Azerbajxhan",'Mf',"Amit Guluzade");
insert into Drita() values(1, 16,"Kosove",'Mf',"Albin Krasniqi");
insert into Drita ()values (1, 20,"Shqiperi",'Mf',"Erjon Vucaj");
insert into Drita ()values (1,21,"Kosove",'Mb',"Denis Haliti");
insert into Drita () values(1, 22,"Kosove",'Sm',"Betim Haxhimusa");
insert into Drita() values(1, 23,"Kosove",'Mb',"Arbër Shala");
insert into Drita() values(1, 25,"Kosove",'Mf',"Bujar Shabani");
insert into Drita()values (1, 27,"Shqiperi",'Sm',"Eri Lamçja");
insert into Drita()values (1, 29,"Shqiperi",'Mb',"Ervis Kaja");
insert into Drita() values (1, 31,"Shqiperi",'Pt',"Edvan Bakaj");
insert into Drita()values (1, 62,"Kosove",'Mb',"Viktor Kuka");
insert into Drita()values (1, 74,"Kosove",'Mf',"Zgjim Mustafa");
insert into Drita() values(1, 93,"Shqiperi",'Mf',"Haxhi Neziraj");
insert into Drita()values (1, 94,"Gjermani",'Mb',"Adonis Ruhani");
insert into Drita()values (1, 95,"Shqiperi",'Pt',"Krenar Ramadani");

insert into Flamurtari() values (10,1,"Kosove",'Pt',"Naser Prapashtica");
insert into Flamurtari() values (10,13,"Kosove",'Pt',"Naser Prapashtica");
insert into Flamurtari() values (10,14, "Kosove",'Pt',"Burim Fejza");
insert into Flamurtari() values (10,16, "Kosove",'Mb',"Blerim Kllokoqi");
insert into Flamurtari() values (10,18, "Kosove",'Mb',"Lekë Pula");
insert into Flamurtari() values (10 ,20, "Kosove",'Mb',"Bekim Isufi");
insert into Flamurtari() values (10,12, "Kosove",'Mb',"Besim Slishani");
insert into Flamurtari() values (10,13, "Kosove",'Mb',"Orhan Krasniqi");
insert into Flamurtari() values (10,15, "Kosove",'Mf',"Visar Zogiani");
insert into Flamurtari() values (10,19, "Kosove",'Mb',"Ngadhnjim Ademi");
insert into Flamurtari() values (10,2, "Kosove",'Mb',"Genc Shabanaj");
insert into Flamurtari() values (10,4, "Kosove",'Mb',"Arbnor Guci");
insert into Flamurtari() values (10,6, "Kosove",'Mf',"Faton Zejnullahu");
insert into Flamurtari() values (10,7, "Kosove",'Mf',"Lorik Sylejmani");
insert into Flamurtari() values (10,8, "Kosove",'Sm',"Arton Gashi");
insert into Flamurtari() values (10,3, "Kosove",'Sm',"Qendrim Sejdiu");
insert into Flamurtari() values (10,5, "Kosove",'Mf',"Artan Hajdari");
insert into Flamurtari() values (10,33, "Kosove",'Mf',"Shemsi Osmani");
insert into Flamurtari() values (10,26, "Kosove",'Sm',"Adonis Shaqiri");

insert into KFLlapi() values (3,2,"Kosove",'Mb',"Rron Statovci");
insert into KFLlapi() values (3,4,"Kosove",'Mb',"Bujar Idrizi");
insert into KFLlapi() values (3,5,"Shqiperi",'Mb',"Elvis Prençi");
insert into KFLlapi() values (3,7,"Kosove",'Mf',"Mentor Zhdrella");
insert into KFLlapi() values (3,8,"Kosove",'Mb',"Benjamin Emini");
insert into KFLlapi() values (3,10,"Kosove",'Mf',"Edon Zeqiri");
insert into KFLlapi() values (3,11,"Maqedoni",'Sm',"Miran Maksuti");
insert into KFLlapi() values (3,12,"Shqiperi",'Pt',"Egland Haxho");
insert into KFLlapi() values (3,13,"Kosove",'Pt',"Afrim Ademi");
insert into KFLlapi() values (3,14,"Kosove",'Mb',"Egzon Sinani");
insert into KFLlapi() values (3,15,"Kosove",'Mb',"Hajdin Salihu");
insert into KFLlapi() values (3,16,"Kosove",'Mf',"Hamdi Namani (captain)");
insert into KFLlapi() values (3,17,"Kosove",'Mf',"Arbnor Ramadani");
insert into KFLlapi() values (3,18,"Kosove",'Mb',"Ilir Blakqori");
insert into KFLlapi() values (3,19,"Kosove",'Sm',"Gentrit Begolli");
insert into KFLlapi() values (3,20,"Kosove",'Mf',"Behar Maliqi");
insert into KFLlapi() values (3,21,"Kosove",'Mf',"Flamur Bajrami");
insert into KFLlapi() values (3,23,"Kosove",'Mb',"Ardian Hoti");
insert into KFLlapi() values (3,24,"Kosove",'Sm',"Muhamet Hyseni");
insert into KFLlapi() values (3,25,"Maqedoni",'Sm',"Remzifaik Selmani");
insert into KFLlapi() values (3,27,"Shqiperi",'Sm',"Ahmed Januzi");
insert into KFLlapi() values (3,77,"Kosove",'Sm',"Valmir Veliu");
insert into KFLlapi() values (3,97,"Kosove",'Sm',"Festim Alidema");

insert into Prishtina() values (2,1,"Kosove",'Pt',"Alban Muqiqi");
insert into Prishtina() values (2,2,"Kosove",'Mb',"Armend Thaqi");
insert into Prishtina() values (2,3,"Gana",'Mf',"Jamal Arago");
insert into Prishtina() values (2,4,"Shqiperi",'Mb',"Armend Dallku (Kapiten)");
insert into Prishtina() values (2,5,"Kosove",'Mf',"Diar Miftaraj");
insert into Prishtina() values (2,7,"Kosove",'Mf',"Lorik Boshnjaku");
insert into Prishtina() values (2,8,"Kosove",'Mb',"Ahmet Haliti");
insert into Prishtina() values (2,9,"Gana",'Sm',"Basit Abdul Khalid");
insert into Prishtina() values (2,10,"Kosove",'Mf',"Meriton Korenica");
insert into Prishtina() values (2,12,"Kosove",'Pt',"Visar Bekaj ");
insert into Prishtina() values (2,13,"Gana",'Mb',"Abdul Bashiru");
insert into Prishtina() values (2,14,"Kosove",'Sm',"Bleon Sekiraqa");
insert into Prishtina() values (2,15,"Kongo",'Sm',"Gauthier Mankenda");
insert into Prishtina() values (2,16,"Kosove",'Mf',"Donat Hasanaj");
insert into Prishtina() values (2,17,"Kosove",'Mf',"Arbër Hoxha");
insert into Prishtina() values (2,19,"Maqedoni",'Sm',"Alen Jasharoski");
insert into Prishtina() values (2,20,"Kosove",'Mf',"Qëndrim Zyba");
insert into Prishtina() values (2,21,"Kosove",'Mf',"Argjend Mustafa");
insert into Prishtina() values (2,23,"Kosove",'Pt',"Laurit Behluli");
insert into Prishtina() values (2,27,"Shqiperi",'Sm',"Mario Morina");
insert into Prishtina() values (2,28,"Kosove",'Mb',"Leotrim Bekteshi");
insert into Prishtina() values (2,34,"Kosove",'Mf',"Agon Xhaka");
insert into Prishtina() values (2,66,"Kosove",'Mf',"Ergyn Ahmeti");
insert into Prishtina() values (2,77,"Kosove",'Mf',"Mërgim Pefqeli");

insert into VllazniaPozhoran() values (12,8,"Kosove",'Mf',"Maliq Behluli");
insert into VllazniaPozhoran() values (12,97,"Kosove",'Sm',"Festim Alidema");
insert into VllazniaPozhoran() values (12,17,"Kosove",'Sm',"Alban Shillova");
insert into VllazniaPozhoran() values (12,45,"Kosove",'Mb',"Festim Krasniqi");
insert into VllazniaPozhoran() values (12,4,"Kosove",'Mb',"Rron Statovci");
insert into VllazniaPozhoran() values (12,5,"Kosove",'Mb',"Albert Stublla");
insert into VllazniaPozhoran() values (12,10,"Kosove",'Sm',"Fuad Karabegu");
insert into VllazniaPozhoran() values (12,15,"Kosove",'Mf',"Erdin Hashani");
insert into VllazniaPozhoran() values (12,46,"Kosove",'Mf',"Armend Kastrati");
insert into VllazniaPozhoran() values (12,17,"Kosove",'Sm',"Bergin Maliqi");
insert into VllazniaPozhoran() values (12,1,"Kosove",'Pt',"Alban Rrexhepi");
insert into VllazniaPozhoran() values (12,8,"Kosove",'Mf',"Shkumbin Salihi");
insert into VllazniaPozhoran() values (12,85,"Kosove",'Mf',"Elbasan Thaqi");

insert into KFFeronikeli () values(5,4,"Kosove",'Mf',"Albert Dabiqaj");
insert into KFFeronikeli () values(5,5,"Kosove",'Mb',"Lapidar Lladrovci(Kapiten)");
insert into KFFeronikeli () values(5,6,"Kosove",'Mb',"Astrit Thaqi");
insert into KFFeronikeli () values(5,7,"Kosove",'Sm',"Mendurim Hoti");
insert into KFFeronikeli () values(5,8,"Shqiperi",'Sm',"Artur Magani");
insert into KFFeronikeli () values(5,9,"Kosove",'Sm',"Mevlan Zeka");
insert into KFFeronikeli () values(5,10,"Kosove",'Mf',"Astrit Fazliu");
insert into KFFeronikeli () values(5,11,"Brazil",'Mf',"Jean Carioca");
insert into KFFeronikeli () values(5,13,"Kosove",'Pt',"Florian Smakiqi");
insert into KFFeronikeli () values(5,15,"Kosove",'Mf',"Alush Gavazaj");
insert into KFFeronikeli () values(16,"Kosove",'Mf',"Albutrint Morina");
insert into KFFeronikeli () values(5,17,"Bregu I Fildishte",'Sm',"Hamed Koné");
insert into KFFeronikeli () values(5,19,"Kosove",'Mf',"Lulzim Doshlaku");
insert into KFFeronikeli () values(5,21,"Kosove",'Mb',"Përparim Islami");
insert into KFFeronikeli () values(5,24,"Kosove",'Sm',"Kastriot Rexha");
insert into KFFeronikeli () values(5,26,"Kosove",'Mf',"Rilind Lladrovci");
insert into KFFeronikeli () values(5,27,"Kosove",'Mf',"Met Millaku");
insert into KFFeronikeli () values(5,29,"Kosove",'Sm',"Riza Hoti");
insert into KFFeronikeli () values(5,30,"Kosove",'Mf',"Adonis Shala");
insert into KFFeronikeli () values(5,31,"Kosove",'Mf',"Arbër Ahmeti");
insert into KFFeronikeli () values(5,33,"Kosove",'Mb',"Arbër Prekazi");
insert into KFFeronikeli () values(5,39,"Kosove",'Pt',"Festim Krasniqi");
insert into KFFeronikeli () values(5,77,"Kosove",'Mf',"Dorent Hajdari");
insert into KFFeronikeli () values(5,93,"Poloni",'Pt',"Jacek Deniz Troshupa");
insert into KFFeronikeli () values(5,99,"Kosove",'Mb',"Yll Hoxha");

insert into Liria () values (7,1,"Kosove",'Pt',"Adel Salihi");
insert into Liria () values (7,2,"Kolombi",'Mb',"Armando Nieves");
insert into Liria () values (7,3,"Kosove",'Mb',"Rilind Kastrati");
insert into Liria () values (7,4,"Kosove",'Mb',"Ragip Thaqi");
insert into Liria () values (7,5,"Shqiperi",'Mb',"Florian Daci");
insert into Liria () values (7,6,"Kosove",'Mf',"Granit Osmanollaj");
insert into Liria () values (7,7,"Kosove",'Sm',"Albin Memaj");
insert into Liria () values (7,8,"Venezuele",'Mf',"Guillermo Ramírez Valdivia");
insert into Liria () values (7,9,"Uruguaj",'Mf',"Pio Martins");
insert into Liria () values (7,10,"Kosove",'Sm',"Liridon Fetahaj(Kapiten)");
insert into Liria () values (7,11,"Kosove",'Mb',"Qëndrim Gashi");
insert into Liria () values (7,12,"Kosove",'Pt',"Flamur Gashi");
insert into Liria () values (7,13,"Venezuele",'Mf',"Luís Jiménez Vivas");
insert into Liria () values (7,14,"Kosove",'Sm',"Petrit Gashi");
insert into Liria () values (7,15,"Kosove",'Mb',"Behar Dina");
insert into Liria () values (7,16,"Kosove",'Mf',"Gentian Benishi");
insert into Liria () values (7,17,"Kosove",'Mf',"Blendi Memaj");
insert into Liria () values (7,18,"Honduras",'Sm',"Roby Norales");
insert into Liria () values (7,19,"Kosove",'Sm',"Fatih Karahoda");
insert into Liria () values (7,20,"Kosove",'Mb',"Valon Bytyqi");
insert into Liria () values (7,21,"Shqiperi",'Mf',"Diellor Biseni");
insert into Liria () values (7,23,"Kolumbia",'Mb',"Jhonny Riascos");
insert into Liria () values (7,24,"Kosove",'Mf',"Ilir Mustafa");
insert into Liria () values (7,27,"Kosove",'Mf',"Fitim Susuri");
insert into Liria () values (7,31,"Kosove",'Pt',"Drilon Hodaj");

insert into Trepça89() values (4,1,"Kosove",'Pt',"Arben Beqiri");
insert into Trepça89() values (4,3,"Kosove",'Mb',"Milot Kamberi");
insert into Trepça89() values (4,4,"Gana",'Mb',"Asare Richard");
insert into Trepça89() values (4,5,"Shqiperi",'Mb',"Elton Basriu"); 
insert into Trepça89() values (4,6,"Kosove",'Mb',"Albert Kaqiku");
insert into Trepça89() values (4,7,"Kosove",'Sm',"Hasan Hyseni");
insert into Trepça89() values (4,8,"Shqiperi",'Mf',"Orgest Gava");
insert into Trepça89() values (4,9,"Kosove",'Sm',"Ardian Muja");
insert into Trepça89() values (4,10,"Kosove",'Mb',"Ylber Maloku(Kapiten)");
insert into Trepça89() values (4,11,"Kosove",'Mf',"Gëzim Rusi");
insert into Trepça89() values (4,12,"Kosove",'Pt',"Ardit Hyseni");
insert into Trepça89() values (4,14,"Shqiperi",'Sm',"Arb Manaj");
insert into Trepça89() values (4,15,"Kosove",'Mf',"Muharrem Jashari");
insert into Trepça89() values (4,16,"Mali",'Mf',"Lassine Traoré");
insert into Trepça89() values (4,17,"Nigeri",'Sm',"Djibril Diawara");
insert into Trepça89() values (4,19,"France",'Sm',"Franck Betra");
insert into Trepça89() values (4,20,"Kosove",'Pt',"Enes Çitaku");
insert into Trepça89() values (4,21,"Kosove",'Mb',"Arbër Pira");
insert into Trepça89() values (4,23,"Kosove",'Mb',"Ilir Izmaku");
insert into Trepça89() values (4,24,"Maqedoni",'Mb',"Aleksandar Bagašovski");
insert into Trepça89() values (4,25,"Kosove",'Mf',"Engjëll Hoti");
insert into Trepça89() values (4,29,"Shqiperi",'Mf',"Renato Hyshmeri");
insert into Trepça89() values (4,30,"Kosove",'Mf',"Taulant Avdyli");
insert into Trepça89() values (4,31,"Kosove",'Sm',"Urim Statovci");

insert into Stadiumet() values ("Drita","Stadiumi i qytetit Gjilan","Gjilan",10000,"Intelektualet");
insert into Stadiumet() values ("Besa" "Peje,Stadiumi Shahin Haxhiislami","Peje",8500,"Shqiponjat");
insert into Stadiumet() values ("Drenica","Stadiumi Bajram Aliu","Skenderaj",3000,"Shqiponjat e zeza");
insert into Stadiumet() values ("Flamurtari","Stadiumi Xhemal Ibishi","Prishtine",5000,"Armata Kuq e Zi");
insert into Stadiumet() values ("Gjilani","Stadiumi i qytetit Gjilan","Gjilan",15000,"Skifterat");
insert into Stadiumet() values ("KF Feronikeli","Stadiumi Rexhep Rexhepi","Drenas",6000,"Tigrat e Zi");
insert into Stadiumet() values ("KF LLapi","Stadiumi Zahir Pajaziti","Podujeve",10000,"Legjendat");
insert into Stadiumet() values ("Liria","Stadiumi Perparim Thaçi","Prizren",15000,"Arpagjikt");
insert into Stadiumet() values ("Prishtina","Stadiumi Fadil Vokrri","Prishtine",13500,"Bradh dhe kaltert");
insert into Stadiumet() values ("Trepça 89","Stadiumi Riza Lushta","Mitrovice",5000,"Minatoret");
insert into Stadiumet() values ("Vellaznimi","Stadiumi Qytetit Gjakove","Gjakove",6000,"Kuq e Zinjet");
insert into Stadiumet() values ("Vllaznia Pozheran","Stadiumi Ibrahim Kurteshi","Vitije","10000,Tigrat");





