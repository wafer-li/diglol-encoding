# Diglol Encoding

Diglol Encoding provides Hex/Base16, Base32, Base45, Base64 encodings for Kotlin Multiplatform.
Translations: [中文](README-zh.md)

Currently supported encodings:

- Hex(Base16)
- Base32 (Std, Hex)
- Base45
- Base64 (Std, Url)

### Releases

Our [change log](CHANGELOG.md) has release history.

```gradle
implementation("com.diglol.encoding:encoding:0.2.0")
```

### Usage

##### [Hex][rfc4648]

```kotlin
val data = "foobar".toByteArray()

val hex = data.encodeHex()
println(hex)
// 输出：666F6F626172
assert(data.contentEquals(hex.decodeHex()))
```

##### [Base32][rfc4648]

```kotlin
val data = "foobar".toByteArray()
val base32String = data.encodeBase32ToString()
println(base32String)
// 输出：MZXW6YTBOI======
assert(data.contentEquals(base32String.decodeBase32ToBytes()))

val base32HexString = data.encodeBase32HexToString()
println(base32HexString)
// 输出：CPNMUOJ1E8======
assert(data.contentEquals(base32HexString.decodeBase32HexToBytes()))
```

##### [Base45][rfc9285]

```kotlin
val data = "base-45".encodeToByteArray()
val base45String = data.encodeBase45ToString()
println(base45String)
// 输出：UJCLQE7W581
assert(data.contentEquals(base45String.decodeBase45ToBytes()))
```

##### [Base64][rfc4648]

```kotlin
val base64String = data.encodeBase64ToString()
println(base64String)
// 输出：Zm9vYmFy
assert(data.contentEquals(base64String.decodeBase64ToBytes()))

val base64UrlString = data.encodeBase64UrlToString()
println(base64UrlString)
// 输出：Zm9vYmFy
assert(data.contentEquals(base64UrlString.decodeBase64UrlToBytes()))
```

### License

    Copyright 2022 Diglol

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[rfc4648]: https://datatracker.ietf.org/doc/html/rfc4648
[rfc9285]: https://datatracker.ietf.org/doc/html/rfc9285
