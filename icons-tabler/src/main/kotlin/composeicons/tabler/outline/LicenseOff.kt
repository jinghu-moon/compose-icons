package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LicenseOff: ImageVector
    get() {
        if (_licenseOff != null) return _licenseOff!!
        _licenseOff = tablerOutlineIcon(
            name = "LicenseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 21h-9C4.343 21 3 19.657 3 18v-1h10v2c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2M17 13v-8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2M19 3h-11c-.293-0-.584 .042-.864 .126M5.122 5.151C5.041 5.427 5 5.713 5 6v11")
            addPathData("M11 7h2")
            addPathData("M9 11h2")
            addPathData("M3 3 21 21")
        }
        return _licenseOff!!
    }

private var _licenseOff: ImageVector? = null
