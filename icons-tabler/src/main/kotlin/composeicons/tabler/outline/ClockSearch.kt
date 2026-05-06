package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockSearch: ImageVector
    get() {
        if (_clockSearch != null) return _clockSearch!!
        _clockSearch = tablerOutlineIcon(
            name = "ClockSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.993 11.646C20.801 6.767 16.754 2.932 11.872 3.001 6.99 3.07 3.054 7.019 3.001 11.901c-.054 4.882 3.795 8.917 8.674 9.093")
            addPathData("M12 7v5l1 1")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _clockSearch!!
    }

private var _clockSearch: ImageVector? = null
