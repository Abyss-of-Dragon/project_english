$(document)
    .ready(function() {

        $('.ui.form')
            .form({
                fields: {
                    id: {
                        identifier : 'id',
                        rules:[
                            {
                                type   : 'empty',
                                prompt : '未输入学工号，uid，plz'
                            }
                        ]
                    },
                    english: {
                        identifier : 'english',
                        rules:[
                            {
                                type   : 'empty',
                                prompt : '未输入学工号，uid，plz'
                            }
                        ]
                    },
                    chinese: {
                        identifier  : 'chinese',
                        rules: [
                            {
                                type   : 'empty',
                                prompt : '没写名字，君の名前は？'
                            }
                        ]
                    },
                    attribute: {
                        identifier  : 'attribute',
                        rules: [
                            {
                                type   : 'empty',
                                prompt : '是不是忘写密码了？'
                            }
                        ]
                    },
                }
            })
        ;
    })
;
