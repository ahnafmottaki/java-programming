public class StringType {

  public static void main(String[] args) {
    String firstName = "ahnaf",
      lastName = "mottaki";
    System.out.println(firstName);
    // getting the length of the strinng
    System.out.println(firstName.length());
    System.out.println(firstName.toUpperCase());
    System.out.println(firstName.toLowerCase());
    System.out.println(firstName.indexOf("ah"));
    System.out.println(firstName.charAt(3));
    System.out.println(firstName.equals(lastName));
    System.out.println(firstName.trim());
    // string concatenation
    System.out.println(firstName + " " + lastName);
    // with the concat method
    System.out.println(
      firstName.concat(lastName).concat(" a full stack programmer")
    );
    System.out.println("Special characters in string");
    System.out.println("new line \n, \', \\, \"'");
  }
}
