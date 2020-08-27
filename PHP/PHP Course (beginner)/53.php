<?php

namespace HexletBasics\Logic\LogicalOperators2;

// BEGIN
function isNeutralSoldier($armor, $shield)
{
    return $armor != 'red' && $shield == 'black';
}
// END
