package percepters;

public class Neuron {
    private  double[] input;
    private  double[] weight;
    private  double bias;

    public Neuron(double[] input, double[] weight, double bias) {
        this.input = input;
        this.weight = weight;
        this.bias = bias;
    }

    public void setInput(double[] input) {
        this.input = input;
    }

    public void setWeight(double[] weight) {
        this.weight = weight;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double[] getInput() {
        return input;
    }

    public double[] getWeight() {
        return weight;
    }

    public double getBias() {
        return bias;
    }

}
