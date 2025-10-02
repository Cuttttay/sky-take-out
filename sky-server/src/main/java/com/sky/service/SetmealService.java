package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;


public interface SetmealService {

    /**
     * 新增套餐同时需要保存套餐和菜品的关联关系
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * 套餐的分页查询
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 批量删除套餐
     * @param ids
     */
    void deleBatch(List<Long> ids);


    /**
     * 根据id查询和菜品相关联的菜品数据
     * @param id
     * @return
     */
    SetmealVO getByIdWithDish(Long id);

    /**
     * 修改套餐菜品
     * @param setmealDTO
     */
    void update(SetmealDTO setmealDTO);

    /**
     *
     * @param status
     */
    void startOrStop(Integer status,Long id);

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);
}
