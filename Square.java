public class Square implements Drawable{

    private int side;


    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }


    public void draw() {
        for (int i =0; i<getSide();i++){
            for (int j=0; j<getSide(); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
