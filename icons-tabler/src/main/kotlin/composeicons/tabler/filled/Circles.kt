package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circles: ImageVector
    get() {
        if (_circles != null) return _circles!!
        _circles = tablerFilledIcon(
            name = "Circles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 12c2.733-0 4.96 2.194 5 4.927 .04 2.733-2.123 4.991-4.855 5.07C3.913 22.077 1.624 19.948 1.505 17.217L1.5 17l.005-.217C1.621 14.109 3.823 12 6.5 12Z")
            addPathData("M17.5 12c2.733-0 4.96 2.194 5 4.927 .04 2.733-2.123 4.991-4.855 5.07-2.732 .079-5.021-2.05-5.14-4.781L12.5 17l.005-.217c.116-2.674 2.318-4.783 4.995-4.783Z")
            addPathData("M12 2c2.733-0 4.96 2.194 5 4.927 .04 2.733-2.123 4.991-4.855 5.07C9.413 12.077 7.124 9.948 7.005 7.217L7 7l.005-.217C7.121 4.109 9.323 2 12 2Z")
        }
        return _circles!!
    }

private var _circles: ImageVector? = null
