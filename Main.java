public class Main {

    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        Sample loginPage = new Sample(idandPasswords.getLoginInfo());

    }
}
