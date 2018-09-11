package com.thefallenbrain.stayfithub.services.repository;

import com.thefallenbrain.stayfithub.services.domain.FrontdeskAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FrontdeskAdminRepository extends JpaRepository<FrontdeskAdmin, Integer>{
    Optional<FrontdeskAdmin> findById(Integer id);

    List<FrontdeskAdmin> findFrontdeskAdminsByFitnessCenterId(Integer id);

    void deleteById(Integer id);
}
