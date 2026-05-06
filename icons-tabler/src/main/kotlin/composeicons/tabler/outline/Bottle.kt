package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bottle: ImageVector
    get() {
        if (_bottle != null) return _bottle!!
        _bottle = tablerOutlineIcon(
            name = "Bottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5h4v-2C14 2.448 13.552 2 13 2h-2c-.552 0-1 .448-1 1v2")
            addPathData("M14 3.5c0 1.626 .507 3.212 1.45 4.537l.05 .07c.976 1.371 1.5 3.011 1.5 4.694v6.199c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-6.2C7 11.118 7.524 9.478 8.5 8.107l.05-.07C9.493 6.712 10 5.126 10 3.5")
            addPathData("M7 14.803c.4-.172 .746-.45 1-.803 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .254-.354 .6-.632 1-.805")
        }
        return _bottle!!
    }

private var _bottle: ImageVector? = null
