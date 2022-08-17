import java.util.ArrayList;
import java.util.List;

public class _36_ValidSudoku {
    public static void main(String[] args) {

        char[][] x ={
                {'5', '1', '.', '.', '9', '.', '.', '.', '.'},
                {'6', '2', '7', '.', '8', '.', '.', '.', '.'},
                {'7', '3', '.', '.', '5', '.', '.', '.', '.'},
                {'8', '4', '.', '.', '6', '.', '.', '.', '.'},
                {'9', '5', '.', '.', '0', '.', '.', '.', '.'},
                {'1', '6', '.', '.', '4', '.', '.', '.', '.'},
                {'2', '7', '.', '.', '3', '.', '.', '.', '.'},
                {'3', '8', '.', '.', '2', '.', '.', '.', '.'},
                {'4', '9', '.', '.', '1', '.', '.', '.', '.'},
        };
        System.out.println(isValidSudoku(x));
    }


    public static boolean isValidSudoku(char[][] board) {
        ArrayList<Character> list= new ArrayList<>();
        //row
        for(int i = 0 ; i < board.length;i++){
            for(int j = 0 ; j<board.length;j++){
                if(board[i][j]=='.')
                    continue;
                if(!list.contains(board[i][j])){
                    list.add(board[i][j]);
                }else{
                    return false;
                }
            }
            list.clear();
        }

        //column
        for(int j = 0 ; j < board.length;j++){
            for(int i = 0 ; i<board.length;i++){
                if(board[i][j]=='.')
                    continue;
                if(!list.contains(board[i][j])){
                    list.add(board[i][j]);
                }else{
                    return false;
                }
            }
            list.clear();
        }

        //3*3
        for (int block = 0; block < 9; block++){
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++){
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++){
                    if(board[i][j]=='.')
                        continue;
                    if(!list.contains(board[i][j])){
                        list.add(board[i][j]);
                    }else{
                        return false;
                    }
                }
            }
            list.clear();
        }
        return true;
    }
}
