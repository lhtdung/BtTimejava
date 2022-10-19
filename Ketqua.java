public class Ketqua {
        public static void main(String[] args) {
            Time t = new Time(11, 12, 11);
            t.display();
            t.setTime(22, 19, 19);
            t.display();
            t.nextSecond();
            t.display();
            t.nextSecond();
            t.display();
            t.setTime(1, 12, 12);
            t.display();
            t.previousSecond();
            t.display();
        }
    
}
