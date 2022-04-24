package com.charaf.patientsmvc.repositories;

import com.charaf.patientsmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;



public interface PatientRepository extends JpaRepositoryImplementation<Patient,Long> {
    Page<Patient> findByNomContains(String kw, Pageable pageable);
}
