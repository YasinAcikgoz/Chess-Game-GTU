package sample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by GozdeDogan on 14.11.2016.
 * Implemented by YasinTulumen on 14.11.2016
 *
 */
public class King extends Pieces {
    @Override
    public List<Cell> checkMove(Cell[][] board, int x, int y) {
        List<Cell> moves = new LinkedList<>();
        int i, j;
        //Ilk olarak secili tasin rengini kiyaslama yapmak icin tutuyorum
        boolean curColor = board[x][y].getPiece().getColor() ;

        //Sol tarafina dogru hareket edebilirligine bakarak gidiyorum. Ilk bakacagim
        //yer olarak i ye x-1 atadim. Yani tasin hemen soluna bakicam ilk
        i = x-1;
        if(i >= 0){
            //Eger tasin solu bos ise moves listeme ekleyerek devam ederim
            if(board[i][y].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            //Eger bi tas varsa ve ayni renk deilse yiyebilecegim icin move listesine ekliyorum
            //fakat yemekten oteye gecemedigimden hemen ardindan dongumu sonlandiriyorum
            else if(board[i][y].getPiece().getColor() != curColor){
                moves.add(new Cell(board[i][y]));
            }
        }
        j = y-1;
        if((i>= 0) && (j >= 0)){
            //Eger tasin solu bos ise moves listeme ekleyerek devam ederim
            if(board[i][j].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            //Eger bi tas varsa ve ayni renk deilse yiyebilecegim icin move listesine ekliyorum
            //fakat yemekten oteye gecemedigimden hemen ardindan dongumu sonlandiriyorum
            else if(board[i][j].getPiece().getColor() != curColor){
                moves.add(new Cell(board[i][y]));
            }
        }
        //Ayni islemleri saga dogru bakiyorum
        i = x+1;
        if(i <= 7){
            if(board[i][y].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            else if(board[i][y].getPiece().getColor() != curColor){
                moves.add(new Cell(board[i][y]));
            }
        }
        //Ayni islemleri sag alta dogru bakiyorum
        j = y-1;
        if((i <= 7) && (j >= 0)){
            if(board[i][j].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            else if(board[i][j].getPiece().getColor() != curColor) {
                moves.add(new Cell(board[i][y]));
            }
        }
        //Asagiya ve
        if(j >= 0){
            if(board[x][i].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[x][i]));
            }
            else if(board[i][y].getPiece().getColor() != curColor){
                moves.add(new Cell(board[x][i]));
            }
        }

        //Sag uste ve
        j = y+1;
        if((i <= 7) && (j <= 7)){
            if(board[i][j].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            else if(board[i][j].getPiece().getColor() != curColor){
                moves.add(new Cell(board[i][y]));
            }
        }
        //Yukariya dogru da ayni islemler gecerli
        if(j <= 0){
            if(board[x][i].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[x][i]));
            }
            else if(board[i][y].getPiece().getColor() != curColor){
                moves.add(new Cell(board[x][i]));
            }
        }
        //Sol uste dogru da ayni islemler gecerli
        i = x-1;
        if((i >= 0) && (j >= 0)){
            if(board[i][j].getPiece() instanceof NoPiece){
                moves.add(new Cell(board[i][y]));
            }
            else if(board[i][j].getPiece().getColor() != curColor){
                moves.add(new Cell(board[i][y]));
            }
        }
        //Kalenin her yone dogru oynayabilecegi hamleleri move listesine atadik ve donduruyoruz
        return moves;
    }

    @Override
    public void setColor(boolean colors) {

    }

    @Override
    public boolean getColor() {
        return color;
    }
}
