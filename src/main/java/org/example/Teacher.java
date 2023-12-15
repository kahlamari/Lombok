package org.example;

import lombok.With;

public record Teacher(
        int id,
        @With
        String name,

        String subject
) {
}
