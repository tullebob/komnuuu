use kennell
SELECT a.dogID AS "ID",a.dogName AS "Dog Name",
b.dogID AS "MID",b.dogName AS "Mother"
FROM dogs a, dogs b
WHERE a.Mother = b.dogID;
