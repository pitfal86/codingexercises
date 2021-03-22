package academy.learnprogramming;

public class Point {

    private int x;
    private int y;

    public Point (){

    }

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX (){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY (){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance (){
        return Math.sqrt((getX() - 0.0) * (getX() - 0.0) + (getY() - 0.00) * (getY() - 0.00));
    }

    public double distance (int x, int y){
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance (Point point){
        return Math.sqrt((getX() - point.getX()) * (getX() - point.getX()) + (getY() - point.getY()) * (getY() - point.getY()));
    }

}
