Queue is also a linear data structure that follows the FIFO(First In, First Out) principle. In this data structure,
data is stored by in a sequential order. i.e Adding of new elements can take place from the end, and also the deletion
of elements can take place from the front end.

The major operations here are:
- peekFirst(): used to get the first element of the queue 
- peekLast(): used to get the last element of the queue
- enqueue(element): used to add an element
- dequeue(): used to remove an element


### Types
- Simple queue
- Priority queue
- Double-Ended queue
- Circular queue

### Implementation
- With LinkedList Allocation: where you can organize an unlimited number of elements 
- Sequential Allocation: In this case, it is being implemented with an array and can only organize a
limited number of elements 


### Applications
- Managing requests on a single shared resource such as CPU scheduling and disk scheduling
- Handling hardware or real-time systems interrupts 
- Handling website traffic 
- Routers and switches in networking 
- Maintaining the playlist in media players