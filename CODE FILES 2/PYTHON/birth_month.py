group1=set()
for x in range(3):
	id=x+1
	tmp=raw_input("{} {}{} ".format("Enter birth month", id, ":"))
	group1.add(tmp)
group2=set()
for x in range(3):
	id=x+1
	tmp=raw_input("{} {}{} ".format("Enter birth month", id, ":"))
	group2.add(tmp)	
print("{}{}{}".format("Group 1: {", ', '.join(group1), "}"))
print("{}{}{}".format("Group 2: {", ', '.join(group2), "}"))
self=raw_input("Enter your birth month: ")
print("{}{}{}".format("Union: {", ', '.join(group1|group2), "}"))
print("{}{}{}".format("Intersection: {", ', '.join(group1&group2), "}"))
print("{}{}{}".format("Difference: {", ', '.join(group1-group2), "}"))
if self in group1:
	print("You have the same birth month with one of your classmates.")
