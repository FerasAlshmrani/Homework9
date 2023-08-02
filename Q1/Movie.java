public class Movie extends Product{
    public String director;

    Movie(){

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice()*0.5;
    }
    public String toString(){
        return "Movie name: "+getName()+" price: "+getPrice()+" After discount "+getDiscount()+"\ndirector by : "+getDirector();
    }
}
