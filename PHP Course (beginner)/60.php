<?php

namespace HexletBasics\Conditionals\Elvis;

// BEGIN
function generateAmount($count, $price)
{

    return $count ?: $price * 3;
}
// END
