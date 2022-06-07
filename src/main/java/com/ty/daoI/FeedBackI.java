package com.ty.daoI;

import java.util.List;

import com.ty.dto.FeedBack;

public interface FeedBackI {

	public FeedBack saveFeedBack(FeedBack feedBack);

	public FeedBack getFeedBackById(int id);

	public List<FeedBack> getAllFeedBack();

	public FeedBack updateFeedBack(FeedBack feedBack);

	public FeedBack deleteFeedBack(int id);

}
