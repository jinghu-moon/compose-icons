package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = tablerOutlineIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10c0 3.866 1.343 7 3 7 1.657 0 3-3.134 3-7C9 6.134 7.657 3 6 3 4.343 3 3 6.134 3 10")
            addPathData("M21 10C21 6.134 19.657 3 18 3")
            addPathData("M6 3h12")
            addPathData("M21 10v10L18 19l-3 2L12 18 9 20v-10")
            addPathData("M6 10h.01")
        }
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
