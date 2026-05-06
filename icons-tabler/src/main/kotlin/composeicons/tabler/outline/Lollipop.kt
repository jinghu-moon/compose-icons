package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lollipop: ImageVector
    get() {
        if (_lollipop != null) return _lollipop!!
        _lollipop = tablerOutlineIcon(
            name = "Lollipop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C21 6.134 17.866 3 14 3 10.134 3 7 6.134 7 10")
            addPathData("M21 10C21 8.067 19.433 6.5 17.5 6.5 15.567 6.5 14 8.067 14 10")
            addPathData("M14 10c0 1.933-1.567 3.5-3.5 3.5C8.567 13.5 7 11.933 7 10")
            addPathData("M14 17c1.933 0 3.5-1.567 3.5-3.5C17.5 11.567 15.933 10 14 10")
            addPathData("M14 3C12.067 3 10.5 4.567 10.5 6.5 10.5 8.433 12.067 10 14 10")
            addPathData("M3 21 9 15")
        }
        return _lollipop!!
    }

private var _lollipop: ImageVector? = null
