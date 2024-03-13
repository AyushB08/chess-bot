package bot.chessbot;

import java.util.ArrayList;

public class Knight extends Piece{

    public Knight(String color) {
        this.color = color;
        if (color.equals("white")) {
            setImage("src/main/resources/images/white-knight.png");
        } else {
            setImage("src/main/resources/images/black-knight.png");
        }
    }
    @Override
    public ArrayList<int[]> getValidMoves() {
        return null;
    }
}