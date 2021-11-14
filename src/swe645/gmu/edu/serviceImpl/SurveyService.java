package swe645.gmu.edu.serviceImpl;

import java.util.*;

import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import swe645.gmu.edu.entities.Survey;

@Path("/")
public class SurveyService
{
    private static final String PERSISTENCE_UNIT_NAME ="SurveyPU";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    
    
    @GET
    @Path("surveys")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Survey> getSurveys() {
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createQuery("SELECT s FROM Survey s"); 
        @SuppressWarnings("unchecked")
        List<Survey> surveyList = (List<Survey>)q.getResultList();
        return surveyList;
    }
    
    @GET
    @Path("surveys/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Survey getSurvey(@PathParam("id")int id) {
        EntityManager em = factory.createEntityManager(); 
        Query q = em.createQuery("SELECT s FROM Survey s where s.id=" + id); 
        Survey survey = (Survey) q.getSingleResult();
        return survey;
    }
    
    @POST
    @Path("surveys")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public void createSurvey(Survey newSurvey) {
        EntityManager em = factory.createEntityManager(); 
        EntityTransaction transaction = null;
        transaction = em.getTransaction();
        transaction.begin();
        em.persist(newSurvey);
        transaction.commit();
    }
}
