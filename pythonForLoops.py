'''
for i in range(10):
  if i == 0:
    print("I can count!")
  print(i, "...")

# for loop that doesn't start at 0\
for i in range(5,10, 2):
  print(i)
'''
words = ["curricular", "hello", "default dance", "t-pose"]
'''
# counting/indexing for loops
for i in range(len(words)):
  print("The word at position", i, "is", words[i])

  for thing in words:
    print(thing.upper())

print(words)
'''
vowels = ["a", "e", "i", "o", "u"]
count = 0
for letter in words[2]:
  print(letter)
  if letter in vowels:
    count += 1

print("There are", count, "vowels in the word", words[2])
