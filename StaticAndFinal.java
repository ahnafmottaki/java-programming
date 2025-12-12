public class StaticAndFinal {

  public static void main(String[] args) {
    System.out.println("Learning static and final");
    HondaCity h1 = new HondaCity();
    System.out.println(HondaCity.price);
    StaticPractice s1 = new StaticPractice();
    StaticPractice s2 = new StaticPractice();
  }
}

class HondaCity {

  static long price = 10;

  static double onRoadPrice(String city) {
    switch (city) {
      case "delhi":
        return price + price * 0.1;
      case "mumbai":
        return price + price * 0.09;
      default:
        return 1d;
    }
  }
}

class StaticPractice {

  static int x = 10;
  final int y;

  public StaticPractice() {
    y = 10;
  }

  static {
    x++;
    System.out.println("Block1");
    System.out.println(x);
  }

  static {
    x++;
    System.out.println("Block2");
    System.out.println(x);
  }
}
