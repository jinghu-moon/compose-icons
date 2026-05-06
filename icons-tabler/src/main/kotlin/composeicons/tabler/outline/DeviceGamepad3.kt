package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad3: ImageVector
    get() {
        if (_deviceGamepad3 != null) return _deviceGamepad3!!
        _deviceGamepad3 = tablerOutlineIcon(
            name = "DeviceGamepad3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12 6 9h-2C3.448 9 3 9.448 3 10v4c0 .552 .448 1 1 1h2L9 12")
            addPathData("M15 12 18 9h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2L15 12")
            addPathData("M12 15 9 18v2c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1v-2L12 15")
            addPathData("M12 9 9 6v-2C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v2L12 9")
        }
        return _deviceGamepad3!!
    }

private var _deviceGamepad3: ImageVector? = null
