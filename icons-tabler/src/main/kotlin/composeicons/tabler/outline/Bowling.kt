package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bowling: ImageVector
    get() {
        if (_bowling != null) return _bowling!!
        _bowling = tablerOutlineIcon(
            name = "Bowling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 11v.01")
            addPathData("M11 10v.01")
            addPathData("M10 14v.01")
            addPathData("M11.059 6.07C7.935 5.653 4.857 7.109 3.199 9.789c-1.659 2.68-1.59 6.084 .176 8.694 1.766 2.61 4.9 3.941 8.005 3.397")
            addPathData("M15.969 9h4")
            addPathData("M14.969 5c0 1.5 1 2 1 4 0 2.5-2 4.5-2 7 0 2.6 1.9 6 1.9 6h4.1c0 0 2-3.4 2-6 0-2.5-2-4.5-2-7 0-2 1-2.5 1-4 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _bowling!!
    }

private var _bowling: ImageVector? = null
