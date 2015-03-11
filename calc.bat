@echo off
Title Calculate
Color 1C
:begin
Echo Example:
Set /P exp=
Set /A result=%exp%
Title Ready
Echo Example: %exp%
Echo Result: %result%


Pause>nul
goto begin



 
