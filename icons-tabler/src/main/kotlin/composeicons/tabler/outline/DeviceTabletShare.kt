package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletShare: ImageVector
    get() {
        if (_deviceTabletShare != null) return _deviceTabletShare!!
        _deviceTabletShare = tablerOutlineIcon(
            name = "DeviceTabletShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-6C5.448 21 5 20.552 5 20v-16C5 3.448 5.448 3 6 3h12c.552 0 1 .448 1 1v9")
            addPathData("M12.57 16.178c-.418-.289-.987-.219-1.322 .164-.335 .383-.329 .956 .013 1.332 .342 .376 .912 .435 1.325 .138")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _deviceTabletShare!!
    }

private var _deviceTabletShare: ImageVector? = null
