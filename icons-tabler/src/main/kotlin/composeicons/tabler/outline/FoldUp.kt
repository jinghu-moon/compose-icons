package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FoldUp: ImageVector
    get() {
        if (_foldUp != null) return _foldUp!!
        _foldUp = tablerOutlineIcon(
            name = "FoldUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13v-8L9 8M15 8 12 5")
            addPathData("M9 17h1")
            addPathData("M14 17h1")
            addPathData("M19 17h1")
            addPathData("M4 17h1")
        }
        return _foldUp!!
    }

private var _foldUp: ImageVector? = null
