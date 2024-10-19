public class TwelthProblem {
    public static void main(String[] args){
        System.out.println(canBishopReach(0, 0, 2, 2));
        System.out.println(canBishopReach(0, 0, 1, 2));
        System.out.println(canBishopReach(0, 0, 4, 4));


    }
    public static String canBishopReach(int bishopRow, int bishopCol, int immovableRow, int immovableCol) {
        if (!sameColor(bishopRow, bishopCol, immovableRow, immovableCol)) {
            return "NO";
        }

        if (isSamePosition(bishopRow, bishopCol, immovableRow, immovableCol)) {
            return "YES\n0";
        }

        if (canReachInOneMove(bishopRow, bishopCol, immovableRow, immovableCol)) {
            return "YES\n1";
        }

        return "YES\n2";
    }

    private static boolean sameColor(int row1, int col1, int row2, int col2) {
        return (row1 + col1) % 2 == (row2 + col2) % 2;
    }
    private static boolean isSamePosition(int bishopRow, int bishopCol, int immovableRow, int immovableCol) {
        return bishopRow == immovableRow && bishopCol == immovableCol;
    }
    private static boolean canReachInOneMove(int bishopRow, int bishopCol, int immovableRow, int immovableCol) {
        return Math.abs(bishopRow - immovableRow) == Math.abs(bishopCol - immovableCol);
    }
}

