package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraAi: ImageVector
    get() {
        if (_cameraAi != null) return _cameraAi!!
        _cameraAi = tablerOutlineIcon(
            name = "CameraAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20h-5C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v2")
            addPathData("M14.362 11.15c-.721-.92-1.91-1.338-3.048-1.071-1.138 .268-2.017 1.172-2.252 2.317-.235 1.145 .216 2.323 1.157 3.017")
            addPathData("M14 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 19h4")
            addPathData("M21 15v6")
        }
        return _cameraAi!!
    }

private var _cameraAi: ImageVector? = null
