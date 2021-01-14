package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, "MALE");// Gender was add in attribute position 3.

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        J_teacher techer = new J_teacher("Columbus", 28, "MALE");

        techer.teacher = " Have a break at the week end.";
        techer.introduce();
        techer.jobListT();

        J_business bus = new J_business("Alex", 33, "MALE");

        bus.busin = "work hard";
        bus.introduce();
        bus.jobListB();

        J_motorGP gp = new J_motorGP("Armontough", 25, "MALE");

        gp.mototDK = "professional motor's drift.";
        gp.introduce();
        gp.jobListM();

        J_Gunner gun = new J_Gunner("Houg", 28, "FEMALE");

        gun.gun = "murdern";
        gun.introduce();
        gun.jobListG();

        J_programmer pg = new J_programmer("Lucifer", 39, "MALE");

        pg.place_job = "developing applications program.";
        pg.introduce();
        pg.jobListP();


    }
}
