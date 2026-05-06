package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = tablerOutlineIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-14C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7")
            addPathData("M11.245 15.904c.899 .234 1.856 .038 2.59-.53C14.57 14.805 15 13.929 15 13M12.75 10.095c-.898-.232-1.854-.035-2.587 .533C9.429 11.196 9 12.072 9 13")
            addPathData("M14 13h2v2")
            addPathData("M10 13h-2v-2")
        }
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
