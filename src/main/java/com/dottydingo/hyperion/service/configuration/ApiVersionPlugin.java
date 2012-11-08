package com.dottydingo.hyperion.service.configuration;

import com.dottydingo.hyperion.api.ApiObject;
import com.dottydingo.hyperion.service.model.PersistentObject;
import com.dottydingo.hyperion.service.translation.Translator;
import com.dottydingo.hyperion.service.validation.DefaultValidator;
import com.dottydingo.hyperion.service.validation.Validator;

/**
 */
public class ApiVersionPlugin<C extends ApiObject,P extends PersistentObject>
{
    private Integer version;
    private Translator<C,P> translator;
    private Validator<C,P> validator = new DefaultValidator<C, P>();
    private Class<C> apiClass;

    public ApiVersionPlugin()
    {
    }

    public ApiVersionPlugin(Integer version, Translator<C, P> translator, Validator<C, P> validator, Class<C> apiClass)
    {
        this.version = version;
        this.translator = translator;
        this.validator = validator;
        this.apiClass = apiClass;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Translator<C,P> getTranslator()
    {
        return translator;
    }

    public void setTranslator(Translator<C,P> translator)
    {
        this.translator = translator;
    }

    public Validator<C,P> getValidator()
    {
        return validator;
    }

    public void setValidator(Validator<C,P> validator)
    {
        this.validator = validator;
    }

    public Class<C> getApiClass()
    {
        return apiClass;
    }

    public void setApiClass(Class<C> apiClass)
    {
        this.apiClass = apiClass;
    }
}
