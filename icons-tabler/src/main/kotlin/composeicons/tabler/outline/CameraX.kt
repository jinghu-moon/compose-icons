package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraX: ImageVector
    get() {
        if (_cameraX != null) return _cameraX!!
        _cameraX = tablerOutlineIcon(
            name = "CameraX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 20h-8.5C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v4")
            addPathData("M9 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _cameraX!!
    }

private var _cameraX: ImageVector? = null
