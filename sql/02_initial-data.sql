INSERT INTO dental.account (email, password, user_name) VALUES
('mng@hoge', 'mngpass', 'manager'),
('user1@hoge', 'user1pass', 'MR.user1'),
('user2@hoge', 'user2pass', 'MR.user2')
;

INSERT INTO dental.users (email, password, first_name, last_name, birthdate, phone) VALUES
('user1@local', 'user1pass', 'Amir', 'aaa', '2000/01/01', '888-888-888'),
('user2@local', 'user2pass', 'Hiro', 'bbb', '2000/01/01', '888-888-888'),
('user3@local', 'user3pass', 'Yuki', 'ccc', '2000/01/01', '888-888-888');

INSERT INTO dental.doctor_schedules (doctor_uuid, time) VALUES
(1, '2000/01/01 10:00:00'),
(1, '2000/01/01 10:15:00'),
(1, '2000/01/01 10:30:00');

INSERT INTO dental.doctors (name) VALUES ('Prabh'), ('Amir'), ('Hiro'), ('Yuki');
