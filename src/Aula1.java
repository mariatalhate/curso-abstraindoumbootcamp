import java.time.LocalDate;
public class Aula1 {
    public static void main(String[] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso ();
        curso2.setTitulo("Curso de js");
        curso2.setDescricao("Descricao do curso de js");
        curso2.setCargaHoraria(4);
       
        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da mentoria de java");
        mentoria.setData(LocalDate.now());
        
       // System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Descricao Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos inscritos: "+ devCamila.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("Xp = " + devCamila.calcularTotalXp());
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos: "+devJoao.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Xp = " + devJoao.calcularTotalXp());
        


    }
}

class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + cargaHoraria + "'" +
            "}";
    }
}

class Mentoria extends Conteudo { 
    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            "titulo='"+ getTitulo()+"'" +
            "descricao='"+ getDescricao()+"'" +
            " data='" + data + "'" +
            "}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }
}