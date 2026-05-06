package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FirstAidKitOff: ImageVector
    get() {
        if (_firstAidKitOff != null) return _firstAidKitOff!!
        _firstAidKitOff = tablerOutlineIcon(
            name = "FirstAidKitOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.595 4.577C8.969 4.207 9.474 4 10 4h4c1.105 0 2 .895 2 2v2")
            addPathData("M12 8h6c1.105 0 2 .895 2 2v6M19.424 19.405c-.376 .381-.889 .595-1.424 .595h-12C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8h2")
            addPathData("M10 14h4")
            addPathData("M12 12v4")
            addPathData("M3 3 21 21")
        }
        return _firstAidKitOff!!
    }

private var _firstAidKitOff: ImageVector? = null
