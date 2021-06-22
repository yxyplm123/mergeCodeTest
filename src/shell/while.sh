#!/usr/bin/env bash
echo "while1"

i=10
while [[ $i -gt 5 ]]; do
    echo $i;
    ((i--))
done;

#echo "while2"
#while read line; do
#    echo $line
#done < ./shell/fly;

echo "foryunhuan1"
for((i=1;i<=5;i++));do
    echo $i;
done;

echo "for xunhuan2"
#seq 10 产生1 2 3 。。。10空格字符串
for i in $(seq 5); do
    echo $i;
done;

echo "util xunhuanliezi"
a=5
until [[ $a -lt 0 ]]; do
   echo $a;
    ((a--));
done;