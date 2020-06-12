package com.company;

import com.company.util.HibernateUtil;
import org.hibernate.classic.Session;
import java.util.List;

public class ObjectDAO
{
    Session session = null;

    public void addValue(Object object)
    {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();

    }

    public void updateValue(Object object)
    {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteValue(Object object)
    {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
        session.close();
    }

    public Polka getPolkaById(Long idObject)
    {
        Polka polka = null;

        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        polka = (Polka) session.get(Polka.class, idObject);
        session.getTransaction().commit();
        session.close();

        return polka;
    }

    public List<Polka> getAllPolka() {
        List<Polka> polkas = null;

        session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        polkas = (List<Polka>)  HibernateUtil.getSessionFactory().openSession().createQuery("From Polka").list();
        session.getTransaction().commit();
        session.close();

        return polkas;
    }

    public List<Polka> hqlRequest() {
        return (List<Polka>)  HibernateUtil.getSessionFactory().openSession().createQuery("SELECT polka From Book, Jour, Polka polka WHERE polka.name = 'Big'").list();
    }
}
