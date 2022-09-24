package com.sp.api1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity,Integer> {

	@Query("select h.hobby from HobbyEntity h where h.personId=:personId")
	public String findByPersonId(int personId);
}
