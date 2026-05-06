package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapDown: ImageVector
    get() {
        if (_mapDown != null) return _mapDown!!
        _mapDown = tablerOutlineIcon(
            name = "MapDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18.5 9 17 3 20v-13L9 4l6 3L21 4v8.5")
            addPathData("M9 4v13")
            addPathData("M15 7v8")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _mapDown!!
    }

private var _mapDown: ImageVector? = null
