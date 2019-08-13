INSERT INTO `usuario` (usu_login, usu_password, usu_activo) VALUES ('admin','123456',1);
INSERT INTO `usuario` (usu_login, usu_password, usu_activo) VALUES ('jorge','123456',1);

INSERT INTO `rol` (rol_nombre) VALUES ('ROLE_USER');
INSERT INTO `rol` (rol_nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usu_rol` (usu_id, rol_id) VALUES (1, 1);
INSERT INTO `usu_rol` (usu_id, rol_id) VALUES (1, 2);
INSERT INTO `usu_rol` (usu_id, rol_id) VALUES (2, 1);
