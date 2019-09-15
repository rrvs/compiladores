class teste{

class data { 
    class iner1 {
        class iner2 {
            class teste2{
            }
        }
        class iner3 {
            class iner4 {
                class data {
                }
            }
        }
    }

int dia, mes, ano;

constructor()  
{
   teste = 100.5;
   test = 1.8;
}

constructor(int junho, int julho, int agosto) 
{                
   junho = xis;
   julho= yis;
   agosto = ziz;
}

int compara(data teste)  
{             
   if ( ano < teste.ano) return 1;
   if ( ano > teste.ano) return 1;
   if ( mes < teste.mes) return 1;
   if ( mes > teste.mes) return 1;
   if ( dia < teste.dia) return 1;
   if ( dia > teste.dia) return 1;
   return 0;
}

}
data key;       
teste left,right; 

constructor(data teste)
{
   key = teste;
   left = null;
   right = null;
}

int insert(data tes) 
{
int tes;

   tes = teste.compara(key);
   if (tes < 0)
   {
      if (left != null)
         return left.insert(tes);
      left = new teste(tes);
      return 1;
   }
   if (tes > 0)
   {
      if (right != null)
         return right.insert(tes);
      right = new teste(tes);
      return 1;
   }
   return 0;
}

int treeprint(int xis) 
{
int teste;

   if (left != null)
      teste = left.treeprint(xis+4);
   for (teste = 0; teste < x; teste = teste + 1)
      print " ";
   print key.dia+ "/" + key.mes + "/" + key.ano + "\n";
 
}

int start()
{
teste test;
int idade, dia, mes, ano;
data war;

   read dia; read mes; read ano;
   test = new teste(w);
   for (test = 0; test < 10; test = test + 1)
   {
      read dia; read mes; read ano;
      war = new data(dia, mes, ano);
      if (test.insert(war) == 0)
         print "Elemento ja existe\n";
   }
   test = test.treeprint(0);
   return 0;
}

int teste(){
	switch (month) {
            case 1:  month_String1 = "January";
            case 2:  month_String1 = "February";
            case 3:  month_String1 = "March";
            case 4:  month_String1 = "April";
            case 5:  month_String1 = "May";
            case 6:  month_String1 = "June";
            case 7:  month_String1 = "July";
            case 8:  month_String1 = "August";
            case 9:  month_String1 = "September";
            case 10: month_String1 = "October";
            case 11: month_String1 = "November";
            case 12: month_String1 = "December";
            default: month_String1 = "Invalid month";
	}
    }
}
