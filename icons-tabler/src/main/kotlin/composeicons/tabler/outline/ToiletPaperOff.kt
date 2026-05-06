package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToiletPaperOff: ImageVector
    get() {
        if (_toiletPaperOff != null) return _toiletPaperOff!!
        _toiletPaperOff = tablerOutlineIcon(
            name = "ToiletPaperOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.27 4.28C3.502 5.55 3 7.639 3 10c0 3.866 1.343 7 3 7 1.657 0 3-3.134 3-7C9 9.66 8.99 9.328 8.97 9")
            addPathData("M21 10C21 6.134 19.657 3 18 3")
            addPathData("M7 3h11")
            addPathData("M21 10v7M19.487 19.496 18 19l-3 2L12 18 9 20v-10")
            addPathData("M6 10h.01")
            addPathData("M3 3 21 21")
        }
        return _toiletPaperOff!!
    }

private var _toiletPaperOff: ImageVector? = null
