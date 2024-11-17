public class TriangleClassifier {
    public String classifyTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Khong phai tam giac";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Khong phai tam giac";
        }
        if (a == b && b == c) {
            return "Tam giac deu";
        }
        if (a == b || b == c || a == c){
            return "Tam giac can";
        }
        return "Tam giac thuong";
    }

}
