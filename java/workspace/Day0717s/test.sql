select * from clients;

create table clients(
	id varchar2(10) primary key,
	pwd varchar2(10),
	name varchar2(10),
	profile varchar2(15),
	reg_date date default sysdate
);

show user

update CLIENTS
set profile = 'gam.jpg'
where id='tjdwns';

�Խ��� ���̺�
create table board(
   num number primary key,
   id  varchar2(10),
   subject varchar2(100),
   content varchar2(1000),
   write_date date default sysdate,
   read_count number default 0
)

�ڵ����� ��ü ���� �����ִ� ��
create sequence board_seq
   start with 1
   increment by 1

   
insert into board
values(board_seq.nextval, 'test','�ȳ��ϼ���','�ȳ��ϼ���',default,default)

insert into board
values(board_seq.nextval, 'mino','�ż�����','�۹�ȣ��',default,default)




�Խ��ǿ� ���
create table comments(
   comment_num    number primary key,   -- ��۹�ȣ
   id         varchar2(10),
   content      varchar2(1000),
   write_date   date default sysdate,
   num         number references board(num)      -- �Խ��� �۹�ȣ
)


����� ���� sequence
create sequence comment_seq
   start with 1
   increment by 1

insert into comments values(comment_seq.nextval, 'hodong', '���ƿ�',default,1);
insert into comments values(comment_seq.nextval, 'jiwon', '�Ⱦ��',default,1);
insert into comments values(comment_seq.nextval, 'suguen', '���ƿ�',default,2);
insert into comments values(comment_seq.nextval, 'kyuhyun', '�Ⱦ��',default,2);

select * from comments