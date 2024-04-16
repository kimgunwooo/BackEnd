package com.example.demo.board.service;

import java.util.List;
import com.example.demo.board.repository.BoardDTO;

public interface BoardService {

    public List<BoardDTO> boardList();
    public Integer boardInsert(BoardDTO dto);
    public BoardDTO getContent(Integer id);


    public Integer boardUpdate(Integer id);
    public Integer boardDelete(Integer id);
}
