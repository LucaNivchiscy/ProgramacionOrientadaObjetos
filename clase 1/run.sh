#!/bin/bash
set -e

rm -rf bin
mkdir -p bin

javac -d bin src/module-info.java src/ar/com/unpaz/model/*.java src/ar/com/unpaz/repositorio/*.java src/ar/com/unpaz/principal/*.java

java --module-path bin -m POO/ar.com.unpaz.principal.Main