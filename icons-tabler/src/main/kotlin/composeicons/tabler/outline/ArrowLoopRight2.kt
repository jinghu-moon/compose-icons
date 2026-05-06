package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLoopRight2: ImageVector
    get() {
        if (_arrowLoopRight2 != null) return _arrowLoopRight2!!
        _arrowLoopRight2 = tablerOutlineIcon(
            name = "ArrowLoopRight2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-6M12 9v-1C12 5.791 10.209 4 8 4 5.791 4 4 5.791 4 8c0 2.209 1.791 4 4 4h13")
            addPathData("M17 16l4-4L17 8")
        }
        return _arrowLoopRight2!!
    }

private var _arrowLoopRight2: ImageVector? = null
