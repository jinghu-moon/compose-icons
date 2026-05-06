package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletUp: ImageVector
    get() {
        if (_deviceTabletUp != null) return _deviceTabletUp!!
        _deviceTabletUp = tablerOutlineIcon(
            name = "DeviceTabletUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v8")
            addPathData("M12.906 16.576c-.21-.449-.718-.676-1.193-.534-.475 .143-.774 .612-.702 1.103 .072 .491 .493 .855 .989 .855")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _deviceTabletUp!!
    }

private var _deviceTabletUp: ImageVector? = null
