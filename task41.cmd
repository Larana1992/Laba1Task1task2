@echo off
ping %1
if "%errorlevel%"=="0" (echo " %date% %time:~0,2%.%time:~3,2% Host available!" >> %2\available.txt) else (echo "%date% %time:~0,2%.%time:~3,2% Host unavailable">>%2\error.txt)