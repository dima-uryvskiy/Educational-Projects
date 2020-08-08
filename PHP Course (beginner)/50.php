<?php

namespace HexletBasics\Logic\CombineExpressions;

// BEGIN
function hasTargaryenReference($str)
{
    return substr($str, 0, strlen('Targaryen')) == 'Targaryen';
}
// END
