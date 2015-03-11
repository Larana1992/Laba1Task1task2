echo add files *.scr

echo For task 1 > Task1.scr
echo For task 1a > Task1a.scr
echo For task 1b > Task1b.scr
echo For task 1c > Task1c.scr
echo For task 1d > Task1d.scr
dir
pause
echo delete *.scr 
del *.scr 
dir
pause

echo add files *.htm and *.HTM

echo For task 1 > Task1.htm
echo For task 1a > Task1a.HTM
echo For task 1b > Task1b.htm
echo For task 1c > Task1c.HTM
echo For task 1d > Task1d.htm
dir
pause

ren *.htm  *.html
dir
pause

echo add files *.txt and *TXT
pause

echo For task 1 > Task1.TXT
echo For task 1a > Task1a.txt
echo For task 1b > Task1b.TXT
echo For task 1c > Task1c.txt
echo For task 1d > Task1d.TXT
dir
md TXT
pause

copy *.txt "TXT/"
dir "TXT/"

md DOC
echo For task 1 > Task1.DOC
echo For task 1a > Task1a.doc
echo For task 1b > Task1b.DOC
echo For task 1c > Task1c.doc
echo For task 1d > Task1d.DOC
move *.doc "DOC/"

dir





