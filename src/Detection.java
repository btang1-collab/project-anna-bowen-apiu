public class Detection {
        private String[][] board = new String[3][3];
        String player;
        int row = (int)(clicked.getPosition().getY() / 200);
        int col = (int)(clicked.getPosition().getX() / 200);





        if(symbolCount%2 ==0){
            player = "X";
            imageFile = "ex.png";
            board[row][col] = player;
        }else{
            player = "O";
            imageFile = "oh.png";
            board[row][col] = player;
        }



        public String checkWinner(){
            //rows
            for(int r = 0; r< 3; r++){
                if(board[r][0] != null &&
                    board[r][0].equals(board[r][1]) &&
                    board[r][1].equals(board[r][2])){
                        return " ";
                    }
            for (int c =0; c <3; c++){
                if(board[0][c] != null && 
                    board[0][c].equals(board[1][c]) &&
                    board[1][c].equals(board[2][c])){
                        return "";
                    }
            }

            //diagonal

            int k =0;
            int j =0;
            while(k< 3){
                if(board[k][j] != null &&
                   board[k][j].equals(board[k+1][j+1]) &&
                   board[k+1][k+1].equals(board[k+2][j+2])
                ){
                    return "";
                }

            }
            }




        }
            

}
