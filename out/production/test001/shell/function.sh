#!/usr/bin/env bash


function hello_param(){
    echo "Hello $1";
}
hello_param

echo "chuancandiaoyong"
hello_param ben;

echo "wenjiandiaoyong"
#调用包含函数文件，点和fly.sh 之间有空格
. fly.sh;
hello ben;
#调用函数
unset hello
#载入和删除
echo "zairu"
#用unset functionName取消载入
#unsert hello

#参数读取
#参数读取方式和终端读取参数方式不一样
#$10不能获取第10个参数当n>=10时候，要用$(n)来获取参数
funWithParam(){
    echo "The value of the first parameter is $1"
    echo "The value of the second parameter is $2"
    echo "The value of the tenth parameter is $10"
    echo "The value of the tenth parameter is ${10}"
    echo "The value of the eleventh parameter is ${11}"
    echo "The amount of the parameters is $#"
    echo "The amount of the parameters is $*"
}
funWithParam 1 2 3 4 5 6 7 8 9 34 73

#函数return
echo "return"

funWithReturn(){
    echo "The function is to get to sum of two numbers..."
    echo -n "Input first number:"
    read aNum
    echo -n "Input another number:"
    read anotherNum
    echo "The two number are $aNum and $anotherNum"
    return $(($aNum+$anotherNum))
}
funWithReturn
# 函数返回值在调用该函数后通过 $? 来获得
echo "The sum of two number is $? !"




