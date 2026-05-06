package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VaccineBottleOff: ImageVector
    get() {
        if (_vaccineBottleOff != null) return _vaccineBottleOff!!
        _vaccineBottleOff = tablerOutlineIcon(
            name = "VaccineBottleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5v-1C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-4")
            addPathData("M8.7 8.705c-.066 .019-.133 .034-.2 .045C7.634 8.894 7 9.643 7 10.52v8.48c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-2M17 13v-2.48C17 9.643 16.366 8.894 15.5 8.75 14.635 8.606 14 7.857 14 6.98v-.98")
            addPathData("M7 12h5M16 12h1")
            addPathData("M7 18h10")
            addPathData("M11 15h2")
            addPathData("M3 3 21 21")
        }
        return _vaccineBottleOff!!
    }

private var _vaccineBottleOff: ImageVector? = null
