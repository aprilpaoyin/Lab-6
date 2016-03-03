__author__ = 'd14124009'

music = open("hnr1.abc", "r")

#lines = music.readlines()
#title = False

#if "T:" in lines and title==False:
#     print(lines[2:])
#     title=True
Xcounter = True
TCounter = True

for line in music:
    if line[:2] == 'X:':
        TCounter =0
        print("\n", line[2:-1]," ... ", end="")
    elif line[:2] == 'T:':
        TCounter +=1
    if TCounter == 1:
        print(line[2:-1]," ... ", end="")
    elif line[:2] == 'M:':
        print(line[2:-1]," ... ", end="")
    elif line[:2] == 'K:':
        print(line[2:-1]," ... ", end="")
