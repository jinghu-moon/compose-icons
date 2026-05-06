package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VideoOff: ImageVector
    get() {
        if (_videoOff != null) return _videoOff!!
        _videoOff = tablerOutlineIcon(
            name = "VideoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M15 11v-1L19.553 7.724c.31-.155 .678-.138 .973 .044 .295 .182 .474 .504 .474 .85v6.764c0 .427-.271 .807-.675 .946")
            addPathData("M10 6h3c1.105 0 2 .895 2 2v3M15 15v1c0 1.105-.895 2-2 2h-8C3.895 18 3 17.105 3 16v-8C3 6.895 3.895 6 5 6h1")
        }
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
