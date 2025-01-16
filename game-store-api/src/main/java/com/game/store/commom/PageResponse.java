package com.game.store.commom;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageResponse<T> {

    private List<T> content;
    private int total;
    private int size;
    private int totalElements;
    private int totalPages;
    private boolean isLast;
    private boolean isFirst;
}
