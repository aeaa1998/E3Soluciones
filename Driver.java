import java.util.Scanner; 
import java.util.Arrays;
class Driver{
	static String[] principalMenu = {"Ver un avion", "Desplegar catalogo", "Girar helices de un avion", "Cerrar programa"};
	static String[] answers = {"si", "no"};
	static String choosePlaneText = "Ingrese el numero de avion que desea.\n1)Boening\n2)Embraer\n3)AirBus";
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		Boolean on = true;
		CatalogoAviones catalog = new CatalogoAviones();
		while (on)
		{
			String choosen = Helpers.selectOptions(myScan, principalMenu);
			if (choosen.equalsIgnoreCase(principalMenu[0])) {
				//Choose your plane
				int planeInt = Helpers.intPositiveInput(myScan, choosePlaneText, "Escoja un avion válido", 3);
				//Show plane
				catalog.choosePlane(planeInt - 1);
			}else if (choosen.equalsIgnoreCase(principalMenu[1])){
				//Show all planes in catalog
				catalog.showPlanes();
			}else if (choosen.equalsIgnoreCase(principalMenu[2])){
				int times = -1;
				String choosen2 = Helpers.selectOptions(myScan, answers, "Ingrese si o no");
				int planeInt = Helpers.intPositiveInput(myScan, choosePlaneText, "Escoja un avion válido", 3);
				if (choosen2.equalsIgnoreCase(answers[0])) {
					times = Helpers.intPositiveInput(myScan, "Ingrese el numero de veces que desea girar las helices", "Elija un numero valido");
				}
					catalog.choosePlane(planeInt - 1, times);
			}else if (choosen.equalsIgnoreCase(principalMenu[3])){
				System.out.println("Gracias por usar el programa");
				on = !on;
			}
		}
	}
}