package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CongruentTo: ImageVector
    get() {
        if (_congruentTo != null) return _congruentTo!!
        _congruentTo = tablerOutlineIcon(
            name = "CongruentTo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13h14")
            addPathData("M5 17h14")
            addPathData("M5 7.686C7.333 5.062 9.667 5.83 12 7.75c2.333 1.92 4.667 2.688 7 .064")
        }
        return _congruentTo!!
    }

private var _congruentTo: ImageVector? = null
