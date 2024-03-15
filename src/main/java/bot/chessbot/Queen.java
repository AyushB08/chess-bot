package bot.chessbot;

import java.util.ArrayList;

import static bot.chessbot.BoardViewer.board;

public class Queen extends Piece{

    public Queen(int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.color = color;
        if (color.equals("white")) {
            setImage("src/main/resources/images/white-queen.png");
        } else {
            setImage("src/main/resources/images/black-queen.png");
        }
    }

    @Override
    public ArrayList<int[]> getValidMoves() {
        ArrayList<int[]> moves = new ArrayList<>();
        getVerticalMoves(moves);
        getHorizontalMoves(moves);
        getForwardDiagonal(moves);
        getBackwardDiagonal(moves);
        return moves;

    }

    public void getBackwardDiagonal(ArrayList<int[]> array) {
        int maxDiagonalTopLeftSteps = Math.min(7-row, col);

        for (int i = 0; i < maxDiagonalTopLeftSteps; i++) {

            int[] move = {row + 1 + i, col - 1 - i};

            if (board.getTile(row + 1 + i, col - 1 - i).isOccupied()) {



                if (this.color.equals("white")) {
                    if (board.getTile(row + 1 + i, col - 1 - i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row + 1 + i, col - 1 - i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

        int maxDiagonalBottomRightSteps = Math.min(row, 7-col);

        for (int i = 0; i < maxDiagonalBottomRightSteps; i++) {

            int[] move = {row - 1 - i, col + 1 + i};

            if (board.getTile(row - 1 - i, col + 1 + i).isOccupied()) {



                if (this.color.equals("white")) {
                    if (board.getTile(row - 1 - i, col + 1 + i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row - 1 - i, col + 1 + i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

    }

    public void getForwardDiagonal(ArrayList<int[]> array) {
        int maxDiagonalTopRightSteps = Math.min(7-row, 7-col);

        for (int i = 0; i < maxDiagonalTopRightSteps; i++) {

            int[] move = {row + 1 + i, col + 1 + i};

            if (board.getTile(row + 1 + i, col + 1 + i).isOccupied()) {



                if (this.color.equals("white")) {
                    if (board.getTile(row + 1 + i, col + 1 + i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row + 1 + i, col + 1 + i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

        int maxDiagonalBottomLeftSteps = Math.min(row, col);

        System.out.println(maxDiagonalBottomLeftSteps);

        for (int i = 0; i < maxDiagonalBottomLeftSteps; i++) {

            int[] move = {row - 1 - i, col - 1 - i};
            System.out.println(move[0] + " " + move[1]);
            if (board.getTile(row - 1 - i, col - 1 - i).isOccupied()) {



                if (this.color.equals("white")) {
                    if (board.getTile(row - 1 - i, col - 1 - i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row - 1 - i, col - 1 - i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

    }

    public void getHorizontalMoves(ArrayList<int[]> array) {

        for (int i = col-1; i >= 0; i--) {

            int[] move = {row, i};

            if (board.getTile(row, i).isOccupied()) {
                if (this.color.equals("white")) {
                    if (board.getTile(row, i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row, i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

        for (int i = col + 1; i <= 7; i++) {

            int[] move = {row, i};

            if (board.getTile(row, i).isOccupied()) {
                if (this.color.equals("white")) {
                    if (board.getTile(row, i).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(row, i).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }
    }

    public void getVerticalMoves(ArrayList<int[]> array) {
        for (int i = row-1; i >= 0; i--) {

            int[] move = {i, col};

            if (board.getTile(i, col).isOccupied()) {
                if (this.color.equals("white")) {
                    if (board.getTile(i, col).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(i, col).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }

        for (int i = row + 1; i <= 7; i++) {

            int[] move = {i, col};

            if (board.getTile(i, col).isOccupied()) {
                if (this.color.equals("white")) {
                    if (board.getTile(i, col).getPiece().getColor().equals("black")) {
                        array.add(move);
                    }
                } else {
                    if (board.getTile(i, col).getPiece().getColor().equals("white")) {
                        array.add(move);
                    }
                }
                break;
            } else {
                array.add(move);
            }
        }
    }
}
