public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder str = new StringBuilder("(" + numbers[0] + numbers[1] + numbers[2] + ") ");
    for(int i = 3; i<numbers.length; i++){
      str.append(numbers[i]);
      if(i==5){
        str.append("-");
      }
    }
    return str.toString();
  }
}