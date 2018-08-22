public class Tree implements Drawable{

    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        for (int i =1; i <=height; i++){
            for (int j =1; j<=height-i; j++){
                System.out.print(" ");

            }
            for (int k =1; k<= (i+i)-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
