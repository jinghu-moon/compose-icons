package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeglassOff: ImageVector
    get() {
        if (_eyeglassOff != null) return _eyeglassOff!!
        _eyeglassOff = tablerOutlineIcon(
            name = "EyeglassOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.536 5.546 3 14")
            addPathData("M16 4h2l3 10")
            addPathData("M10 16h4")
            addPathData("M19.426 19.423c-1.075 .709-2.452 .77-3.586 .159C14.707 18.971 14 17.788 14 16.5v-2.5M18 14h3v2.5c0 .157-.01 .312-.03 .463")
            addPathData("M10 16.5C10 18.433 8.433 20 6.5 20 4.567 20 3 18.433 3 16.5v-2.5h7v2.5")
            addPathData("M3 3 21 21")
        }
        return _eyeglassOff!!
    }

private var _eyeglassOff: ImageVector? = null
