package com.codebear.retrofitexample

data class ResponseModel(
    val IsOnline: Boolean,
    val IsActionPermitted: Boolean,
    val IsExists: Boolean,
    val IsOk: Boolean,
    val Permiso: Boolean,
    val MensajeID: Int,
    val Mensaje: String,
    val TipoUsuario: String?,
    val UserName: String,
    val Password: String?,
    val ID: String,
    val Fecha: String,
    val URL: String,
    val NoFilas: Int,
    val Nota: String,
    val dsRespuesta: DsRespuestaModel
)

data class DsRespuestaModel(val Paises: List<PaisModel>)

data class PaisModel(
    val idPais: String,
    val Pais: String
)