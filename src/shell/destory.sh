#!/bin/sh

war=$1
#dirname bin/deploy.sh 打印脚本所在目录
#打印脚本所在目录bin 的绝对路径
bin=$(cd `dirname $0`; pwd)

if [ ! -n "${war}" ]; then
   echo "***Usage: $0 [project.war]"
   exit 0
fi
# -f 检查文件是否是普通文件 如果是 返回true
if [ ! -f "${war}" ]; then
    echo "***Error: ${war} does not exist."
    exit 0
fi
#
if [ ! "${war##*.}" = "war" ]; then
    echo "***Error: ${war} is not a war file."
    exit 0
fi

echo "Deploy ${war##*/}..."
rm -rf ${bin}/../webapps/ROOT/ && unzip -qo ${war} -d ${bin}/../webapps/ROOT/
rm -rf ${bin}/../work/Catalina/localhost/
echo "Restart tomcat..."
exec ${bin}/restart.sh
