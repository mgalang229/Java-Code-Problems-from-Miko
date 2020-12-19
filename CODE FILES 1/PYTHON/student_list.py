students={}
tmp=""
for x in range(3): 
	snum=raw_input("Enter student number: ")
	id=x+1
	fname=raw_input("{} {}{} ".format("Enter first name", id, ":"))
	students[snum]=fname
	tmp=snum
print("Student List: ")
for x, y in students.items():
	print("{} {}".format(x, y))
students.pop(tmp)
snum=raw_input("Enter student number: ")
fname=raw_input("{} {}{} ".format("Enter first name", 3, ":"))
students[snum]=fname
for x, y in students.items():
	print("{} {}".format(x, y))
