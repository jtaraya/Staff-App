package dao;

import models.News;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oNewsDao implements NewsDao {

    private final Sql2o sql2o;

    public Sql2oNewsDao(Sql2o sql2o){
        this.sql2o = sql2o;
        //making the sql2o object available everywhere.so we can call methods in it
    }

    @Override
    public void add(News news) {
        String sql = "INSERT INTO news (content, departmentId) VALUES (:content, :departmentId)";
        //raw sql
        try (Connection con = sql2o.open()) {//try to open a connection
            int id = (int) con.createQuery(sql, true)
            //make a new variable
                    .bind(news)
            //map my argument onto the query.so we can use information from it
                    .executeUpdate()
            //run it all
                    .getKey();
            //int id is now the row number
            news.setId(id);
            //update object to set id now from database
        } catch (Sql2oException ex) {
            System.out.println(ex);
            //oops we have an error!
        }
    }

    @Override
    public List<News> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM news")
            //raw sql
                    .executeAndFetch(News.class);
            //fetch a list
        }
    }

    @Override
    public List<News> getAllNewsByDepartment(int departmentId) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM news WHERE departmentId = :departmentId")
                    .addParameter("departmentId", departmentId)
                    .executeAndFetch(News.class);
        }
    }

    @Override
    public News findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM news WHERE id = :id")
                    .addParameter("id", id) //key/value pair, key must match above
                    .executeAndFetchFirst(News.class); //fetch an individual item
        }
    }

    @Override
    public void update(int id, String newName){
        String sql = "UPDATE news SET name = :name WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("name", newName)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from news WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void clearAllNews() {
        String sql = "DELETE from news";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }



}
