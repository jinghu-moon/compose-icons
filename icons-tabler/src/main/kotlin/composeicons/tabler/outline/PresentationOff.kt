package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PresentationOff: ImageVector
    get() {
        if (_presentationOff != null) return _presentationOff!!
        _presentationOff = tablerOutlineIcon(
            name = "PresentationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4h1M8 4h13")
            addPathData("M4 4v10c0 1.105 .895 2 2 2h10M19.42 15.408C19.779 15.046 20 14.549 20 14v-10")
            addPathData("M12 16v4")
            addPathData("M9 20h6")
            addPathData("M8 12l2-2M14 10 16 8")
            addPathData("M3 3 21 21")
        }
        return _presentationOff!!
    }

private var _presentationOff: ImageVector? = null
