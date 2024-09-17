package questao_4;

public class Percentual {
	public double faturamentoTotal;
	public double sp = 67836.43;
    public double rj = 36678.66;
    public double mg = 29229.88;
    public double es = 27165.48;
    public double outros = 19849.53;
    
    public Percentual() {
    	this.faturamentoTotal = sp + rj + mg + es + outros;
    }
    
    public void calcPercentual () {
    	if (faturamentoTotal == 0) {
            System.out.println("O Faturamento deve ter algum valor antes de realizar esta função!!!");
        } else {
            double percentualSP = (sp / faturamentoTotal) * 100;
            double percentualRJ = (rj / faturamentoTotal) * 100;
            double percentualMG = (mg / faturamentoTotal) * 100;
            double percentualES = (es / faturamentoTotal) * 100;
            double percentualOutros = (outros / faturamentoTotal) * 100;
        
	        System.out.printf("SP: %.2f%%\n", percentualSP);
	        System.out.printf("RJ: %.2f%%\n", percentualRJ);
	        System.out.printf("MG: %.2f%%\n", percentualMG);
	        System.out.printf("ES: %.2f%%\n", percentualES);
	        System.out.printf("Outros: %.2f%%\n", percentualOutros);
        }
    }
}
