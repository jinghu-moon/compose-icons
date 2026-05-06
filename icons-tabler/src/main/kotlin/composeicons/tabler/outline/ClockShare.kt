package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockShare: ImageVector
    get() {
        if (_clockShare != null) return _clockShare!!
        _clockShare = tablerOutlineIcon(
            name = "ClockShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.943 13.016C21.365 9.304 19.45 5.718 16.131 4.004 12.812 2.289 8.779 2.804 5.996 5.296 3.214 7.788 2.26 11.74 3.599 15.227c1.339 3.487 4.694 5.784 8.429 5.773")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
            addPathData("M12 7v5l2 2")
        }
        return _clockShare!!
    }

private var _clockShare: ImageVector? = null
