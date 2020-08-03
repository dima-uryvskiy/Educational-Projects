<?php

use function HexletBasics\Functions\calculateDistanceBetweenTowns;

$from = 'The Twins';
$to = 'The Eyrie';

// BEGIN
print_r(calculateDistanceBetweenTowns("{$from}-{$to}"));
// END
