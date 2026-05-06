package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraShare: ImageVector
    get() {
        if (_cameraShare != null) return _cameraShare!!
        _cameraShare = tablerOutlineIcon(
            name = "CameraShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 20h-7.5C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v4")
            addPathData("M14.98 13.347c.15-1.291-.548-2.532-1.729-3.073-1.181-.542-2.577-.261-3.457 .695-.88 .956-1.045 2.37-.408 3.503 .637 1.133 1.931 1.727 3.205 1.471")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _cameraShare!!
    }

private var _cameraShare: ImageVector? = null
