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

	/* （非 Javadoc）
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

	/* （非 Javadoc）
	 * @see com.hnjd.news.dao.NewsDao#getNewsByTopicId(int)
	 */
	@Override
	public List<News> getNewsByTopicId(int ntid) {
		// TODO 自动生成的方法存根
		return null;
	}

	/* （非 Javadoc）
	 * @see com.hnjd.news.dao.NewsDao#getNewsById(int)
	 */
	@Override
	public News getNewsById(int nid) {
		// TODO 自动生成的方法存根
		return null;
	}

	/* （非 Javadoc）
	 * @see com.hnjd.news.dao.NewsDao#addNews(com.hnjd.news.entity.News)
	 */
	@Override
	public int addNews(News news) {
		// TODO 自动生成的方法存根
		return 0;
	}

	/* （非 Javadoc）
	 * @see com.hnjd.news.dao.NewsDao#editNews(int)
	 */
	@Override
	public int editNews(int nid) {
		// TODO 自动生成的方法存根
		return 0;
	}

	/* （非 Javadoc）
	 * @see com.hnjd.news.dao.NewsDao#deleteNews(int)
	 */
	@Override
	public int deleteNews(int nid) {
		// TODO 自动生成的方法存根
		return 0;
	}
	@Override
	public List<News> getNewsByCondition(News news) throws Exception {
		String sql = "select * from news where "
				+ "ntitle like concat('%', ? ,'%')  "
				
				+ "and nauthor like concat('%', ? ,'%') "
				+ "and ntid = ? "
				+ "and date(ncreateDate) = date(?) ";
		ResultSet res = excuteQuery(sql , 
				news.getNtitle(),
				news.getNauthor(),
				news.getNtid(),
				new java.sql.Date(news.getNcreateDate().getTime()));
		List<News> newsList = new ArrayList<News>();
		while(res.next()) {
			News newsObj = new News();
			newsObj.setNid(res.getInt("nid"));
			newsObj.setNtitle(res.getString("ntitle"));
			newsObj.setNsummary(res.getString("nsummary"));
			newsObj.setNpicPath(res.getString("npicPath"));
			newsObj.setNcreateDate(res.getDate("ncreateDate"));
			newsObj.setNmodifyDate(res.getDate("nmodifyDate"));
			newsObj.setNcontent(res.getString("ncontent"));
			newsObj.setNauthor(res.getString("nauthor"));
			newsObj.setNtid(res.getInt("ntid"));
			newsList.add(newsObj);
		}
		return newsList;
	}

}
