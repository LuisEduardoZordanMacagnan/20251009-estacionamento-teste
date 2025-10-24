package builder;

public class CarroBuilder {
    private Carro instance = new Carro();
    private Motorista motorista = new Motorista();

    public CarroBuilder addPlaca(String placa){
        instance.setPlaca(placa);
        return this;
    }

    public CarroBuilder addMarca(String marca){
        instance.setMarca(marca);
        return this;
    }

    public CarroBuilder addAnoFabricacao(int anoFabricacao){
        instance.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public CarroBuilder addAnoModelo(int anoModelo){
        instance.setAnoFabricacao(anoModelo);
        return this;
    }

    public CarroBuilder addChassi(String chassi){
        instance.setChassi(chassi);
        return this;
    }

    public CarroBuilder addMotoristaNome(String nome){
        motorista.setNome(nome);
        return this;
    }

    public CarroBuilder addMotoristaCnh(String cnh){
        motorista.setCnh(cnh);
        return this;
    }

    public Carro build() throws Exception{
        if ( instance.getPlaca() == null ) throw new Exception("Carro sem placa");
        if ( motorista.getNome() == null ) throw new Exception("Motorista sem nome");
        if ( motorista.getCnh() == null ) throw new Exception("Motorista sem CNH");

        instance.setMotorista(motorista);
        return instance;
    }
}
