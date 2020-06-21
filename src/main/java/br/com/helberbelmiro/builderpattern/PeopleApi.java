package br.com.helberbelmiro.builderpattern;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.List;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleApi {

    @GET
    public Response get() {
        final Person person = Person.builder()
                                    .withName("Steve Gates")
                                    .withBirthDate(LocalDate.of(1980, 12, 25))
                                    .withEmail("stevegates@gmail.com")
                                    .withPhoneNumber("1234598763")
                                    .withFacebookAccount("sgates")
                                    .withInstagramAccount("steve_gatez")
                                    .withGithubAccount("stevegates")
                                    .build();

        return Response.ok(List.of(person)).build();
    }

}