### STACK

Follows the principle of storing data in linear way. The first object remains at index, 
while incoming data is always at the top. Uses the acronym "LIFO" (Last In, First Out)

#### What You Should Remember
- Only the top elements are available and can be accessed
- Every operation (insert/deletion) occurs only at the top
- The major operations here are:
    - push(takes in an element): is used to insert an element at the top
    - peek(): used to get/access the first element at the top of the stack
    - isEmpty(): returns a boolean type of true of the element of the stack is empty
    - pop(): used to remove/delete the top element from the stack
- All the operation here works in constant time 0(1)