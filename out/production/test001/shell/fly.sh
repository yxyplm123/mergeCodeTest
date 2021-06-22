#!/usr/bin/env bash

test_name='world'
test_ass='hello '${test_name}' '
echo $test_name,$test_ass
#获取字符串长度
echo ${#test_name}
#截取字符串
echo ${test_name:0:3}
date

function hello(){
    echo "Hello $1"
}
hello

val=`expr 2 + 2`
echo "yunxingjieguo：$val"

a=10
b=20
if [ $a -eq 10 ] && [ $b -eq 20 ]; then
    echo "shuchuzhangque"
fi

if test $a -eq 20 -a $b -eq 10; then
    echo "dui"
    else
    echo "budui"
fi

result=$[a+b]
echo "shuchujieguo: $result"