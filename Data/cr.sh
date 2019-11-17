#!/bin/bash
cat dogsOffspringtest2.csv | awk 'BEGIN {FS=","} {print "INSERT INTO dogs (dogID,Color,Breed,DogName,Gender,Suburb,Mother,Father) VALUES ("$1",\""$2"\",\""$3"\",\""$4"\",\""$5"\",\""$6"\","$7","$8");"}' > ins.sql
