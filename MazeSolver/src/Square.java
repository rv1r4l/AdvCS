public class Square {

    final static int SPACE = 0;
    final static int WALL = 1;
    final static int START = 2;
    final static int EXIT = 3;
    final static char WORKING = 'o';
    final static char EXPLORED = '.';
    final static char ON_EXIT_PATH = 'x';
    final static char UNKNOWN = '_';
    private int row, col, type;

    public Square(int row, int col, int type){
        this.row = row;
        this.col = col;
        this.type = type;
    }

    
}
