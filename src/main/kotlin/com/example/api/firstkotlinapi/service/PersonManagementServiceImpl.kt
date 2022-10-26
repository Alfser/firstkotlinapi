package com.example.api.firstkotlinapi.service

import com.example.api.firstkotlinapi.DAO.PersonDAO
import com.example.api.firstkotlinapi.DTO.AddPersonRequest
import com.example.api.firstkotlinapi.DTO.PersonResponse
import com.example.api.firstkotlinapi.DTO.UpdatePersonRequest
import com.example.api.firstkotlinapi.domain.Person
import com.example.api.firstkotlinapi.transformer.AddPersonRequestTransformer
import com.example.api.firstkotlinapi.transformer.toPersonResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class PersonManagementServiceImpl(private val personDao: PersonDAO,
                                  private val addPersonRequestTransformer: AddPersonRequestTransformer) : PersonManagementService {
    override fun findById(id: Long): PersonResponse? = this.findPersonById(id).toPersonResponse()

    override fun findAll(): List<PersonResponse> = this.personDao.findAll().map { it.toPersonResponse() }

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
        return saveOrUpdate(
            addPersonRequestTransformer.transformer(addPersonRequest)
        )
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        val person = this.findPersonById(updatePersonRequest.id) ?: throw IllegalArgumentException(" Person with id = ${updatePersonRequest.id} not found")

        return this.saveOrUpdate(person.copy(name = updatePersonRequest.name, lastName = updatePersonRequest.lastName))
    }

    override fun deleteById(id: Long) = personDao.deleteById(id)

    private fun findPersonById(id: Long): Person? = this.personDao.findByIdOrNull(id)

    private fun saveOrUpdate(person: Person): PersonResponse = personDao.save(person).toPersonResponse()
}