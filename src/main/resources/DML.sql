DELETE FROM USER_AUTH;
DELETE FROM USERS;

INSERT USERS (ID,FIRST_NAME,LAST_NAME,EMAIL,TEL_NUMBER,GENDER,BIRTHDAY,INFO)
VALUES
(1,),
(2,),
(3,),
(4,),
(5,);

INSERT USER_AUTH (ID,LOGIN,PASSWORD,USER_ID)
VALUES
(1,'ivan', 'ivan123',1),
(2,'testing', 'test123', 2),
(3,'petr', 'petr123',3),
(4,'daria', '1234567',4),
(5,'anna','best_password',5);

commit;