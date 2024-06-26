package com.samcomo.dbz.report.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class ReportStateDto {

  @ToString
  @Getter
  @Builder
  public static class Response {

    private Long reportId;
    private String status;
  }
}
