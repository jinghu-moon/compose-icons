package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LivePhoto: ImageVector
    get() {
        if (_livePhoto != null) return _livePhoto!!
        _livePhoto = tablerOutlineIcon(
            name = "LivePhoto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M15.9 20.11v.01")
            addPathData("M19.04 17.61v.01")
            addPathData("M20.77 14v.01")
            addPathData("M20.77 10v.01")
            addPathData("M19.04 6.39v.01")
            addPathData("M15.9 3.89v.01")
            addPathData("M12 3v.01")
            addPathData("M8.1 3.89v.01")
            addPathData("M4.96 6.39v.01")
            addPathData("M3.23 10v.01")
            addPathData("M3.23 14v.01")
            addPathData("M4.96 17.61v.01")
            addPathData("M8.1 20.11v.01")
            addPathData("M12 21v.01")
        }
        return _livePhoto!!
    }

private var _livePhoto: ImageVector? = null
