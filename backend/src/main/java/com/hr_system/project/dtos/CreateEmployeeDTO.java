package com.hr_system.project.dtos;

import java.util.Date;

public record CreateEmployeeDTO(String name, Date initDate, int salary, String position, String team) {
}
