<?php

namespace HexletBasics\DefineFunctions\ReturnInstruction;

use function HexletBasics\Functions\parentFor;

// BEGIN
function getParentNamesTotalLength($child)
{
    return strlen(parentFor($child, 'mother') . parentFor($child, 'father'));
}
// END
