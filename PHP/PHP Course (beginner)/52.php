<?php

namespace HexletBasics\Logic\LogicalNegation;

use function HexletBasics\Functions\isLannisterSoldier;

// BEGIN
function isNotLannisterSoldier($colorArmor, $shield)
{
     return !(($colorArmor == 'red' && $shield == null) || $shield == 'lion');
}
// END
