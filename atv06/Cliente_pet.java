public class Cliente_pet {
        private String nome;
        private int idade;
        private Pet_cliente pet;
       
        public Cliente_pet() {
        }

        public Cliente_pet(String nome, int idade, Pet_cliente pet) {
            this.nome = nome;
            this.idade = idade;
            this.pet = pet;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public Pet_cliente getPet() {
            return pet;
        }

        public void setPet(Pet_cliente pet) {
            this.pet = pet;
        }

        @Override
        public String toString() {
            return "Cliente_pet [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
        }

        
}
