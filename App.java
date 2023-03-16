public class App {
    public static void main(String[] args) {
        Aluno alunoA = new Aluno();
        alunoA.nome = "Caio";
        alunoA.semestre = "3 Semestre";
        alunoA.idade = 19;
        alunoA.nota = 7.8f;
        alunoA.matriculado = true;
        alunoA.materia = "POO";
        System.out.println("Informações do Aluno");
        System.out.println("Nome do Aluno: "+alunoA.nome);
        System.out.println("Semestre do Aluno: "+alunoA.semestre);
        System.out.println("Idade: "+alunoA.idade);
        System.out.println("Nota: "+alunoA.nota);
        System.out.println("Matriculado: "+alunoA.matriculado);
        System.out.println("Materia: "+alunoA.materia);
    }
}
