import Square.Sqaure;
// import Cube.Cube;

abstract class abs {
    int[] arr = new int[10];
    abstract void generateRandomNumbers();
    abstract int[] getArr();
}

class GenRandomNums extends abs {
    void generateRandomNumbers() {
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * (100 - 1)) + 1;        
    }

    int[] getArr() {
        return arr;
    }
}

class genSqauresAndcubes extends GenRandomNums {
    int s[] = getArr();
    Sqaure sq = new Sqaure();
    
    void displaySqaures() {
        for(int i = 0; i < s.length; i++) {
            sq.findSqaure(s[i]);
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}

public class _4c_SquareAndCube extends genSqauresAndcubes {

    public static void main(String[] args) {
        genSqauresAndcubes sqAndcb = new genSqauresAndcubes();
        sqAndcb.displaySqaures();
    }
}
