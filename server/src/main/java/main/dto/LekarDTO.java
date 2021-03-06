package main.dto;

import main.model.AdministratorKlinike;
import main.model.Lekar;

public class LekarDTO {

	private Long id;
	
	   private String ime;
	   
	   private String prezime;
		
	   private String lozinka;
		
	   private String jmbg;
		
	   private String adresa;
		
	   private String email;
		
	   private String grad;
	   
	   private String drzava;
		
	   private String telefon;
	   
	   private Integer pocetak;
	   
	   private Double ocena;
	   
	   private Integer kraj;

	   private Long idKlinike;	
	   
	   private Long idTipaPregleda;	
	   
	   private Boolean promenjenaLozinka;

	   public LekarDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

 
	
	public LekarDTO(Long id, String ime, String prezime, String lozinka, String jmbg, String adresa, String email,
			String grad, String drzava, String telefon, Double ocena) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.lozinka = lozinka;
		this.jmbg = jmbg;
		this.adresa = adresa;
		this.email = email;
		this.grad = grad;
		this.drzava = drzava;
		this.telefon = telefon;
		this.ocena=ocena;
	}


	public LekarDTO(Lekar lekar) {
		super();
		this.id = lekar.getId();
		this.ime = lekar.getIme();
		this.prezime = lekar.getPrezime();
		this.email = lekar.getEmail();
		this.lozinka = lekar.getLozinka();
		this.adresa = lekar.getAdresa();
		this.grad = lekar.getGrad();
		this.drzava = lekar.getDrzava();
		this.telefon = lekar.getTelefon();
		this.jmbg = lekar.getJmbg();
		this.pocetak = lekar.getPocetak();
		this.kraj = lekar.getKraj();
		this.idTipaPregleda = lekar.getTipPregleda().getId();
		this.promenjenaLozinka = lekar.getPromenjenaLozinka();
    
		this.idKlinike = lekar.getKlinika().getId();

		this.ocena=lekar.getOcena();
	}



	public Double getOcena() {
		return ocena;
	}



	public void setOcena(Double ocena) {
		this.ocena = ocena;


	}



	public Boolean getPromenjenaLozinka() {
		return promenjenaLozinka;
	}



	public void setPromenjenaLozinka(Boolean promenjenaLozinka) {
		this.promenjenaLozinka = promenjenaLozinka;
	}



	public Long getIdTipaPregleda() {
		return idTipaPregleda;
	}



	public void setIdTipaPregleda(Long idTipaPregleda) {
		this.idTipaPregleda = idTipaPregleda;
	}



	public Long getIdKlinike() {
		return idKlinike;
	}



	public void setIdKlinike(Long idKlinike) {
		this.idKlinike = idKlinike;
	}



	public Long getId() {
		return id;
	}






	public Integer getPocetak() {
		return pocetak;
	}



	public void setPocetak(Integer pocetak) {
		this.pocetak = pocetak;
	}



	public Integer getKraj() {
		return kraj;
	}



	public void setKraj(Integer kraj) {
		this.kraj = kraj;
	}



	public void setId(Long id) {
		this.id = id;
	}






	public String getIme() {
		return ime;
	}






	public void setIme(String ime) {
		this.ime = ime;
	}






	public String getPrezime() {
		return prezime;
	}






	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}






	public String getLozinka() {
		return lozinka;
	}






	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}






	public String getJmbg() {
		return jmbg;
	}






	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}






	public String getAdresa() {
		return adresa;
	}






	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getGrad() {
		return grad;
	}






	public void setGrad(String grad) {
		this.grad = grad;
	}






	public String getDrzava() {
		return drzava;
	}






	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}






	public String getTelefon() {
		return telefon;
	}






	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	
	   
	   
	
}
