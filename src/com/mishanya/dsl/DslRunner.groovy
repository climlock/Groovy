package com.mishanya.dsl

import static  com.mishanya.dsl.DslBuilder.*

//def email = new Email()
//email.setFrom("from@gmail.com")
//email.setTo("to@gmail.com")
//email.setTitile("title")
//
//def body = new EmailBody()
//body.setText("sdasdasd")
//body.setImage(List.of("Image.jpg"))
//body.setBody(body)

// Builder
mail {
    from "from@gmail.com"
    to "to@gmail.com"
    title "title"
    body {
        text "text"
        images ('image.jpg', 'image2.jpg')

    }
}
