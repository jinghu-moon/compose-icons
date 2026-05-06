package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerRight: ImageVector
    get() {
        if (_handFingerRight != null) return _handFingerRight!!
        _handFingerRight = tablerOutlineIcon(
            name = "HandFingerRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h8.5C21.328 8 22 8.672 22 9.5 22 10.328 21.328 11 20.5 11h-7.5")
            addPathData("M13.5 11h2c.828 0 1.5 .672 1.5 1.5C17 13.328 16.328 14 15.5 14h-2.5")
            addPathData("M14.5 14c.828 0 1.5 .672 1.5 1.5C16 16.328 15.328 17 14.5 17h-1.5")
            addPathData("M13.5 17c.828 0 1.5 .672 1.5 1.5C15 19.328 14.328 20 13.5 20h-4.5C5.686 20 3 17.314 3 14v-2 .208C3 10.19 4.014 8.306 5.7 7.196L6 7q.718-.468 5.728-3.286c.708-.398 1.604-.161 2.022 .536 .44 .734 .325 1.674-.28 2.28L12 8")
        }
        return _handFingerRight!!
    }

private var _handFingerRight: ImageVector? = null
