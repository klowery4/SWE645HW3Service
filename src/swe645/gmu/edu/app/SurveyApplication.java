package swe645.gmu.edu.app;
import org.glassfish.jersey.server.ResourceConfig;

public class SurveyApplication  extends ResourceConfig
{
    public SurveyApplication()
    {
        packages("swe645.gmu.edu.serviceImpl");
    }
}
