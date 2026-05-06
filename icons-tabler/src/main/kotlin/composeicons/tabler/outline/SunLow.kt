package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunLow: ImageVector
    get() {
        if (_sunLow != null) return _sunLow!!
        _sunLow = tablerOutlineIcon(
            name = "SunLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12")
            addPathData("M4 12h.01")
            addPathData("M12 4v.01")
            addPathData("M20 12h.01")
            addPathData("M12 20v.01")
            addPathData("M6.31 6.31 6.3 6.3")
            addPathData("M17.71 6.31l-.01-.01")
            addPathData("M17.7 17.7l.01 .01")
            addPathData("M6.3 17.7l.01 .01")
        }
        return _sunLow!!
    }

private var _sunLow: ImageVector? = null
