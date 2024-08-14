abstract class Veiculo {
    abstract double calcularTarifa(double distancia, double tempo);
}

class Carro extends Veiculo {
    @Override
    double calcularTarifa(double distancia, double tempo) {
        // Implementação específica para carros
        return distancia * 1.5 + tempo * 0.5;
    }
}

class Moto extends Veiculo {
    @Override
    double calcularTarifa(double distancia, double tempo) {
        // Implementação específica para motos
        return distancia * 1.0 + tempo * 0.3;
    }
}

class Bicicleta extends Veiculo {
    @Override
    double calcularTarifa(double distancia, double tempo) {
        // Implementação específica para bicicletas
        return distancia * 0.8 + tempo * 0.2;
    }
}
