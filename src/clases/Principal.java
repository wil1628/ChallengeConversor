package clases;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		OpcionConversor conversion = new OpcionConversor();
		OpcionTemperatura conversionT = new OpcionTemperatura();

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Seleccione")
					.toString();

			switch (opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor que desea convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Fin del proceso");
				}
				break;

			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas   (valorRecibidoT);

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Fin del proceso");
				}

			}
			break;
		}

	}

}
