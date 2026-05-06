package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FoldDown: ImageVector
    get() {
        if (_foldDown != null) return _foldDown!!
        _foldDown = tablerOutlineIcon(
            name = "FoldDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 11v8l3-3M9 16l3 3")
            addPathData("M9 7h1")
            addPathData("M14 7h1")
            addPathData("M19 7h1")
            addPathData("M4 7h1")
        }
        return _foldDown!!
    }

private var _foldDown: ImageVector? = null
