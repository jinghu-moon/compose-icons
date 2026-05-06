package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blocks: ImageVector
    get() {
        if (_blocks != null) return _blocks!!
        _blocks = tablerOutlineIcon(
            name = "Blocks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4c0-.552 .448-1 1-1h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-5")
            addPathData("M3 14h12c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-10C3.895 21 3 20.105 3 19v-10C3 7.895 3.895 7 5 7h3c1.105 0 2 .895 2 2v12")
        }
        return _blocks!!
    }

private var _blocks: ImageVector? = null
