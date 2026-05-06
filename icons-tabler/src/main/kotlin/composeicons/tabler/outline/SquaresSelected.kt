package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquaresSelected: ImageVector
    get() {
        if (_squaresSelected != null) return _squaresSelected!!
        _squaresSelected = tablerOutlineIcon(
            name = "SquaresSelected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 10C8 8.895 8.895 8 10 8h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8C8.895 20 8 19.105 8 18v-8")
            addPathData("M8 14.5 14.492 8.008")
            addPathData("M13.496 20 20 13.496 13.496 20")
            addPathData("M8.586 19.414 19.413 8.587")
            addPathData("M16 8v-2C16 4.895 15.105 4 14 4h-8C4.895 4 4 4.895 4 6v8c0 1.105 .895 2 2 2h2")
        }
        return _squaresSelected!!
    }

private var _squaresSelected: ImageVector? = null
