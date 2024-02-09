package src.seminar12.task3;

public class Square extends Rectangle{
    @Override
    public void setWidth(double width){
        this.width = width;
        this.height = width;
    }
    @Override
    public void setHeight(double height){
        this.height = height;
        this.width = height;
    }

}
