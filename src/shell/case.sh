#!/usr/bin/env bash

read a
case $a in
    start | begin)
        echo "start something"
    ;;
    stop | end)
        echo "stop something"
    ;;
    *)
        echo "Igorant"
    ;;
esac