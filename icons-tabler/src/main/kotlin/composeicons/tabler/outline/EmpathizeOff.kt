package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EmpathizeOff: ImageVector
    get() {
        if (_empathizeOff != null) return _empathizeOff!!
        _empathizeOff = tablerOutlineIcon(
            name = "EmpathizeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8c1.381 0 2.5-1.119 2.5-2.5C14.5 4.119 13.381 3 12 3 10.619 3 9.5 4.119 9.5 5.5")
            addPathData("M12.317 12.315 12 12.632l-.728-.727c-.778-.789-1.92-1.1-2.99-.815-1.071 .284-1.907 1.121-2.192 2.192-.284 1.071 .027 2.212 .815 2.99L12 21.368l4.689-4.69M18.013 14.005c-.037-1.653-1.368-2.983-3.021-3.018")
            addPathData("M3 3 21 21")
        }
        return _empathizeOff!!
    }

private var _empathizeOff: ImageVector? = null
