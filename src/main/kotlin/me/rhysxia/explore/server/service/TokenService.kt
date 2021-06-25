package me.rhysxia.explore.server.service

import me.rhysxia.explore.server.dto.AuthUser

interface TokenService {
    suspend fun findAuthUserByToken(token: String): AuthUser?
}