package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Empathize: ImageVector
    get() {
        if (_empathize != null) return _empathize!!
        _empathize = tablerOutlineIcon(
            name = "Empathize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 5.5C9.5 6.881 10.619 8 12 8c1.381 0 2.5-1.119 2.5-2.5C14.5 4.119 13.381 3 12 3 10.619 3 9.5 4.119 9.5 5.5")
            addPathData("M12 21.368l5.095-5.096c.789-.778 1.1-1.92 .815-2.99-.284-1.071-1.121-1.907-2.192-2.192-1.071-.284-2.212 .027-2.99 .815L12 12.632l-.728-.727c-.778-.789-1.92-1.1-2.99-.815-1.071 .284-1.907 1.121-2.192 2.192-.284 1.071 .027 2.212 .815 2.99L12 21.368")
        }
        return _empathize!!
    }

private var _empathize: ImageVector? = null
