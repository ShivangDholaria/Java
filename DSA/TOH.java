/**
 * Tower of Hanoi program
 */
public class TOH {
    
    public void toh(int n, char frompeg, char topeg, char auxpeg) {
        if(n == 1) {                                // Base case to move the disk and return
            System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
            return ;
        }

        toh(n - 1, frompeg, auxpeg, topeg);         // Moving n-1 disks from A to B peg using C peg as auxiliary
        System.out.println("Move disk from peg " + frompeg + " to peg " + topeg);
        toh(n - 1, auxpeg, topeg, frompeg);
    }

    public static void main(String[] args) {
        TOH obj = new TOH();

        int n = 10;
        obj.toh(n, 'A', 'B', 'C');
    }    
}
