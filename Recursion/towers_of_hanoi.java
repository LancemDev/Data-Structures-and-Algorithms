public class towers_of_hanoi {
    //Creating the method for the towers of hanoi
    public static void towers_of_hanoi(int n, char from_rod, char to_rod, char aux_rod) {
        //If there is only one disk, then move it from the first rod to the last rod
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        //Move the top n-1 disks from the first rod to the second rod
        towers_of_hanoi(n - 1, from_rod, aux_rod, to_rod);
        //Move the last disk from the first rod to the last rod
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        //Move the n-1 disks from the second rod to the last rod
        towers_of_hanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
