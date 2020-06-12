# Question 1:

***Note : The following solutions to the respective questions are purely for educational purposes . The author, however do not control or guarantee the accuracy, relevance, timeliness, or completeness of any  code given in the repository.***

   Question 1 : (http://topcoder.bgcoder.com/print.php?id=745)    
 

    ### Problem Statement

Your printer has been infected by a virus and is printing gibberish. After staring at several printed pages for a while, you realize that it is printing every line  _inside-out_. In other words, the left half of each line is being printed starting in the middle of the page and proceeding out toward the left margin. Similarly, the right half of each line is being printed starting at the right margin and proceeding in toward the middle of the page. For example, the line

    THIS LINE IS GIBBERISH

is being printed as

    I ENIL SIHTHSIREBBIG S

Your task is to unscramble a String  **line**  from its printed form back into its original order. You can assume that  **line**  contains an even number of characters.

### Definition

Class: InsideOut

Method: unscramble

Parameters: String

Returns: String

Method signature: String unscramble(String line)

(be sure your method is public)

### Constraints

- contains between 2 and 50 characters, inclusive.

-  contains an even number of characters.

- contains only uppercase letters ('A'-'Z') and spaces ('  ').

### Examples

0) "I ENIL SIHTHSIREBBIG S"

Returns: "THIS LINE IS GIBBERISH"

The example above.
1)"LEVELKAYAK"
Returns: "LEVELKAYAK"
2) "H YPPAHSYADILO"
Returns: "HAPPY HOLIDAYS"
3) "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
Returns: "MLKJIHGFEDCBAZYXWVUTSRQPON"
4) "RUT OWT SNEH HCNERF EERHTEGDIRTRAP A DNA  SEVODELT"
Returns: "THREE FRENCH HENS TWO TURTLEDOVES  AND A PARTRIDGE"
