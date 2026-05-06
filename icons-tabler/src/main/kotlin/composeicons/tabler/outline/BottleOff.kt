package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BottleOff: ImageVector
    get() {
        if (_bottleOff != null) return _bottleOff!!
        _bottleOff = tablerOutlineIcon(
            name = "BottleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5h4v-2C14 2.448 13.552 2 13 2h-2c-.552 0-1 .448-1 1v2")
            addPathData("M14 3.5c0 1.626 .507 3.212 1.45 4.537l.05 .07c.976 1.371 1.5 3.011 1.5 4.694v.199M17 17v2c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-6.2C7 11.208 7.47 9.652 8.35 8.326M9.686 5.696C9.894 4.983 10 4.243 10 3.5")
            addPathData("M7 14.803c.4-.172 .746-.45 1-.803 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .295 .006 .589-.042 .866-.142")
            addPathData("M3 3 21 21")
        }
        return _bottleOff!!
    }

private var _bottleOff: ImageVector? = null
