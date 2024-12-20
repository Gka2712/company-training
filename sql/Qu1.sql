USE rezodb;
CREATE TABLE item_master(
    item_no INT,
    item_name VARCHAR(15),
    price INT,
    comment VARCHAR(100)
);
INSERT INTO item_master VALUES(1001,'ポテトフライ',35,'ビールのおつまみに最適');
INSERT INTO item_master VALUES(1002,'ヤッター麵',10,'ちょっと濃いめでたまに100円あたる');
INSERT INTO item_master VALUES(1003,'サクラ大根',50,'漬物なのに駄菓子という矛盾がたまらない');
INSERT INTO item_master VALUES(1004,'ヤングドーナツ',40,'小さいけどちゃんとおいしい');
SELECT * FROM item_master;
UPDATE item_master SET item_name='ポテトフライ' WHERE item_no=1001;
SELECT * FROM item_master WHERE item_no=1001;