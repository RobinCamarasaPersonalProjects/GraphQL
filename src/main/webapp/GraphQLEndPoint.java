import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;


@WebServlet(urlPatterns = "/all")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    public GraphQLEndpoint() {
        super(SchemaParser.newParser()
                .file("schema.graphqls")
                .build()
                .makeExecutableSchema());
    }
}