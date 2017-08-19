# ABCinema
Members: Alano, Betito, Chen

Imagine going to the movie theater to watch a new movie and you find that the line is so long and the movie will start in five minutes, don’t you wish there was an application that will help you get out of that predicament? Most of the time, people experience inconvenience when buying tickets due to the long lines and they waste a lot of time waiting for their turn. Many of them wishing that there was some easier way to be able to buy tickets. This is the purpose of our project, the ABCinema.

![home](https://user-images.githubusercontent.com/16649576/29487829-3c14a6cc-8532-11e7-8869-cef92619b3c8.png)


## Features
### Movie
#### A. Check Movie Synopsis
![Check Details](https://user-images.githubusercontent.com/16649576/29487720-bcf818ca-8530-11e7-847b-fcae5d9affdb.png)
![Synopsis](https://user-images.githubusercontent.com/16649576/29487926-d56fcbd4-8533-11e7-8e4d-2d84580566f7.png)

#### B. Search Cinema
![Check Cinema](https://user-images.githubusercontent.com/16649576/29487828-3c0dd996-8532-11e7-9b9a-521099f55c27.png)

#### C. Select Movie
![Movie](https://user-images.githubusercontent.com/16649576/29487723-bd028bfc-8530-11e7-96de-34852749c3f1.png)

#### D. Select Seats
- Data Structure: List
  <br> ↳ When reserving seats in a cinema, choosing the seats is a must. In our program, when the customer chose to reserve a ticket in the cinema, their chosen seat will be entered in the list. If more than one ticket was bought, the list gets longer. The list will be visible to the user via the ticket that they bought. 
![SelectSeats](https://user-images.githubusercontent.com/16649576/29487726-bd295516-8530-11e7-809d-2557f3f4cc71.png)

#### E. Ticket
![Ticket](https://user-images.githubusercontent.com/16649576/29487734-be2d6e66-8530-11e7-80af-5e379fccc97b.png)

### Mini Games
#### A. Snake
- Data Structure: Linked List
<br> ↳ In the snake game, Linked List was the data structures used. The body of the snake and the direction where the snake was going were made with Linked List. 
<br> ↳ The direction of the snake was also identified using linked list. When the user pressed the keys, the program peeks first where the snake is going. The poll method removes the head of the snake and creates a new one that is in relation to the direction that the user chose the snake to go.
<br> ↳ Whenever the snake will eat the food in the board, its body extends which is why linked list was used because it made it easier for us to create a new node and connect it to the tail of the snake. The tail of the snake is the last node in the linked list therefore, it points to null. Whenever there is another addition to the body. We remove the null pointer, add the new tail, connect the body and the new tail and then point the new tail to null making linked list the suitable data structure for this problem.
![snakeOpening](https://user-images.githubusercontent.com/16649576/29487729-bd3f0f82-8530-11e7-818b-74d9c71a3c39.png)
![snakeingame](https://user-images.githubusercontent.com/16649576/29487728-bd35f456-8530-11e7-9212-bfc61dadf4c9.png)
![snakegameover](https://user-images.githubusercontent.com/16649576/29487727-bd2dfab2-8530-11e7-853a-fbe28bfe6b63.png)

#### B. Tetris
- Data Srtucture: Queue
<br> ↳ The name entered will be enqueued to the names of players in the program. The three most recent entered names will enter in the side panel with the first name at the top of the list and the last at the bottom of the list. If there are more than three entered names, the first name entered will be dequeued from the list to make way for the new name entered.
![queuename](https://user-images.githubusercontent.com/16649576/29487725-bd09bd00-8530-11e7-8e9a-eaec0491bc8e.png)
![tetrisopening](https://user-images.githubusercontent.com/16649576/29487733-bd6b2d42-8530-11e7-8e34-bb2f1232d3c6.png)
![tetrisingame](https://user-images.githubusercontent.com/16649576/29487732-bd650b60-8530-11e7-8c23-d32a694e3bc3.png)
![tetrisgameover](https://user-images.githubusercontent.com/16649576/29487731-bd474314-8530-11e7-9bdd-1ba291056ea5.png)

### Codes
#### List
![seatList](https://user-images.githubusercontent.com/16649576/29488079-508e5bf8-8536-11e7-84c3-70ffe45b5b9f.png)
![list](https://user-images.githubusercontent.com/16649576/29487722-bcfe8390-8530-11e7-9717-529b946eed80.png)

#### LinkedList
![linkedlist](https://user-images.githubusercontent.com/16649576/29487721-bcfade5c-8530-11e7-9070-fa36f4fee3b2.png)

#### Queue
![queue](https://user-images.githubusercontent.com/16649576/29487724-bd06da40-8530-11e7-8e59-f02d04a2603d.png)
