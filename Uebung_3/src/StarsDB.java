public class StarsDB {
    
    private Star[] stars;
    
    public StarsDB(int numOfStars){
        this.stars = new Star[numOfStars];
    }
    
    public int getNumOfStars(){
        return stars.length;
    }
    
    public void addStar(String starName, String starID, double starDistance, double starApparentMagnitude, String starType){
        Star newStar = new Star(starName, starID, starDistance, starApparentMagnitude, starType);
        Star[] tmp = new Star[stars.length+1];
        for (int i = 0; i < stars.length; i++){
            tmp[i] = stars[i];
        }
        tmp[tmp.length-1] = newStar;
        stars = tmp;
    }

    public Star getStar(int index) {
        return stars[index];
    }

    public String getStarname(String starID){
        String starname = "";
        boolean contains = false;
        for (int i = 0; i < stars.length; i++ ){
            if (stars[i].getStarID().equals(starID)){
                contains = true;
                starname = stars[i].getStarName();

            }
        }
        if (!contains){
            return "There is no such star.";
        }
        return starname;

    }

}
