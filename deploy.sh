#!/bin/bash

mvn clean package

host="mrbus.net"
username="root"
password="12qwaszx,."

echo 'copy to server'

# 指定执行引擎
/usr/bin/expect <<EOF
    set timeout 3000
    spawn scp ./target/chaojibus-admin-0.0.1-SNAPSHOT.jar $username@$host:~/
    expect {
        "*yes/no" { send "yes\r"; exp_continue }
        "*password:" { send "$password\r" }
    }
    expect "100%"
    expect eof

    spawn scp update.sh $username@$host:~/
    expect {
        "*yes/no" { send "yes\r"; exp_continue }
        "*password:" { send "$password\r" }
    }
    expect "100%"
    expect eof

    spawn ssh $username@$host
    expect {
        "*yes/no" { send "yes\r"; exp_continue }
        "*password:" { send "$password\r" }
    }
    expect -re ".*\[\$#\]"
    send "bash ./update.sh\r"
    expect -re ".*\[\$#\]"
    send "exit\r"
EOF

echo 'OK!'