/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._849;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Sjaak Derksen
 */
@Mapper
public interface Issue849Mapper {

    Issue849Mapper INSTANCE = Mappers.getMapper( Issue849Mapper.class );

    @Mapping(source = "sourceList", target = "targetList")
    Target mapSourceToTarget(Source source);

}
