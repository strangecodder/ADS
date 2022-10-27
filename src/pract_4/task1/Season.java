package pract_4.task1;

enum Season {
    Autumn(15),
    Winter(-15),
    Spring(10),
    Summer(25);

    private double degree;

    Season(double degree) {
        this.degree = degree;
    }

    public double getDegree() {
        return degree;
    }

}
