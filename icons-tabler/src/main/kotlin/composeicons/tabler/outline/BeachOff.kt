package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BeachOff: ImageVector
    get() {
        if (_beachOff != null) return _beachOff!!
        _beachOff = tablerOutlineIcon(
            name = "BeachOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.071 15.102C12.278 13.969 9.078 14.619 6.947 16.75")
            addPathData("M10.27 6.269 20.196 12C21.86 9.152 20.913 5.496 18.077 3.813 15.241 2.13 11.578 3.052 9.876 5.877")
            addPathData("M16.732 10C18.39 7.13 18.957 4.356 18 3.804 17.043 3.252 14.925 5.13 13.268 8")
            addPathData("M15 9l-.739 1.279")
            addPathData("M12.794 12.82 12 14.196")
            addPathData("M3 19.25c.311-.155 .652-.24 1-.25 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .283-.394 .679-.693 1.135-.858")
            addPathData("M3 3 21 21")
        }
        return _beachOff!!
    }

private var _beachOff: ImageVector? = null
