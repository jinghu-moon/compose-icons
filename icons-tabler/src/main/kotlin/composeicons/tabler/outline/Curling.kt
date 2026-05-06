package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Curling: ImageVector
    get() {
        if (_curling != null) return _curling!!
        _curling = tablerOutlineIcon(
            name = "Curling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13C4 10.791 5.791 9 8 9h8c2.209 0 4 1.791 4 4v2c0 2.209-1.791 4-4 4h-8C5.791 19 4 17.209 4 15v-2")
            addPathData("M4 14h16")
            addPathData("M8 5h6c1.105 0 2 .895 2 2v2")
        }
        return _curling!!
    }

private var _curling: ImageVector? = null
