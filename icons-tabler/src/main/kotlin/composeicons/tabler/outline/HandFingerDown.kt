package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerDown: ImageVector
    get() {
        if (_handFingerDown != null) return _handFingerDown!!
        _handFingerDown = tablerOutlineIcon(
            name = "HandFingerDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12v8.5C8 21.328 8.672 22 9.5 22 10.328 22 11 21.328 11 20.5v-7.5")
            addPathData("M11 13.5v2c0 .828 .672 1.5 1.5 1.5C13.328 17 14 16.328 14 15.5v-2.5")
            addPathData("M14 14.5c0 .828 .672 1.5 1.5 1.5C16.328 16 17 15.328 17 14.5v-1.5")
            addPathData("M17 13.5c0 .828 .672 1.5 1.5 1.5C19.328 15 20 14.328 20 13.5v-4.5C20 5.686 17.314 3 14 3h-2 .208C10.19 3 8.306 4.014 7.196 5.7L7 6q-.468 .718-3.286 5.728c-.398 .708-.161 1.604 .536 2.022 .734 .44 1.674 .325 2.28-.28L8 12")
        }
        return _handFingerDown!!
    }

private var _handFingerDown: ImageVector? = null
