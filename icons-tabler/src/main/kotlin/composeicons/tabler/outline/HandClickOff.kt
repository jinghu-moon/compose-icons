package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandClickOff: ImageVector
    get() {
        if (_handClickOff != null) return _handClickOff!!
        _handClickOff = tablerOutlineIcon(
            name = "HandClickOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v-5")
            addPathData("M8.06 4.077C8.269 3.36 8.974 2.906 9.714 3.012c.739 .106 1.288 .741 1.286 1.488v2.5M11 11v1")
            addPathData("M12.063 8.065c.455-.138 .948-.053 1.33 .23 .382 .283 .607 .73 .607 1.205v.5")
            addPathData("M14.06 10.082c.209-.716 .912-1.17 1.651-1.065 .739 .105 1.288 .737 1.289 1.483v1.5")
            addPathData("M17 11.5C17 10.672 17.672 10 18.5 10c.828 0 1.5 .672 1.5 1.5v4.5M19.12 19.129C18.03 20.913 16.09 22 14 22h-2 .208C10.19 22 8.306 20.986 7.196 19.3L7 19C6.688 18.521 5.593 16.612 3.714 13.272c-.398-.708-.161-1.604 .536-2.022 .734-.441 1.674-.325 2.28 .28L8 13")
            addPathData("M3 3 21 21")
            addPathData("M4 7h-1")
            addPathData("M14 3 15 2")
            addPathData("M15 6h1")
        }
        return _handClickOff!!
    }

private var _handClickOff: ImageVector? = null
