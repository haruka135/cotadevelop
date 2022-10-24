drop table figure

create table figure(
    
pname varchar2(50) primary key,
pename varchar2(50),
pcode varchar2(50),
man varchar2(50),
unitcoupon number,
unitprice number,
img varchar2(50)
);

select * from figure;

insert into figure values('저스틴 터너','Justin Turner','A123','Apple',5,1000000,'mlb_figure_01.png');
insert into figure values('코디 벨린저','Cody Bellinger','A123','Apple',5,1500000,'mlb_figure_02.png');
insert into figure values('무키 베츠','Mookie Betts','A123','Apple',5,2000000,'mlb_figure_03.png');


select * from figure order by unitprice desc;