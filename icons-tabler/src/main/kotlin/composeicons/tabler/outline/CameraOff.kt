package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) return _cameraOff!!
        _cameraOff = tablerOutlineIcon(
            name = "CameraOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.297 4.289C8.484 4.104 8.737 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v8M19.813 19.828C19.564 19.938 19.289 20 19 20h-14C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1c.298 0 .58-.065 .834-.181")
            addPathData("M10.422 10.448c-1.057 .655-1.6 1.893-1.366 3.114 .234 1.221 1.196 2.171 2.42 2.389 1.224 .218 2.455-.341 3.097-1.406")
            addPathData("M3 3 21 21")
        }
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
