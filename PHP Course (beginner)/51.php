<?php

namespace HexletBasics\Logic\LogicalOperators;

// BEGIN
function isLannisterSoldier($colorArmor, $shield)
{
    return ($colorArmor == 'red' && $shield == null) || $shield == 'lion';
}
// END
