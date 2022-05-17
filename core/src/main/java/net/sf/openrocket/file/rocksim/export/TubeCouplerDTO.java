package net.sf.openrocket.file.rocksim.export;

// thZero

import net.sf.openrocket.file.rocksim.RocksimCommonConstants;
import net.sf.openrocket.rocketcomponent.TubeCoupler;

// thZero - Begin
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
// thZero - End

/**
 * Conversion DTO for a TubeCoupler.  TubeCoupler's are represented as Rings in Rocksim.
 */
@XmlRootElement(name = RocksimCommonConstants.RING)
@XmlAccessorType(XmlAccessType.FIELD)
public class TubeCouplerDTO extends CenteringRingDTO {

    /**
     * Constructor.
     *
     * @param tc an OR TubeCoupler
     */
    public TubeCouplerDTO(TubeCoupler tc) {
        super(tc);
        setUsageCode(UsageCode.TubeCoupler);
    }
}
