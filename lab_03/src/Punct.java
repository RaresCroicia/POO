public class Punct {
    private int X, Y;
    Punct(){
        X = 0;
        Y = 0;
    }

    public int getX(){
        return X;
    }

    public void setX(int x){
        X = x;
    }

    int getY(){
        return Y;
    }

    public void setY(int y){
        Y = y;
    }

    public String toString(){
        return "("+X+","+Y+")";
    }

    public double distance(int X, int Y){
        return(Math.sqrt(Math.pow(this.X - X, 2) + Math.pow(this.Y - Y, 2)));
    }

    public double distance(Punct p1){
        return(Math.sqrt(Math.pow(this.X - p1.X, 2) + Math.pow(this.Y - p1.Y, 2)));
    }
}
