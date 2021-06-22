#!/bin/bash
demo="guyunfei"
echo $demo

a=(1 2 3 4 5)
echo ${a[2]}
echo ${#a[*]}
a[1000]=1000
echo ${a[*]}
echo ${a[5]}
echo "nihao"
unset a[1]
echo ${#a[*]}
unset a
echo ${#a[*]}

echo "jiequ"
a=(1 2 3 4 5)
# shellcheck disable=SC2068
echo ${a[@]:0:3}
c=(${a[@]:0:4})
echo ${#c[*]}
echo ${c[*]}
echo "tihuan"
a=(1 2 3 4 5)
# shellcheck disable=SC2068
echo ${a[@]}
# shellcheck disable=SC2068
echo ${a[@]/3/100}

echo $*
