public class App {

    public class PrintService {
 
        public void printResult(double result){
            System.out.print("-- Result = " + result);
        }
     
    }

    public class CalculationService {
 
        public double sumAreas(Polygon poligon1, Polygon poligon2){
            return poligon1.getArea() + poligon2.getArea();
        }
     
        public double diffAreas(Polygon poligon1, Polygon poligon2){
            return poligon1.getArea() - poligon2.getArea();
        }
     
    }
    
    public static void main(String[] args) throws Exception {
        CalculationService calculationService = new CalculationService();
        PrintService printService = new PrintService();
 
        Circle circle = new Circle(5);
        Square square = new Square(6);
 
        double result = calculationService.sumAreas(circle, square);
        printService.printResult(result);

    }
}
