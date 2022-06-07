package com.ty.Service;

import java.util.List;

import com.ty.dao.ParticipatesDao;
import com.ty.dto.Participates;

public class ParticipatesService {
	ParticipatesDao participatesDao = new ParticipatesDao();

	public Participates saveParticipates(Participates participates) {
		return participatesDao.saveParticipates(participates);

	}

	public List<Participates> getAllParticipates() {
		return participatesDao.getAllParticipates();

	}

	public Participates validateparticipate(String email, String password) {
		return participatesDao.validateparticipate(email, password);
	}

	public Participates updateParticipates(Participates participates) {
		return participatesDao.updateParticipates(participates);

	}

	public Participates deleteParticipates(int id) {
		return participatesDao.deleteParticipates(id);

	}
}
