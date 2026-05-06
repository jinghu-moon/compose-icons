package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockUp: ImageVector
    get() {
        if (_clockUp != null) return _clockUp!!
        _clockUp = tablerOutlineIcon(
            name = "ClockUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.983 12.548C21.211 8.816 19.107 5.332 15.699 3.795 12.291 2.258 8.287 2.989 5.641 5.631 2.995 8.272 2.258 12.275 3.789 15.686c1.531 3.411 5.012 5.52 8.744 5.298")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
            addPathData("M12 7v5l2.5 2.5")
        }
        return _clockUp!!
    }

private var _clockUp: ImageVector? = null
