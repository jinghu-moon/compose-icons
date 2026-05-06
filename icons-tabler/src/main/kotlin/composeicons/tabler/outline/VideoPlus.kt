package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) return _videoPlus!!
        _videoPlus = tablerOutlineIcon(
            name = "VideoPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 10 19.553 7.724c.31-.155 .678-.138 .973 .044 .295 .182 .474 .504 .474 .85v6.764c-0 .346-.18 .668-.474 .85-.295 .182-.663 .199-.973 .044L15 14v-4")
            addPathData("M3 8C3 6.895 3.895 6 5 6h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8C3.895 18 3 17.105 3 16v-8")
            addPathData("M7 12h4")
            addPathData("M9 10v4")
        }
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
