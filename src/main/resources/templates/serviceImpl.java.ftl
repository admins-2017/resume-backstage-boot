package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
/**
* @author 康东伟
* @since ${date}
*/
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add${entity}(${entity} dto){
        save(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update${entity}(${entity} dto){
        update(new UpdateWrapper<${entity}>());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete${entity}(${entity} dto) {
        remove(new QueryWrapper<${entity}>());
    }
}
</#if>
