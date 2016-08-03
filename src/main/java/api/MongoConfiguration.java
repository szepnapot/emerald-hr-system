package api;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by pocok on 7/29/16.
 */
@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractMongoConfiguration {

  @Override
  protected String getDatabaseName() {
    return "heroku_xsb3xzn1";
  }

  @Override
  public Mongo mongo() throws Exception {
    String textUri = "mongodb://heroku_xsb3xzn1:p0i8bt9ol9uden65gglpeqhm9v@ds029585.mlab.com:29585/heroku_xsb3xzn1";
    MongoClientURI uri = new MongoClientURI(textUri);
    return new MongoClient(uri);
  }

  @Override
  protected String getMappingBasePackage() {
    return "foo.bar.domain";
  }
}
