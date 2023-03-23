package clases;

import javax.swing.*;

public class OpcionConversor {

	ConversorMoneda monedas = new ConversorMoneda();

	public void ConvertirMonedas(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De colón a Dólar", "De colón a Euro", "De colón a Libras Esterlinas",
						"De colón a Yen Japonés", "De colón a Won sub-coreano", "De Dólar a colón", "De Euro a colón",
						"De Libras Esterlinas a colón", "De Yen Japonés a colón", "De Won sub-coreano a colón" },
				"Seleccion")).toString();

		switch (opcion) {
		case "De colón a Dólar":
			monedas.ConvertirColonesDolares(valor);
			break;

		case "De colón a Euro":
			monedas.ConvertirColonesEuros(valor);
			break;

		case "De colón a Libras Esterlinas":
			monedas.ConvertirColonesLibra(valor);
			break;

		case "De colón a Yen Japonés":
			monedas.ConvertirColonesYen(valor);
			break;

		case "De colón a Won sub-coreano":
			monedas.ConvertirColonesWon(valor);
			break;

		case "De Dólar a colón":
			monedas.ConvertirDolaresColones(valor);
			break;

		case "De Euro a colón":
			monedas.ConvertirEurosColones(valor);
			break;

		case "De Libras Esterlinas a colón":
			monedas.ConvertirLibraColones(valor);
			break;

		case "De Yen Japonés a colón":
			monedas.ConvertirYenColones(valor);
			break;

		case "De Won sub-coreano a colón":
			monedas.ConvertirWonColones(valor);
			break;
		}
	}

}
