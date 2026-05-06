package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowCapsule: ImageVector
    get() {
        if (_arrowCapsule != null) return _arrowCapsule!!
        _arrowCapsule = tablerOutlineIcon(
            name = "ArrowCapsule",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 15c0 3.314-2.686 6-6 6C8.686 21 6 18.314 6 15v-6C6 5.686 8.686 3 12 3c3.314 0 6 2.686 6 6v2")
            addPathData("M15 8l3 3L21 8")
        }
        return _arrowCapsule!!
    }

private var _arrowCapsule: ImageVector? = null
