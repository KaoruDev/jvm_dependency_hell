#!/bin/bash

set -e

mkdir jars || true

echo "Compling Cat..."
javac com/kaoruk/Cat.java
jar -cvf jars/Cat.1.0.0.jar com/kaoruk/Cat.class
rm com/kaoruk/Cat.class

echo "Compling Person..."
javac -cp jars/Cat.1.0.0.jar com/kaoruk/Person.java
jar -cvf jars/Person.1.0.0.jar com/kaoruk/Person.class
rm com/kaoruk/Person.class

echo "Compling Life..."
javac -cp jars/Person.1.0.0.jar com/kaoruk/Life.java
jar -cvf jars/Life.1.0.0.jar com/kaoruk/Life.class
rm com/kaoruk/Life.class
