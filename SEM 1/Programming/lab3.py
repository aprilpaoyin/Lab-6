__author__ = 'd14124009'

phrase = input("Enter a string to encrypt: ")
new_char = ""
new_phrase = ""
i = 0

#reverse the string
phrase = phrase[::-1]


while i < len(phrase):
    asskey = ord(phrase[i])
    asskey = asskey + 1

    new_char = chr(asskey)
    new_phrase = new_phrase + new_char

    i += 1

print(new_phrase)

phrase = input("Enter a string to decrypt: ")
new_char = ""
new_phrase = ""
i = 0

#reverse the string
phrase = phrase[::-1]


while i < len(phrase):
    asskey = ord(phrase[i])
    asskey = asskey - 1

    new_char = chr(asskey)
    new_phrase = new_phrase + new_char

    i += 1


print(new_phrase)


