package pl.models;

import java.util.ArrayList;
import java.util.List;


public class Samochod {

	public Samochod() {
		super();
	}
	
	public Samochod(int numer, String make, String model, double price, int year, String foto) {
		super();
		this.numer = numer;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		this.foto = foto;
		
		 
	}
	
	private int numer;
	private String make;
	private String model;
	private String foto;
	private int year;
	private double price; 
	private List<Samochod> cars;
	
	
	public List<Samochod> getCars() {
		List<Samochod> carsList = new ArrayList<>();
		carsList.add(new Samochod(1, "Audi", "A1", 150000, 2014, "https://otomotopl-imagestmp.akamaized.net/images_otomotopl/870370255_1_732x488_14-turbonaviaf15elektrykatempomatpiekna-white-edition-oplacona-zwolen.jpg"));
 		carsList.add(new Samochod(2, "Audi", "RS6", 600000, 2018,"https://www.audi.pl/content/dam/nemo/models/a6/rs-6-avant-performance/my-2016/multimedia-gallery-1920x1080/QRS6_PRF_151002_1920x1080.jpg"));
 		carsList.add(new Samochod(3, "BMW", "Seria X", 550000,2018,"https://www.bmw.pl/content/dam/bmw/common/all-models/x-series/x6/2014/model-card/BMW-X6_ModelCard.png/_jcr_content/renditions/cq5dam.resized.img.585.low.time1510609762346.png"));
 		carsList.add(new Samochod(4, "BMW", "M550",400000,2017,"https://i.ytimg.com/vi/1jo5_f5Zby0/maxresdefault.jpg"));
 		carsList.add(new Samochod(5, "Chevrolet", "Camaro",120000,2016,"https://media.ed.edmunds-media.com/chevrolet/camaro/2017/ot/2017_chevrolet_camaro_LIFE1_ot_1109162_1280.jpg" ));
 		carsList.add(new Samochod(6, "Chevrolet", "Nubira", 14.500,2004,"http://autosotua.com/img/spec/mdf/chevrolet-nubira-sedan-2005.jpg" ));
 		carsList.add(new Samochod(7, "Opel", "Crossland", 70000,2017,"http://dixi-car.pl/foto/galeria/crossland/crossover-crossland-x-tyl-d.jpg" ));
 		carsList.add(new Samochod(8, "Opel", "Astra",50000,2012,"http://www.opel.pl/content/dam/opel/master/vehicles/astra-hatchback/bbc/mmg/Opel_Astra_HB_MY18_576x322_mrm.png"));
		return carsList;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}
	
	public Samochod getCarByNumer(int numer) {
		Samochod car = null;
		for (Samochod samochod : getCars()) {
			if(samochod.getNumer() == numer) {
				car = samochod;
			}
		}
		return car;
	}
	
}
