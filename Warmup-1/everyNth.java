public String everyNth(String str, int n) {
  String finalString = "";
  for (int i = 0; i < str.length(); i++) {
    if (i % n == 0) {
      finalString += str.charAt(i);
    }
  }
  
  return finalString;
}