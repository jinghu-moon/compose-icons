package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockCode: ImageVector
    get() {
        if (_clockCode != null) return _clockCode!!
        _clockCode = tablerOutlineIcon(
            name = "ClockCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.931 13.111C21.387 9.445 19.557 5.873 16.315 4.102 13.073 2.331 9.078 2.721 6.24 5.085 3.401 7.449 2.296 11.308 3.452 14.816c1.156 3.509 4.338 5.955 8.026 6.169")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
            addPathData("M12 7v5l2 2")
        }
        return _clockCode!!
    }

private var _clockCode: ImageVector? = null
