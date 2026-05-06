package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkiJumping: ImageVector
    get() {
        if (_skiJumping != null) return _skiJumping!!
        _skiJumping = tablerOutlineIcon(
            name = "SkiJumping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 3c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 2.448 12.552 2 12 2c-.552 0-1 .448-1 1")
            addPathData("M17 17.5 12 13v-6l5 4")
            addPathData("M7 17.5 12 13")
            addPathData("M15.103 21.58 21.865 7.078c.466-1.001 .033-2.19-.968-2.657")
            addPathData("M8.897 21.58 2.135 7.077C1.669 6.076 2.102 4.887 3.103 4.42")
            addPathData("M7 11 12 7")
        }
        return _skiJumping!!
    }

private var _skiJumping: ImageVector? = null
