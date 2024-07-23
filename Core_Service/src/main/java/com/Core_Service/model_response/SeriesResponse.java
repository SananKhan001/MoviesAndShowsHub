package com.Core_Service.model_response;

import lombok.Builder;

@Builder
public class SeriesResponse {
    private Long seriesId;
    private String name;
    private String genre;
    private String description;
    private String posterURL;
    private int price;
    private int rating;
    private String createdAt;
}
