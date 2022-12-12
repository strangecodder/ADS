package pract_4.task1;

enum Season {
    Autumn("Autumn","1st September","31st November",15),//15
    Winter("Winter","1st December","28 or 29 of February",-25),//15
    Spring("Spring","1st March","31st May",10),//10
    Summer("Summer","1st June","31st August",25);

    private String title;

    final public static String titleAutumn = "Autumn";
    final public static String titleWinter = "Winter";
    final public static String titleSpring = "Spring";
    final public static String titleSummer = "Summer";



    private String firstDay;
    private String lastDay;
    private double degree;


    Season(String title,String firstDay,String lastDay, double degree) {
        this.title = title;
        this.firstDay=firstDay;
        this.lastDay=lastDay;
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }
    public String getFirstDay(){return firstDay;}
    public String getLastDay(){return lastDay;}
    public void getDescription(){
        switch (title){
            case (titleAutumn):
                System.out.println("Not hot but still not cold");
                break;
            case (titleWinter):
                System.out.println("Very very cold");
                break;
            case (titleSpring):
                System.out.println("Not cold but still not hot");
                break;
            case (titleSummer):
                System.out.println("Very very hot");
                break;
        }
    }
}
