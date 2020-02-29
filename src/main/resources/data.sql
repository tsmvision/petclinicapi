INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (1, 'Elias', 'Koelpin');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (2, 'Giovanna', 'Stamm');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (3, 'Leif', 'Schimmel');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (4, 'Dennis', 'Schmidt');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (5, 'Adolf', 'Larkin');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (6, 'Noah', 'Maggio');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (7, 'Noemi', 'Gerhold');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (8, 'Mariah', 'Welch');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (9, 'Lexi', 'Walter');
INSERT INTO `vets` (`id`, `first_name`, `last_name`)
VALUES (10, 'Garett', 'Denesik');

INSERT INTO `owners`
VALUES ('1', 'Dino', 'Beer', '985 Lesly Ports Apt. 575\nLake Jarvis, MD 01945', 'Rosariofort', '641-236-9019');

INSERT INTO `owners`
VALUES ('2', 'Lyda', 'Davis', '69065 Weber Lights\nSierrashire, RI 98329', 'Cleoraport', '+40(3)5160227149');

INSERT INTO `owners`
VALUES ('3', 'Eileen', 'Greenfelder', '24050 Sylvester Port\nNorth Abigail, TN 58466', 'New Stephonport',
        '229.370.6044x6477');
INSERT INTO `owners`
VALUES ('4', 'Brittany', 'Russel', '80989 Keeling Burg\nAbshireview, WA 12405', 'New Loy', '+70(9)2928462616');

INSERT INTO `owners`
VALUES ('5', 'Libby', 'Schmidt', '2112 Sipes Centers\nWest Deshaunchester, IL 01246', 'West Aliciamouth',
        '(327)288-2461x65489');
INSERT INTO `owners`
VALUES ('6', 'Rylee', 'McGlynn', '555 Madisen Ways Apt. 716\nHettingerland, WV 75228-7739', 'West Jerry',
        '353.113.3167');
INSERT INTO `owners`
VALUES ('7', 'Jordon', 'Witting', '634 Eleanora Neck Apt. 848\nWest Lizeth, IA 37145-2254', 'West Haylee',
        '122.996.5865');
INSERT INTO `owners`
VALUES ('8', 'Clark', 'Roob', '2115 Stehr Station Suite 441\nLake Aaliyahborough, VA 36138', 'Bartellview',
        '028-195-8167x6944');
INSERT INTO `owners`
VALUES ('9', 'Oleta', 'Mayert', '4588 Oscar Mall\nBrookeview, WY 16310-2895', 'Ryderport', '(696)504-5168x653');

INSERT INTO `owners`
VALUES ('10', 'Jamison', 'Roob', '355 Legros Bypass Apt. 941\nJacklynmouth, IA 09960-2115', 'Walkerside',
        '005-638-7006x24985');

INSERT INTO `types` (`id`, `name`) VALUES (6, 'corporis');
INSERT INTO `types` (`id`, `name`) VALUES (7, 'doloremque');
INSERT INTO `types` (`id`, `name`) VALUES (8, 'enim');
INSERT INTO `types` (`id`, `name`) VALUES (4, 'id');
INSERT INTO `types` (`id`, `name`) VALUES (2, 'itaque');
INSERT INTO `types` (`id`, `name`) VALUES (3, 'nihil');
INSERT INTO `types` (`id`, `name`) VALUES (9, 'numquam');
INSERT INTO `types` (`id`, `name`) VALUES (10, 'quo');
INSERT INTO `types` (`id`, `name`) VALUES (1, 'ullam');
INSERT INTO `types` (`id`, `name`) VALUES (5, 'voluptas');

INSERT INTO `specialties` (`id`, `name`) VALUES (3, 'ad');
INSERT INTO `specialties` (`id`, `name`) VALUES (9, 'est');
INSERT INTO `specialties` (`id`, `name`) VALUES (2, 'nihil');
INSERT INTO `specialties` (`id`, `name`) VALUES (10, 'perferendis');
INSERT INTO `specialties` (`id`, `name`) VALUES (5, 'quod');
INSERT INTO `specialties` (`id`, `name`) VALUES (1, 'sit');
INSERT INTO `specialties` (`id`, `name`) VALUES (7, 'totam');
INSERT INTO `specialties` (`id`, `name`) VALUES (8, 'ut');
INSERT INTO `specialties` (`id`, `name`) VALUES (6, 'vel');
INSERT INTO `specialties` (`id`, `name`) VALUES (4, 'velit');

INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (1, 'accusamus', '2008-02-19', 1, 1);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (2, 'voluptas', '2008-12-31', 1, 2);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (3, 'dolores', '1994-02-02', 2, 3);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (4, 'consequatur', '1998-09-03', 4, 3);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (5, 'unde', '1993-01-28', 5, 4);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (6, 'illum', '2000-08-11', 6, 7);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (7, 'et', '2015-01-02', 8, 10);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (8, 'id', '2011-08-28', 9, 9);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (9, 'odio', '2005-04-17', 7, 4);
INSERT INTO `pets` (`id`, `name`, `birth_date`, `type_id`, `owner_id`) VALUES (10, 'qui', '1980-08-28', 6, 5);

INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (1, 3, '1974-03-13', 'Maiores quia quae delectus est velit ipsam. Natus veritatis commodi sit quis laudantium et ut. Ex dolores et eos quibusdam dolor soluta.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (2, 5, '1991-05-10', 'Vel non recusandae et itaque mollitia velit. Laudantium omnis dolorum aut. Unde reiciendis nesciunt ullam. Est ullam est ex recusandae atque.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (3, 9, '1980-10-28', 'Reprehenderit et voluptatem quod. Earum sed animi ipsam neque. Ut sit laborum ut nihil.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (4, 9, '2010-01-24', 'Voluptas sed velit autem soluta qui facilis. Est dolorum blanditiis occaecati reiciendis ab. Dolor natus facilis et nostrum. Voluptatibus magni labore et consequatur repellat.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (5, 2, '2017-11-23', 'Deleniti ut iusto ut doloribus. Et possimus est eum est. Sapiente incidunt sit aut ut aperiam autem aut. Enim non non beatae suscipit sunt minus.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (6, 9, '1972-01-30', 'Iure dolores sunt est reiciendis illo sapiente eaque. Aliquam eos corrupti voluptas aut quae necessitatibus dignissimos. Sequi qui ratione dolor.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (7, 3, '1980-05-07', 'Voluptatum omnis possimus at quis modi aut porro. Aut omnis ad hic amet nam debitis. Laboriosam voluptas totam nihil accusamus beatae.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (8, 3, '2018-11-02', 'Alias quas culpa nostrum voluptatem nihil. Et voluptas necessitatibus aspernatur rem suscipit.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (9, 1, '1995-08-17', 'Consequatur ut est quaerat et porro. Et recusandae numquam porro maxime. A id asperiores ad autem aliquam et. Quia corporis cumque omnis adipisci sit suscipit quasi. Repellat laborum itaque ut.');
INSERT INTO `visits` (`id`, `pet_id`, `visit_date`, `description`) VALUES (10, 8, '1972-11-26', 'Et harum autem doloremque pariatur ipsum saepe omnis. Quisquam reprehenderit asperiores ea odio nihil. Eum doloremque est iure ipsam est.');

INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (1, 10);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (2, 8);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (2, 9);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (4, 2);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (5, 3);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (6, 3);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (7, 1);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (8, 3);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (9, 4);
INSERT INTO `vet_specialties` (`vet_id`, `specialty_id`) VALUES (9, 5);