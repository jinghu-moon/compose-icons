package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxMultiple: ImageVector
    get() {
        if (_boxMultiple != null) return _boxMultiple!!
        _boxMultiple = tablerFilledIcon(
            name = "BoxMultiple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5.667C6 3.642 7.642 2 9.667 2h8.666C20.358 2 22 3.642 22 5.667v8.666C22 16.358 20.358 18 18.333 18h-8.666C7.642 18 6 16.358 6 14.333Z")
            addPathData("M2 9C2 7.906 2.533 7.172 3.514 6.626c.483-.268 1.092-.095 1.36 .388 .268 .483 .095 1.092-.388 1.36C4.088 8.595 4 8.716 4 9v10c0 .548 .452 1 1 1h9.998c.32 0 .618-.154 .805-.407l.065-.1c.273-.48 .884-.647 1.364-.374 .48 .273 .647 .884 .374 1.364C17.073 21.42 16.078 21.999 15 22h-10C3.348 22 2 20.652 2 19Z")
        }
        return _boxMultiple!!
    }

private var _boxMultiple: ImageVector? = null
