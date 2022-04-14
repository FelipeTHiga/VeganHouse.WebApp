package com.example.veganhouse.data

data class UserRegister(val id: Int,
                        var nameUser: String,
                        var surname: String,
                        var cpf: String,
                        var email: String,
                        var passwordUser: String,
                        var isSeller: Boolean,
                        var authenticated: Boolean)
