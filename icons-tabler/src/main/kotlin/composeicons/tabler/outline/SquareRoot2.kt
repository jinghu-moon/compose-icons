package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoot2: ImageVector
    get() {
        if (_squareRoot2 != null) return _squareRoot2!!
        _squareRoot2 = tablerOutlineIcon(
            name = "SquareRoot2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12h1c1 0 1 1 2.016 3.527C17 18 17 19 18 19h1")
            addPathData("M12 19c1.5 0 3-2 4-3.5C17 14 18.5 12 20 12")
            addPathData("M3 12h1l3 8L10 4h10")
        }
        return _squareRoot2!!
    }

private var _squareRoot2: ImageVector? = null
