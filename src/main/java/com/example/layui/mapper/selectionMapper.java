package com.example.layui.mapper;

import com.example.layui.entity.Selection;
import com.example.layui.vo.SelectionQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface selectionMapper {
    Long countSelectionList(SelectionQuery param) ;
    List<Selection> getSelectionList(SelectionQuery param) ;

    void deleteSelectionByIds(String ids);

    void updateSelection(Selection selection);

    Selection getSelectionById(Integer id);

    void addSelection(Selection selection);
}
