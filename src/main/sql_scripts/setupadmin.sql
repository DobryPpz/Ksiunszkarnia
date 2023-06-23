USE ksiunszkarnia_db;

INSERT INTO `roles` (name) VALUES ('ROLE_ADMIN');

INSERT INTO `user` (is_enabled, id, email, password, username)
VALUES (0, NULL, 'admin@admin.pl', '$2a$10$tiMUS45neJCSa4tYk2ijzeKwmYQQARu1TtPTg1dU/JC5PSNdzG5eS', 'admin');

INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM `user` u
JOIN `roles` r ON r.name = 'ROLE_ADMIN'
WHERE u.username = 'admin';

INSERT INTO user_roles (user_id, role_id)
SELECT u.id, r.id
FROM `user` u
JOIN `roles` r ON r.name = 'ROLE_USER'
WHERE u.username = 'admin';