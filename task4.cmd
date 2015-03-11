@echo off
schtasks /create /sc MINUTE /mo 1 /tn "Task 4" /tr "%CD%\task41.cmd %1 %CD%"