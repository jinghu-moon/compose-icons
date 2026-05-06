package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExternalLinkOff: ImageVector
    get() {
        if (_externalLinkOff != null) return _externalLinkOff!!
        _externalLinkOff = tablerOutlineIcon(
            name = "ExternalLinkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-1C4.895 7 4 7.895 4 9v9c0 1.105 .895 2 2 2h9c1.105 0 2-.895 2-2v-1")
            addPathData("M10 14l2-2M14.007 9.993l6-6")
            addPathData("M15 4h5v5")
            addPathData("M3 3 21 21")
        }
        return _externalLinkOff!!
    }

private var _externalLinkOff: ImageVector? = null
