package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = tablerFilledIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.926 7.074c.687 .688 1.074 1.621 1.074 2.593v8.666C22 20.358 20.358 22 18.333 22h-8.666C7.642 22 6 20.358 6 18.333v-8.666q0-.053 .005-.102C6.057 7.58 7.681 5.998 9.667 6h8.666c.973 0 1.905 .386 2.593 1.074")
            addPathData("M17.374 3.514c.268 .483 .095 1.092-.388 1.36-.483 .268-1.092 .095-1.36-.388C15.405 4.088 15.284 4 15 4h-10C4.452 4 4 4.452 4 5v9.998c0 .36 .194 .692 .507 .87 .48 .273 .647 .884 .374 1.364-.273 .48-.884 .647-1.364 .374C2.58 17.073 2.001 16.078 2 15v-10C2 3.348 3.348 2 5 2h10c1.094 0 1.828 .533 2.374 1.514")
        }
        return _copy!!
    }

private var _copy: ImageVector? = null
