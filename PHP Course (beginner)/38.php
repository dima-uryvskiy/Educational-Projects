<?php

use function HexletBasics\Functions\parentFor;

// BEGIN
$mother = parentFor('Joffrey Baratheon');
$grandFather = parentFor($mother, 'father');

print_r($grandFather);
// END
