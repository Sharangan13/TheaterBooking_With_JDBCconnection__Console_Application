public class Theater {
    private int movieNumber;
    private String timeSloat;

    private  int capacity;

    Theater(int movie_number,String time_sloat,int cap){
        this.movieNumber=movie_number;
        this.timeSloat=time_sloat;
        this.capacity=cap;

    }

    public int getMovieNumber() {
        return movieNumber;
    }

    public void setMovieNumber(int movieNumber) {
        this.movieNumber = movieNumber;
    }

    public String getTimeSloat() {
        return timeSloat;
    }

    public void setTimeSloat(String timeSloat) {
        this.timeSloat = timeSloat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
