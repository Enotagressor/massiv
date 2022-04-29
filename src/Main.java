public class Main {
    public static void main(String[] args) {
        task1();
    }

  public static void task1() {
//1 zada4a

//1.1
      int[] mas = new int[3];
      mas[0] = 1;
      mas[1] = 2;
      mas[2] = 3;

//1.2
      double[] masDrob = {-1.57, 7.654, 9.986};

      //1.3
      int[] masSvoi = {-3, -5, 7};

//2 zada4a
      for (int i = 0; i < mas.length; i++) {
          System.out.print(mas[i]);
          if (i < mas.length - 1) {
              System.out.print(", ");
          }
      }
      System.out.println(" ");
      for (int j = 0; j < masDrob.length; j++) {
          System.out.print(masDrob[j]);
          if (j < masDrob.length - 1) {
              System.out.print(", ");
          }
      }
      System.out.println(" ");
      for (int k = 0; k < masSvoi.length; k++) {
          System.out.print(masSvoi[k]);
          if (k < masSvoi.length - 1) {
              System.out.print(", ");
          }
      }
      System.out.println(" ");

//3 zada4a
      for (int e = (mas.length - 1); e >= 0; e--) {
          System.out.print(mas[e]);
          if (e > 0) {
              System.out.print(", ");
          }
      }
      System.out.println(" ");
      for (int r = (masDrob.length - 1); r >= 0; r--) {
          System.out.print(masDrob[r]);
          if (r > 0) {
              System.out.print(", ");
          }
      }
      System.out.println(" ");
      for (int t = (masSvoi.length - 1); t >= 0; t--) {
          System.out.print(masSvoi[t]);
          if (t > 0) {
              System.out.print(", ");
          }
      }
//4 Zada4a
      System.out.println(" ");
      for (int n = 0; n < mas.length; n++) {
          if (mas[n] % 2 != 0) {
              mas[n] = mas[n] + 1;
          }
          System.out.print(mas[n]);
          if (n < mas.length - 1) {
              System.out.print(", ");
          }
      }
  }
}