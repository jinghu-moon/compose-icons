package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CaptureOff: ImageVector
    get() {
        if (_captureOff != null) return _captureOff!!
        _captureOff = tablerOutlineIcon(
            name = "CaptureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c.554 0 1.055-.225 1.417-.589")
            addPathData("M9.87 9.887c-1.153 1.178-1.14 3.065 .028 4.226 1.169 1.162 3.056 1.163 4.227 .004M14.705 10.701c-.295-.612-.788-1.107-1.4-1.403")
            addPathData("M4 8v-2C4 5.452 4.22 4.956 4.577 4.595")
            addPathData("M3 3 21 21")
        }
        return _captureOff!!
    }

private var _captureOff: ImageVector? = null
