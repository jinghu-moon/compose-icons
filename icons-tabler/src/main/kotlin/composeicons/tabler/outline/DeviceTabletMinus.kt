package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletMinus: ImageVector
    get() {
        if (_deviceTabletMinus != null) return _deviceTabletMinus!!
        _deviceTabletMinus = tablerOutlineIcon(
            name = "DeviceTabletMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21h-6.5C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v11")
            addPathData("M12.872 16.51c-.238-.424-.748-.615-1.206-.452-.459 .163-.733 .632-.651 1.112 .083 .48 .499 .83 .985 .83")
            addPathData("M16 19h6")
        }
        return _deviceTabletMinus!!
    }

private var _deviceTabletMinus: ImageVector? = null
