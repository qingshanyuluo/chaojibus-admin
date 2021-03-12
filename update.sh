#!/bin/bash

echo '自动部署Springboot项目脚本...'
#后台程序对应的端口号
port=8080
#根据端口号查询对应的pid
pid=$(netstat -nlp | grep :$port | awk '{print $7}' | awk -F"/" '{ print $1 }');
 
#杀掉对应的进程，如果pid不存在，则不执行
if [  -n  "$pid"  ];  then
    kill  -9  $pid;
fi
#然后重新启动同级目录下的jar包
nohup java -jar chaojibus-admin-0.0.1-SNAPSHOT.jar &