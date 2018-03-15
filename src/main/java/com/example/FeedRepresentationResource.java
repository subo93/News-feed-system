package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.services.FeedService;

/**
 * Root resource (exposed at "FeedRepresentationResource" path)
 */
@Path("telco/news/feed/{feedId}")
public class FeedRepresentationResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getFeedById(@PathParam("feedId") final int feedId) {

		return Response.ok(FeedService.getNewsFeed(feedId), MediaType.APPLICATION_JSON).build();
	}
}
