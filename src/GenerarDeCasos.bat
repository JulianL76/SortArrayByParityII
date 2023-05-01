@echo off
java GeneradorDeCasos.java > CasosGenerados.txt
java Main.java < CasosGenerados.txt > Salidas.txt
echo Finalizado.
pause

