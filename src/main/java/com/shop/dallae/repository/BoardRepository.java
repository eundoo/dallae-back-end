package com.shop.dallae.repository;

import com.shop.dallae.entity.CmmCdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<CmmCdEntity, Long> {
    //Repository는 일반적으로 entity만 받는다.
    //DTO -> Entity / Entity -> DTO
    //Entity는 DB와 직접적인 연결이 있기 때문에 view 단에 노출시키지말아라
}
