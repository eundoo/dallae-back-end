package com.shop.dallae.service;

import com.shop.dallae.dto.CmmCdDTO;
import com.shop.dallae.entity.CmmCdEntity;
import com.shop.dallae.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    //controller -> service -> repository -> DB
    public void save(CmmCdDTO cmmCdDTO) {
        CmmCdEntity cmmCdEntity = CmmCdEntity.toSaveEntity(cmmCdDTO);
        boardRepository.save(cmmCdEntity);
    }

    public List<CmmCdDTO> findAll() {
        List<CmmCdEntity> cmmCdEntityList = boardRepository.findAll();
        List<CmmCdDTO> cmmCdDTOList = new ArrayList<>();

    // for문돌려서

        return cmmCdDTOList;
    }
}
