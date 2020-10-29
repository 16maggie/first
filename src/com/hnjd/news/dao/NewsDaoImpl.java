/**
 * 
 */
package com.hnjd.news.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hnjd.news.entity.News;

/**
 * @author Administrator
 *
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#getAllNews()
	 */
	@Override
	public List<News> getAllNews() throws SQLException {
		List<News> newsList = new ArrayList<News>();
		ResultSet res = excuteQuery("select * from news");
		while(res.next()) {
			News news = new News();
			news.setNid(res.getInt("nid"));
			news.setNtitle(res.getString("ntitle"));
			news.setNsummary(res.getString("nsummary"));
			news.setNpicPath(res.getString("npicPath"));
			news.setNcreateDate(res.getDate("ncreateDate"));
			news.setNmodifyDate(res.getDate("nmodifyDate"));
			news.setNcontent(res.getString("ncontent"));
			news.setNauthor(res.getString("nauthor"));
			news.setNtid(res.getInt("ntid"));
			newsList.add(news);
		}
		return newsList;
	}

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#getNewsByTopicId(int)
	 */
	@Override
	public List<News> getNewsByTopicId(int ntid) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#getNewsById(int)
	 */
	@Override
	public News getNewsById(int nid) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#addNews(com.hnjd.news.entity.News)
	 */
	@Override
	public int addNews(News news) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#editNews(int)
	 */
	@Override
	public int editNews(int nid) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	/* ���� Javadoc��
	 * @see com.hnjd.news.dao.NewsDao#deleteNews(int)
	 */
	@Override
	public int deleteNews(int nid) {
		// TODO �Զ����ɵķ������
		return 0;
	}

}
