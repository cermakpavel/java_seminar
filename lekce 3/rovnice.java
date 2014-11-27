public class rovnice
{
  public static void main (String [] args)
  {
    double a=Double.parseDouble(args[0]);
    double b=Double.parseDouble(args[1]);
    double c=Double.parseDouble(args[2]);
    double diskr=(b*b)-(4*a*c);
    if (diskr < 0) {
      System.out.printf("Nema reseni");
    }
    else 
    {
      if (diskr == 0) {
        double x12=-b/(2*a);
        System.out.println(x12);
      }
      else {
        double x1=(-b+Math.sqrt(diskr))/(2*a);
        double x2=(-b-Math.sqrt(diskr))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
      }
    }
}
}