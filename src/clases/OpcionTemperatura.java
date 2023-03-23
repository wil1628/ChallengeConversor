package clases;

import javax.swing.JOptionPane;

public class OpcionTemperatura {

	Temperatura temperaturas = new Temperatura();

	public void ConvertirTemperaturas(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la Temperaturas que quieras Convertir ",
				"Temperaturas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine",
						"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
						"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius",
						"De Rankine a Fahrenheit", "De Rankine a Kelvin" },
				"Seleccion")).toString();

		switch (opcion) {
		case "De Celsius a Fahrenheit":
			temperaturas.ConvertirCelsiusFahrenheit(valor);
			break;

		case "De Celsius a Kelvin":
			temperaturas.ConvertirCelisusKelvin(valor);
			break;

		case "De Celsius a Rankine":
			temperaturas.ConvertirCelsiusRankine(valor);
			break;

		case "De Fahrenheit a Celsius":
			temperaturas.ConvertirFahrenheitCelsius(valor);
			break;

		case "De Fahrenheit a Kelvin":
			temperaturas.ConvertirFahrenheitKelvin(valor);
			break;

		case "De Fahrenheit a Rankine":
			temperaturas.ConvertirFahrenheitRankine(valor);
			break;

		case "De Kelvin a Celsius":
			temperaturas.ConvertirKelvinCelsius(valor);
			break;

		case "De Kelvin a Fahrenheit":
			temperaturas.ConvertirKelvinFahrenheit(valor);
			break;

		case "De Kelvin a Rankine":
			temperaturas.ConvertirKelvinRankine(valor);
			break;

		case "De Rankine a Celsius":
			temperaturas.ConvertirRankineCelsius(valor);
			break;

		case "De Rankine a Fahrenheit":
			temperaturas.ConvertirRankineFahrenheit(valor);
			break;

		case "De Rankine a Kelvin":
			temperaturas.ConvertirRankineKelvin(valor);
			break;
		}
	}
}
