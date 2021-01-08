class Main {
  public static void main(String[] args) {
    
    int num = 310;

    if(num < 1 || num > 3999){
      System.out.println("number out of range");
      return;
    }

    String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String hund[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String thous[] = {"","M","MM","MMM"};

    System.out.println(thous[num/1000] + hund[num%1000/100] + tens[num%100/10] + ones[num%10/1]);


  }
}