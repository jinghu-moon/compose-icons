package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedPlus2: ImageVector
    get() {
        if (_squareRoundedPlus2 != null) return _squareRoundedPlus2!!
        _squareRoundedPlus2 = tablerOutlineIcon(
            name = "SquareRoundedPlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.54 20.996C12.364 21 12.184 21 12 21 4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3c7.2 0 9 1.8 9 9 0 .185-.001 .366-.004 .544")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _squareRoundedPlus2!!
    }

private var _squareRoundedPlus2: ImageVector? = null
