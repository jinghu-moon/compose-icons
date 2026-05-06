package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockRecord: ImageVector
    get() {
        if (_clockRecord != null) return _clockRecord!!
        _clockRecord = tablerOutlineIcon(
            name = "ClockRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12.3C21.123 8.606 18.976 5.212 15.585 3.742 12.194 2.272 8.249 3.024 5.637 5.639 3.025 8.255 2.278 12.201 3.752 15.59c1.474 3.389 4.871 5.532 8.565 5.404")
            addPathData("M12 7v5l2 2")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _clockRecord!!
    }

private var _clockRecord: ImageVector? = null
