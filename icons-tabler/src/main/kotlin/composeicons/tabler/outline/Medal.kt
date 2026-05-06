package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = tablerOutlineIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v3M8 4v6M16 4v6")
            addPathData("M12 18.5 9 20l.5-3.5-2-2 3-.5L12 11l1.5 3 3 .5-2 2L15 20 12 18.5")
        }
        return _medal!!
    }

private var _medal: ImageVector? = null
