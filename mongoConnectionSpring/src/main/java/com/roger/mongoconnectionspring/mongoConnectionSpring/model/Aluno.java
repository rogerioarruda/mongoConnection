package com.roger.mongoconnectionspring.mongoConnectionSpring.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record Aluno(@NotEmpty String nome) {
}
