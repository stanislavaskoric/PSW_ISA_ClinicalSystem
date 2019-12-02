package main.service;

import javax.persistence.EntityNotFoundException;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.AdminKlinikeDTO;
import main.dto.MedicinskaSestraDTO;
import main.model.AdministratorKlinike;
import main.model.MedicinskaSestra;
import main.repository.AdminKlinikeRepository;
import main.repository.MedicinskaSestraRepository;

@Service
public class MedicinskaSestraService {
	@Autowired
	private MedicinskaSestraRepository msr;
	
	public MedicinskaSestra findOne(Long id) {
		return msr.findById(id).orElseGet(null);
	}
	
	public MedicinskaSestra findOneEmail(String email) {
		return msr.findByEmail(email);
	}
	
	public void izmeniMedicinskuSestru(MedicinskaSestraDTO msdto) {
		MedicinskaSestra ms = msr.findById(msdto.getId()).orElse(null);
		
		if(ms == null) {
			throw new ValidationException("Admin sa zadatim id-jem ne postoji");
		}
		try {
			ms = msr.getOne(msdto.getId());
			ms.setIme(msdto.getIme());
			ms.setPrezime(msdto.getPrezime());
			ms.setAdresa(msdto.getAdresa());
			ms.setTelefon(msdto.getTelefon());
			ms.setGrad(msdto.getGrad());
			ms.setDrzava(msdto.getDrzava());
			msr.save(ms);
		} catch (EntityNotFoundException e) {
			throw new ValidationException("Admin sa tim id-ijem ne postoji");
		}
	}
}