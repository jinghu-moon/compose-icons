package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockExclamation: ImageVector
    get() {
        if (_clockExclamation != null) return _clockExclamation!!
        _clockExclamation = tablerOutlineIcon(
            name = "ClockExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.986 12.502C21.207 8.54 18.807 4.901 15.078 3.544 11.35 2.187 7.172 3.432 4.795 6.608 2.417 9.785 2.4 14.144 4.753 17.339c2.353 3.195 6.521 4.472 10.26 3.143")
            addPathData("M12 7v5l3 3")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _clockExclamation!!
    }

private var _clockExclamation: ImageVector? = null
