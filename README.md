# Santa's sleigh makeover
This code is part of the "Tech Challenge Series – Advent Calendar 2021" advanced by Blip.pt (developed by Devskiller).

*This year counting down to Christmas will be even funnier and Blip will be by your side the whole time with a variety of small programming puzzles and lots of prizes!*

## Task description
For this Christmas Santa wants to upgrate his sleigh. He needs to improve both the sleigh runners and his magic bag holder.  

There are several models of sleigh runners and magic bag holders which Santa can choose from.  
The difference between the prices reflects the quality of the of the equipment.  

But Santa is on a budget and he can't choose the best of both or he might need to wait to upgrade next year.  

Can you help Santa optimize his purchase?  

**Function signature**   
getTotalSpent(int[] runners, int[] holders, int budget) returns int  

**Examples:**   
Santa budget ```b = 100```
List of sleigh runners ```runners = [60, 80, 100]```  
List of magic bag holders ```holders = [17, 19, 21]```  
  
In this case, Santa should choose ```80 runner``` and ```19 holder``` because ```80 + 19 = 99``` because it is the closest to his budget.  
Choosing the ```100 runner``` would not let him buy a holder.  
choose ```80 runner``` and ```21 holder``` would be over budget.  
choose ```60 runner``` and ```17 holder``` would not be the best fit because ```60 + 17 = 77``` and there is leftover money that could be spent on other upgrades.  

In the case that the budget isn't enough, it should return -1.  

**Constraints**  
- Items list are between 1 and 1 000  
- Budget is between 1 and 1 000 000  
- The price of each item is in the inclusive range of the budget  
