class Solution {
    // Java recursive function to solve tower of hanoi puzzle
    static void towerOfHanoi(int diskNumber, char from_rod, char to_rod, char aux_rod)
    {
        if (diskNumber == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(diskNumber-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + diskNumber + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(diskNumber-1, aux_rod, to_rod, from_rod);
    }

    //  Driver method
    public static void main(String args[])
    {
        int diskNumber = 4; // Number of disks
        towerOfHanoi(diskNumber, 'A', 'C', 'B');
        // A, B and C are names of rods
    }
}