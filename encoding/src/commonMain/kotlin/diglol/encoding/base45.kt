package diglol.encoding

expect fun ByteArray.encodeBase45(): ByteArray
expect fun ByteArray.decodeBase45(): ByteArray?

expect fun ByteArray.encodeBase45ToString(): String
expect fun ByteArray.decodeBase45ToString(): String?

