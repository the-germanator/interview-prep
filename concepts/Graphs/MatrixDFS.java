import java.util.*;
class MatrixDFS {

    public static void main(String[] args) {
        int[][] grid = { {0,0,0,0}, {1,1,0,0}, {0,0,0,1}, {0,1,0,0} };
        ArrayList<ArrayList<Integer>> visited = new ArrayList<ArrayList<Integer>>();
        System.out.println(dfs(grid, 0, 0, visited));
        
    }
    public static int dfs(int[][] grid, int row, int col, ArrayList<ArrayList<Integer>> visited) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        if((row < 0 || col < 0) || row >= ROWS || col >= COLS || visited(row, col, visited) || grid[row][col] == 1) return 0;
        if(row == ROWS - 1 && col == COLS - 1) return 1;

        addVisited(row, col, visited);

        int count = 0;
        count += dfs(grid,row+1,col,visited);
        count += dfs(grid,row-1,col,visited);
        count += dfs(grid,row,col+1, visited);
        count += dfs(grid,row,col-1,visited);

        removeVisited(row, col, visited);
        return count;
    }
    public static Boolean visited(int row, int col, ArrayList<ArrayList<Integer>> visited) {
       for(int i = 0; i < visited.size(); i++) {
        if(visited.get(i).get(0) == row && visited.get(i).get(1) == col) return true;
       }
        return false;
    }
    public static void addVisited(int row, int col, ArrayList<ArrayList<Integer>> visited) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(row);
        temp.add(col);
        visited.add(temp);
    }
    public static void removeVisited(int row, int col, ArrayList<ArrayList<Integer>> visited) {
        Boolean removed = false;
        int ptr = 0;
        while(!removed && ptr < visited.size()) {
            if(visited.get(ptr).get(0) == row && visited.get(ptr).get(1) == col) {
                visited.remove(ptr);
                removed = true;
            }
            ptr++;
        }
    }
}