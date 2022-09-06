public class Square {
    public double side;

    public Square(double side){
        this.side = side;
    }

    public double calcArea(){
        return Math.pow(this.side, 2);
    }
}

//
//    public double length;
//
//    public double Square(double length) {
//        this.length = length;
//
//        public double calculatorArea(){
//            return this.length * this.length;
//        }
//    }