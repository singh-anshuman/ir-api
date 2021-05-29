package com.anshuman.irapi.instrument.repository;

import com.anshuman.irapi.instrument.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument,Long> {
}
