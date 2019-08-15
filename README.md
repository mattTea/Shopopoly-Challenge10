Shopopoly Challenge 10
======================

## Description

[Link to challenge](https://coding-challenges.jl-engineering.net/challenges/challenge-10/)

In this challenge you are required to create the `Player` data type and the `Dice` data type.

Each `Player` data type will have two properties:

- `name` this is just a 30 character string.
- `boardLocation` the data type of this property is up to you. You must be able to use it to determine the Location of the player.


The game of Shopopoly requires the player to shake two 6 sided dice and move forward by the total number of the two dice.

The `Dice` data type contains two integer values between one and six, one for each dice.
The two values are generated randomly when an instance of `Dice` is created.

To enable a player to move a function needs to be created that adds the `Dice` to the `boardLocation` to create a new `boardLocation` for the player.
Locations are organised in a loop so when you move past the last Location, you move onto the first Location.

To detect whether a player has passed go (i.e. landed on the go square or passed over it)
a function needs to be created that accepts two boardLocations as input and returns true if the player has passed go.
Please assume the board has at least 13 Locations on it so you can’t pass through go more than once in one move.

------

## Some tips

You don’t need to have completed Challenge 8 or Challenge 9 to complete this challenge.
The Location data type can just be a simple class or interface but you may need a way to detect whether a location is the location for the go square so you can work out when someone passes go.

You will probably need to create a mechanism for determining the sequence of each location on the board.

------

## Problem breakdown

1. `Player` has name property
2. `Player` has boardLocation property
3. `Dice` has 2 interger values