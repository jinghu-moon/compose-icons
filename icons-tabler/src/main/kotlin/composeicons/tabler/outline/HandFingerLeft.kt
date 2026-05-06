package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandFingerLeft: ImageVector
    get() {
        if (_handFingerLeft != null) return _handFingerLeft!!
        _handFingerLeft = tablerOutlineIcon(
            name = "HandFingerLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h-8.5C2.672 8 2 8.672 2 9.5 2 10.328 2.672 11 3.5 11h7.5")
            addPathData("M10.5 11h-2C7.672 11 7 11.672 7 12.5 7 13.328 7.672 14 8.5 14h2.5")
            addPathData("M9.5 14C8.672 14 8 14.672 8 15.5 8 16.328 8.672 17 9.5 17h1.5")
            addPathData("M10.5 17C9.672 17 9 17.672 9 18.5 9 19.328 9.672 20 10.5 20h4.5c3.314 0 6-2.686 6-6v-2 .208C21 10.19 19.986 8.306 18.3 7.196L18 7Q17.282 6.532 12.272 3.714c-.708-.398-1.604-.161-2.022 .536-.439 .735-.324 1.674 .28 2.28L12 8")
        }
        return _handFingerLeft!!
    }

private var _handFingerLeft: ImageVector? = null
