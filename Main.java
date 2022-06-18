class Main {
  public static void main(String[] args) {
    //Exercício 1:
    int x, y, soma;
    x = 10;
    y = 18;
    soma = x + y;
    System.out.println("");
    System.out.println("Exercício 1:");
    System.out.println("O resultado da soma é " + soma);
    System.out.println("");
    System.out.println("");

    //Exercício 2:
    int PrimeiroBimestre, SegundoBimestre,       
     TerceiroBimestre; 
    double QuartoBimestre, MediaNotasBimestrais;
    PrimeiroBimestre = 5;
    SegundoBimestre = 7;
    TerceiroBimestre = 9;
    QuartoBimestre = 9.5;
    MediaNotasBimestrais = (PrimeiroBimestre + SegundoBimestre + TerceiroBimestre + QuartoBimestre)/4;
    System.out.println("Exercício 2:");
     System.out.println("As notas do primeiro,segundo, terceiro e quarto bimestre são, respectivamente: " + PrimeiroBimestre + ", " + SegundoBimestre + ", " + TerceiroBimestre + ", " + QuartoBimestre + ".");
    System.out.println("A média bimestral é " + MediaNotasBimestrais);
    System.out.println("");
    System.out.println("");

    //Exercício 3:
    double metros, conversorCentimetro,centimetros;
    metros = 25.5;
    conversorCentimetro = 1E2;
    centimetros = metros*conversorCentimetro;
    System.out.println("Exercício 3:");
    System.out.print(metros + " convertido para centímetros é igual a "+ centimetros);
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    //Exercicio 4:
    int raio1, raio2, raio3;
    raio1 = 5;
    raio2 = 7;
    raio3 = 10;
    double PI, area1, area2, area3;
    PI = Math.PI;
    area1 = PI * Math. pow(raio1, 2);
    area2 = PI * Math. pow(raio2, 2);
    area3 = PI * Math. pow(raio3, 2);
    System.out.println("Exercício 4:");
    System.out.print("As áreas dos círculos com raio " + raio1 + ", " + raio2 + " e " + raio3);
    System.out.print(String.format(" são, respectivamente: %.2fl, ", area1));
    System.out.print(String.format("%.2fl e ", area2));
    System.out.print(String.format("%.2fl.", area3));
    System.out.println("");
    System.out.println("");
    System.out.println("");

    //Exercício 5:
    int ladoQuadrado, areaQuadrado, dobroArea;
    ladoQuadrado = 10;
    areaQuadrado = ladoQuadrado * ladoQuadrado;
    dobroArea = 2 * areaQuadrado;
    System.out.println("Exercício 5:");
    System.out.print("A área do quadrado de lado "+ ladoQuadrado+" é igual a "+areaQuadrado+" e seu dobro é "+dobroArea+".");
    System.out.println("");
    System.out.println("");
    System.out.println("");

    //Exercício 6:
    int Fahrenheit1, Fahrenheit2, Fahrenheit3;
    Fahrenheit1 = 110;
    Fahrenheit2 = 140;
    Fahrenheit3 = 203;
    
    float Celsius1, Celsius2, Celsius3;
    Celsius1 = ((Fahrenheit1-32) * 5) /9;
    //não sei como fazer para que, ao dividir por 9, considere uma casa após a vírgula. O correto seria: 110-32=78 e 78/9= 8,6, que ao ser multiplicado por 5 fica: 8,6*5= 43 e, não 40. Por isso, nesse cálculo fiz primeiro a multiplicação. 
    Celsius2 =  5 * ((Fahrenheit2-32) / 9);
    Celsius3 =  5 * ((Fahrenheit3-32) / 9);
   
    System.out.println("Exercício 6:");
    System.out.print("A temperatura "+Fahrenheit1+" graus Fahrenheit, "+Fahrenheit2+" graus Fahrenheit e "+Fahrenheit3+" graus Fahrenheit convertido em Celsius é, respectivamente, "+Celsius1+", "+Celsius2+" e "+Celsius3+" graus Celsius.");
  }
}