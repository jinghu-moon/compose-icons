package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = tablerOutlineIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6C4.514 8.099 3.604 11.528 4.722 14.583c1.118 3.056 4.025 5.088 7.278 5.088 3.254 0 6.161-2.032 7.278-5.088C20.396 11.528 19.486 8.099 17 6")
            addPathData("M12 4v8")
        }
        return _power!!
    }

private var _power: ImageVector? = null
