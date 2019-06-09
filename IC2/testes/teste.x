private class Calculos {
	
  double Calculadora;  // variavel declarada fora de método

    private float Soma(){ //private e float
      float a;
      float b;
      float c; 
      a= 4;
      b= 5;
      c= 6;
      print(a+b+c);
		}


    protected int Multiplicacao(int a, int b){ //protected e int
     print(a*b);
    }

    public string testeLogicos(int a, int b, int c, int d, int e, int f){ // public, string e operadores logicos
		string resposta;
		if(a || b) {
			resposta = "OR";
		}
		if(c ^ d) {
			resposta = "XOR";
		}
		if(e && f) {
			resposta ="AND";
		}
		if(g ! h) {
			resposta = "NOT";
		}

    }

}
