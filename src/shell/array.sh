#!/usr/bin/env bash
a=(1 2 3 4 5)
echo "dayinxinxi"
# shellcheck disable=SC2068
echo ${a[@]}
echo ${#a[*]}
echo ${a[2]}
#添加元素
echo "tianjiayuansu"
a[100]=100
# shellcheck disable=SC2068
echo ${a[@]}
echo ${#a[@]}
#删除元素
echo "shanchu"
unset a[1]
# shellcheck disable=SC2068
echo ${a[@]}
echo ${#a[@]}
#截取数组
echo "jiequ"
# shellcheck disable=SC2068
echo ${a[@]:0:3}
c=(${a[@]:0:3})
# shellcheck disable=SC2068
echo ${c[@]}
echo ${#c[@]}
#替换元素
# shellcheck disable=SC2068
echo ${a[@]}
# shellcheck disable=SC2068
echo ${a[@]/3/12}