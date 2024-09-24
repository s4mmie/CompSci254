
public class PR1_BART 
{
    static void towerOfHanoi(int n, char fromRod, char toRod, char helperRod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n-1, fromRod, helperRod, toRod);
        System.out.println("=Take disk " + n + " from rod " +  fromRod + " to rod " + toRod);
        towerOfHanoi(n-1, helperRod, toRod, fromRod);
    }

    public static void main(String args[])
    {
        int n = 3;
        towerOfHanoi(n,'A','C', 'B');
    }

}