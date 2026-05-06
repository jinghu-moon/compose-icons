package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fold: ImageVector
    get() {
        if (_fold != null) return _fold!!
        _fold = tablerOutlineIcon(
            name = "Fold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v6L15 6M9 6l3 3")
            addPathData("M12 21v-6l3 3M9 18l3-3")
            addPathData("M4 12h1")
            addPathData("M9 12h1")
            addPathData("M14 12h1")
            addPathData("M19 12h1")
        }
        return _fold!!
    }

private var _fold: ImageVector? = null
