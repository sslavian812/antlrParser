#!/bin/sh
java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool -visitor -package ru.ifmo.ctddev.shalamov.goodLang src/ru/ifmo/ctddev/shalamov/goodLang/GoodLang.g4



# generates parser files by given grammar
