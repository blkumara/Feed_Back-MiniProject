package com.ty.Service;

import java.util.List;

import com.ty.dao.FeedBackDao;
import com.ty.dto.FeedBack;

public class FeedBackService {

	FeedBackDao feedBackDao = new FeedBackDao();

	public FeedBack saveFeedBack(FeedBack feedBack) {
		return feedBackDao.saveFeedBack(feedBack);

	}

	public FeedBack getFeedBackById(int id) {
		return feedBackDao.getFeedBackById(id);
	}

	public List<FeedBack> getAllFeedBack() {
		return feedBackDao.getAllFeedBack();
	}

	public FeedBack updateFeedBack(FeedBack feedBack) {
		return feedBackDao.updateFeedBack(feedBack);
	}

	public FeedBack deleteFeedBack(int id) {
		return feedBackDao.deleteFeedBack(id);
	}

}
