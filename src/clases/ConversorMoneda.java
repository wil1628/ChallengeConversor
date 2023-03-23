package clases;

import javax.swing.JOptionPane;

public class ConversorMoneda {

		public void ConvertirColonesDolares(double valor) {
			double monedaDolar = valor * 0.0019;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
		}

		public void ConvertirColonesEuros(double valor) {
			double monedaEuro = valor * 0.0017;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
		}

		public void ConvertirColonesLibra(double valor) {
			double monedaLibra = valor * 0.0015;
			monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
		}

		public void ConvertirColonesYen(double valor) {
			double monedaYen = valor * 0.24;
			monedaYen = (double) Math.round(monedaYen * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
		}

		public void ConvertirColonesWon(double valor) {
			double monedaWon = valor * 2.38;
			monedaWon = (double) Math.round(monedaWon * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
		}

		public void ConvertirDolaresColones(double valor) {
			double monedaDolar = 540.02 * valor;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en colones");
		}

		public void ConvertirEurosColones(double valor) {
			double monedaEuro = valor * 588.56;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en colones");
		}

		public void ConvertirLibraColones(double valor) {
			double monedaLibra = valor * 664.98;
			monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en colones");
		}

		public void ConvertirYenColones(double valor) {
			double monedaYen = valor * 4.14;
			monedaYen = (double) Math.round(monedaYen * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en colones");
		}

		public void ConvertirWonColones(double valor) {
			double monedaWon = valor * 0.42;
			monedaWon = (double) Math.round(monedaWon * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en colones");
		}

	}

