class Hanoi_1 {
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
}
