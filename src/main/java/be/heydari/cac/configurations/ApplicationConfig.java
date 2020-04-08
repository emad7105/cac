package be.heydari.cac.configurations;

import be.heydari.cac.Invoices.InvoiceRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import javax.annotation.PostConstruct;

/**
 * @author Emad Heydari Beni
 */
@Configuration
public class ApplicationConfig extends AbstractMongoClientConfiguration {

    @Autowired
    public Environment environment;
    public String mongoConnectionString;

    @PostConstruct
    public void setEnvironmentVariable() {
        mongoConnectionString = environment.getProperty("mongo.connection_string");
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create(mongoConnectionString);
    }

    @Override
    protected String getDatabaseName() {
        return "FinTechDB";
    }
}
