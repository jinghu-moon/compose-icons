package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletCode: ImageVector
    get() {
        if (_deviceTabletCode != null) return _deviceTabletCode!!
        _deviceTabletCode = tablerOutlineIcon(
            name = "DeviceTabletCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-5.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v9")
            addPathData("M12.344 16.06c-.436-.16-.925 .001-1.18 .389-.255 .388-.21 .901 .11 1.238")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _deviceTabletCode!!
    }

private var _deviceTabletCode: ImageVector? = null
