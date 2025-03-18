public class Adder {
    
        public static int add(int a, int b){
            return a + b;
        }
        public static float add(float a, float b){
            return a + b;
        }
        public static String add(String firstLine, String secondLine){
            return firstLine + secondLine;
        }
        public static char add(char char1, char char2) {
            int value1 = (int) char1;
            int value2 = (int) char2;
            int sum = value1 + value2;
            return (char) sum;
        }
}
    

