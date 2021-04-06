import java.util.*;
public class Startup {
    public static void main(String[] args) {
    }
    //# 1
    public static boolean[] arrEvenOdd(String[] arr) {
        boolean[] arr2 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String x = arr[i];
            if (i % 2 == 0 && x.length() % 2 == 0){
                arr2[i] = true;
            } else if (i % 2 == 1 && x.length() % 2 == 1){
                arr2[i] = true;
            } else {
                arr2[i] = false;
            }
        }
        return arr2;
    }
    //#2
    public static String removeDigits(String input) {
        String noint = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isDigit(c))  {
                noint += c;
            }
            }
        return noint;
    }
    //#3
    public static int compoundMass(String compound) {
        int mass = 0;
        int output = 0;
        char c;
        for (int i = 0; i < compound.length(); i++) {
            c = compound.charAt(i);
            String let = String.valueOf(c);
            if (!(Character.isDigit(c))) {
                mass = (int)c - 64;
            }
            else {
                output += mass * Integer.parseInt(let);
            }
        }
        return output;
    }
    // # 4
    public static String swapCase(String input) {
        String newcase = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String let = String.valueOf(c);
            if (Character.isUpperCase(c)) {
                newcase += let.toLowerCase();
            }
            else if (Character.isLowerCase(c)){
                newcase += let.toUpperCase();
            }
            else {
                newcase += c;
            }
        }
        return newcase;
    }
    // #5
    public static int[][] binarizeMatrixByMidrange
            (double[][] matrix) {
        int row = 0;
        while(row < matrix.length) {
            row++;
        }
        int[][] newMatrix;
        newMatrix = new int[matrix.length][row];
        double min = 0.0;
        double max = 0.0;
        for (int rownum = 0; rownum < matrix.length; rownum++) {
            for (int item = 0; item < matrix[rownum].length; item++) {
                if (matrix[rownum][item] < min) {
                    min = matrix[rownum][item];
                }
                else if (matrix[rownum][item] > max) {
                    max = matrix[rownum][item];
                }
            }
        }
        double midrange = (max + min) / 2;
        for (int rownum = 0; rownum < matrix.length; rownum++) {
            for (int item = 0; item < matrix[rownum].length; item++) {
                if (matrix[rownum][item] < midrange) {
                    newMatrix[rownum][item] = 0;
                }
                else if (matrix[rownum][item] > midrange){
                    newMatrix[rownum][item] = 1;
                }
            }
        }
        return newMatrix;
    }
    // #6
    public static boolean subsetChecker(int[] set1, int[] set2) {
        for (int item = 0; item < set1.length; item++) {
            if (!Arrays.asList(set2).contains(set1[item])) {
                return false;
            }
        }
        return true;
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
    // #7
    public static int countSmallRows(double[][] data) {
        double mean = 0.0;
        double total = 0.0;
        for (int rownum = 0; rownum < data.length; rownum++) {
            for (int item = 0; item < data[rownum].length; item++) {
                mean += data[rownum][item];
                total++;
                }
            }
        mean /= total;
        int count = 0;
        for (int rownum = 0; rownum < data.length; rownum++) {
            double row_mean = 0.0;
            double row_count = 0.0;
            for (int item = 0; item < data[rownum].length; item++) {
                row_mean += data[rownum][item];
                row_count++;
                }
            row_mean /= row_count;
            if (row_mean < mean) {
                count++;
            }
        }
        return count;
    }
    // #8
    public static boolean numpadSRC(int num) {
        String rows[] = {"0","123","456","789"};
        String columns[] = {"0147","0258","0369"};
        int row_num = 0;
        int col_num = 0;
        int iter = 1;
        boolean row_check = false;
        boolean col_check = false;
        while (num > 0) {
            int row_elem = 1;
            int col_elem = 1;
            int ch = num % 10;
            String str_num = Integer.toString(ch);
            if (str_num.length() == 1) {
                row_check = true;
            }
            for(row_elem = 0; row_elem < rows.length; row_elem++)
                if(rows[row_elem].contains(str_num))
                    break;
            for(col_elem=0; col_elem <columns.length;col_elem++)
                if(columns[col_elem].contains(str_num))
                    break;
            if(iter == 0) {
                row_num = row_elem;
                col_num = col_elem;
            }
            else {
                if(row_num != row_elem)
                    row_check = false;
                if(col_num != col_elem)
                    col_check = false;
            }
            iter++;
            num /= 10;
        }
        boolean check = row_check || col_check;
        return check;
    }
}