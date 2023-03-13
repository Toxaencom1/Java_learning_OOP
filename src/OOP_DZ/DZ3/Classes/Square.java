package OOP_DZ.DZ3.Classes;


public class Square extends Rectangle {

    public Square() {
        super();
        setSides(1.0);
    }
//    public Square(ArrayList<Double> sideList, Double sideA) {
//        super(sideList);
//        if (sideA > 0) {
//            sideList.add(sideA);
//            sideList.add(sideA);
//            sideList.add(sideA);
//            sideList.add(sideA);
//        } else System.out.println("Square sides must be more than zero!");
//    }
// No need at the end


    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().lastIndexOf(" and C")) + ",B,C,D = " + getSideA() + "\n";
    }

    public void setSides(Double side) {
        sideList.replaceAll(x -> side);
    }
}
