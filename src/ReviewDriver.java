import java.awt.*;

public class ReviewDriver {
    public static double sentimentVal (String word){
        return 0;
    }
    public static void main(String[]args){
        System.out.println(Review.sentimentVal("among"));
        System.out.println(Review.sentimentVal("math"));
        System.out.println(Review.sentimentVal("smile"));
        double num =sentimentVal("warm");

        System.out.println(Review.totalSentiment("26WestReview.txt"));

    }
}
