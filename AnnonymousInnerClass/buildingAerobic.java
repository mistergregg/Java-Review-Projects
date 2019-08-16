// Create a class Land
// 
// Within the class create an InterfaceBuilding
// Within the InterfaceBuidling create
// A method Volume()
// A Nested Interface SquareFeet (containing a sqFoot method that returns sqFoot)
// A Nested Interface Height (containing a height method that returns height)
//
// Within the Land class create a static class Calculations
// With a Method Calculate
//
//
//


// Anonymous Inner Class
// Static Nested Class


import java.util.Scanner;
class Land
{

    interface InterfaceBuilding
    {
        void Volume(int feet);

        interface InterfaceSquareFeet
        {
            void squareFeet(int sqFeet);
        }

        interface InterfaceHeight
        {
            void height(int sqFeet);
        }
    }

    static class Calculations
    {
        static int Price(int volume)
        {
            return volume * 5;
        }
    }

// Class Implementing the Abstract class and Interface
    public static void main(String[] args)
    {
        public int height = 0;
        public int sqFoot = 0;
        
        Land land = new Land()
        {
            InterfaceBuilding ib = new InterfaceBuilding()
            {
                void volume(int feet)
                {
                    int volume = feet;
                    Land.Calculations(volume);
                }

                InterfaceSquareFeet sq = new InterfaceSquareFeet()
                {

                };

                InterfaceHeight height = new InterfaceHeight()
                {

                };
            };
        };


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter building height: ");
        int height = scan.nextInt();

        scan.close();
    }
}