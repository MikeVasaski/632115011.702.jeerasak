package week11;

public class Student{
    public static void main(String[] args) {
        //this is create the object from class STD_DATA. they are object
        STD_DATA std01 = new STD_DATA("Mark", 18, 4.00);
        STD_DATA std02 = new STD_DATA("Jane", 18, 2.20);
        STD_DATA std03 = new STD_DATA("Peter", 19, 4.00);
        STD_DATA std04 = new STD_DATA("Mark", 22, 1.75);

        //Compare std imfomation
        //name
        //System.out.println(" :::Name::: \nStudent1 compare with Student3 : "+std01.equals(std03));
        
        //age
        //System.out.println(" :::Age::: \nStudent3 compare with Student1 : "+std03.equals(std01));

        //GPA
        System.out.println(" :::GPA::: \nStudent2 compare with Student3 : "+std02.equals(std03));


    }//out off main method

}