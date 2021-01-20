package ${package.Controller};


import org.springframework.web.bind.annotation.RequestMapping;
<#if restControllerStyle>
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>
import ${package.Service}.${table.serviceName};
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.resume.utils.json.JSONResult;
import org.springframework.web.bind.annotation.*;
import ${package.Entity}.${entity};

/**
* @author 康东伟
* @since ${date}
*/
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@RequestMapping("<#if package.ModuleName??>/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle??>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    private final ${table.serviceName} service;

    public ${table.controllerName}(${table.serviceName} service) {
    this.service = service;
    }

    @PostMapping
    public JSONResult add(${entity} dto){
        service.add${entity}(dto);
        return JSONResult.ok("添加完成");
    }

    @PutMapping
    public JSONResult update(${entity} dto){
        service.update${entity}(dto);
        return JSONResult.ok("修改完成");
    }

    @DeleteMapping
    public JSONResult delete(${entity} dto){
        service.delete${entity}(dto);
        return JSONResult.ok("删除完成");
    }

    @GetMapping
    public JSONResult get${entity}ByCondition(){
        return JSONResult.ok(service.list(new QueryWrapper<${entity}>()));
    }

    @GetMapping("/{page}/{size}")
    public JSONResult page(@PathVariable int page, @PathVariable int size){
        return JSONResult.ok(service.page(new Page<>(page,size),new QueryWrapper<${entity}>()));
    }
}
</#if>
