package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubbleTea: ImageVector
    get() {
        if (_bubbleTea != null) return _bubbleTea!!
        _bubbleTea = tablerOutlineIcon(
            name = "BubbleTea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.95 9l-1.478 8.69c-.25 1.463-.374 2.195-.936 2.631-1.2 .931-6.039 .88-7.172 0-.562-.436-.687-1.168-.936-2.632L5.95 9")
            addPathData("M6 9 6.514 7.714C7.411 5.47 9.584 3.999 12 3.999c2.416 0 4.589 1.471 5.486 3.715L18 9")
            addPathData("M5 9h14")
            addPathData("M12 9 16 2")
            addPathData("M10.01 14h.01")
            addPathData("M11.02 18h.01")
            addPathData("M13.02 16h.01")
        }
        return _bubbleTea!!
    }

private var _bubbleTea: ImageVector? = null
