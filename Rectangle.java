public class Rectangle implements Drawable {

    private int dimensionA;
    private int dimensionB;


    public Rectangle(int dimensionA, int dimensionB) {
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }


    public int getDimensionA() {
        return dimensionA;
    }

    public int getDimensionB() {
        return dimensionB;
    }

    @Override
    public void draw() {
        for (int i =0; i<getDimensionA(); i++){
            for (int j = 0; j<getDimensionB(); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
