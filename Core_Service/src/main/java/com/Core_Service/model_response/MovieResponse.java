package com.Core_Service.model_response;

import lombok.Builder;

@Builder
public class MovieResponse {
    private Long movieId;
    private String name;
    private String genre;
    private String description;
    private String uniqueMovieId;
    private String posterURL;
    private int price;
    private double rating;
    private String createdAt;
}
