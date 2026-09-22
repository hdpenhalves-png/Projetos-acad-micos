package uscs;

public class testaAluno {

    public static void main(String[] args) {
        Aluno X1 = new Aluno();
        X1.nome = "Paulo";
        X1.codmat = 55123;
        X1.cpf = "800912345-12";
        X1.sexo = 'M';
        X1.nota_P1 = 7.0;
        X1.nota_P2 = 6.0;
        X1.nota_P3 = 8.0;
        
        X1.imprime_Aluno();
        X1.media_Aluno();
        X1.Resultado();
        X1.imprimi_sexo();

        
        Aluno X2 = new Aluno();
        X2.nome = "Ana";
        X2.codmat = 991239;
        X2.cpf = "500876123-15";
        X2.sexo = 'F';
        X2.nota_P1 = 2.0;
        X2.nota_P2 = 6.0;
        X2.nota_P3 = 9.0;
        
        X2.imprime_Aluno();
        X2.media_Aluno();
        X2.Resultado();
        X2.imprimi_sexo();
    }

}
