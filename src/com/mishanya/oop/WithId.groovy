package com.mishanya.oop

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }
}