class CatalogoAviones {
	Avion[] planes; 
	public CatalogoAviones() {
		planes = new Avion[3];
		planes[0] = new Avion("Boening", "747D", 15645.87, "Messi", 10);
		planes[1] = new Avion("Embraer", "360A", 7654.34, "Cr7", 11);
		planes[2] = new Avion("AirBus", "360C", 3000.45, "Hazard");
	};

	public void showPlanes(){
		for (int i = 0; i < 3; i++) {
			planes[i].desplegar();
		}
	}

	public void choosePlane(int _plane){
		System.out.println("Avion numero " + (_plane + 1) + " .\n");
		Avion choosen = planes[_plane];
		choosen.desplegar();
	}	
	public void choosePlane(int _plane, int _times){
		System.out.println("Avion numero " + (_plane + 1) + " .\n");
		Avion choosen = planes[_plane];
		if (_times == -1) {
			choosen.girarHelices();
		}else{
			choosen.girarHelices(_times);
		}
	}
}