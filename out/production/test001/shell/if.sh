#!/usr/bin/env bash

a="1"
b="2"
if [ "$a" -eq "1" ] && [ "$b" -eq "3" ]; then
    echo "nihao";
else
    echo "操作失败";
fi

array=(a b c d)
a=(a1 a2)
b=(b1 b2)
c=(c1 c2)

e=(${a[@]:0:2})
f=(${b[@]:0:2})
g=(${c[@]:0:2})
array_new=(a,b,c,d)

echo ${array[@]}
for var in ${array[@]} ; do

    var=$var
    varArrey=(`eval echo '$'{"${var}"[@]}`)
    for var in ${varArrey[@]}; do
            echo $var
    done
done
