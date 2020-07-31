/*

Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

*/


class Solution {
    boolean visitor[][] ;
    public boolean exist(char[][] board, String word) {
        
        visitor = new boolean[board.length][board[0].length];
        int pos = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                
                if(board[i][j]==word.charAt(pos) && helper(board,word,i,j,pos)){
                    return true;                                
            }                
        }
    }
       return false;
 }
    
    public boolean helper(char[][] board,String word, int i, int j, int pos){   
            
           if(pos==word.length())
           {
               return true;
           }
           
       
          
           if(j>board[0].length-1 || 
              i>board.length-1 || 
              i<0 || j<0 || board[i][j]!=word.charAt(pos) 
              || visitor[i][j]){
               return false;
           }
              
            visitor[i][j] = true;
            if ( helper(board,word,i+1,j,pos+1) || 
                 helper(board,word,i,j+1,pos+1) || 
                 helper(board,word,i-1,j,pos+1) || 
                 helper(board,word,i,j-1,pos+1))
            {                
                return true;
            }
           
            visitor[i][j] = false;
            return false;
        }   
    }
    