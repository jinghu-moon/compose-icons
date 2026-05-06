package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerUpLeftDouble: ImageVector
    get() {
        if (_cornerUpLeftDouble != null) return _cornerUpLeftDouble!!
        _cornerUpLeftDouble = tablerOutlineIcon(
            name = "CornerUpLeftDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 18v-6C19 10.343 17.657 9 16 9h-7")
            addPathData("M13 13 9 9 13 5 8 13 4 9 8 5")
        }
        return _cornerUpLeftDouble!!
    }

private var _cornerUpLeftDouble: ImageVector? = null
