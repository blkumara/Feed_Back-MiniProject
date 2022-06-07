package com.ty.Service;

import java.util.List;

import com.ty.dao.CoOrdinateDao;
import com.ty.dto.CoOrdinate;

public class CoOrdinateService {
	CoOrdinateDao coOrdinateDao = new CoOrdinateDao();

	public CoOrdinate saveCoOrdinate(CoOrdinate coOrdinate) {
		return coOrdinateDao.saveCoOrdinate(coOrdinate);

	}

	public List<CoOrdinate> getAllCoOrdinates() {
		return coOrdinateDao.getAllCoOrdinates();

	}

	public CoOrdinate validateCoOrdinate(String email, String password) {
		return coOrdinateDao.validateCoOrdinate(email, password);

	}

	public CoOrdinate updateCoOrdinate(CoOrdinate coOrdinate) {
		return coOrdinateDao.updateCoOrdinate(coOrdinate);

	}

	public CoOrdinate deleteCoOrdinate(int id) {
		return coOrdinateDao.deleteCoOrdinate(id);

	}

}
