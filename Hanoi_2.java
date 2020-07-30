Class Hanoi_1 {
  public static void main(String[] args) {
    System.out.println("Hanoi de 5 discos es: \n"+ Main.hanoi (1,2,3,5));
  }

  public static String hanoi (int ini, int aux, int fin, int cantDiscos)
  {
    if (cantDiscos == 1)
      return "Desde "+ini+" hasta "+fin+ "\n";

    String sal  = hanoi (ini, fin, aux, cantDiscos-1);
           sal += hanoi (ini, aux, fin, 1);
           sal += hanoi (aux, ini, fin, cantDiscos-1);

    return sal;
  }
  
  public String hacerLinea(Integer n) {
    switch(n) 
    {
      case 0:
        return "";
      case 1:
        return "1";
      case 2:
        return "222";
      case 3:
        return "33333";
      case 4:
        return "4444444";
      case 5:
        return "555555555";
      case 6:
        return "66666666666";
      case 7:
        return "7777777777777";
      case 8:
        return "888888888888888";
      case 9:
        return "99999999999999999";
    }
  }
  
}
