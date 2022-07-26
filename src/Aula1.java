import java.util.Objects;
public class Aula1 {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Aulas de JAVA");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        Curso curso2 = new Curso("Curso js", "descricao curso js", 4);
        System.out.println(curso2);
        Mentoria mentoria1 = new Mentoria("Mentoria de java", "descricao mentoria de java", 2);
        System.out.println(mentoria1);

    }
}

class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    public Curso() {
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso curso = (Curso) o;
        return Objects.equals(titulo, curso.titulo) && Objects.equals(descricao, curso.descricao) && cargaHoraria == curso.cargaHoraria;
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHoraria);
    }
}

class Mentoria { 
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Mentoria() {
    }
    public Mentoria(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mentoria)) {
            return false;
        }
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(titulo, mentoria.titulo) && Objects.equals(descricao, mentoria.descricao) && cargaHoraria == mentoria.cargaHoraria;
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHoraria);
    }
}