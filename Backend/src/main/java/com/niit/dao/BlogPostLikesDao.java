package com.niit.dao;

import com.niit.model.BlogPost;
import com.niit.model.BlogPostLikes;

public interface BlogPostLikesDao {
	public BlogPostLikes hasUserLikedBlog(int blogId,String email);
	public BlogPost updateLikes(int id,String email);

}
