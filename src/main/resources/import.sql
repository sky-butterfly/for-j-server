insert into member ( name ) values ( '관리자' );

insert into plans ( member_id, type, name, is_current, is_deleted, start_date, end_date ) values ( 1, 'A', '관리자', true, false, '2024-07-01', '2024-07-31' );

insert into days (plans_id, day_num, day_date) values (1, 1, '2024-07-01');

insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01', '2024-07-01 07:00:00', '기상', '기상');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 07:00:00', '2024-07-01 08:00:00', '아침식사', '근처 카페에서 커피와 빵');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 08:00:00', '2024-07-01 10:00:00', '씻고 나갈 준비', '샤워하고 화장');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 10:00:00', '2024-07-01 11:00:00', '이동', '관광지 성당으로 이동');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 11:00:00', '2024-07-01 14:00:00', '성당 관람', '성당 관람하고 사진 찍기');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 14:00:00', '2024-07-01 15:00:00', '점심식사', '이탈리안 레스토랑에서 점심식사');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 15:00:00', '2024-07-01 16:00:00', '이동', '극장으로 이동');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 16:00:00', '2024-07-01 20:00:00', '연극 관람', '연극 관람');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 20:00:00', '2024-07-01 21:00:00', '이동', '숙소로 이동');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 21:00:00', '2024-07-01 22:00:00', '씻고 잘 준비', '씻고 잘 준비');
insert into times (days_id, start_time, end_time, contents, details) values (1, '2024-07-01 22:00:00', '2024-07-02 00:00:00', '취침', '취침');