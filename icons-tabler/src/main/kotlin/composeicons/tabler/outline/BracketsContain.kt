package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsContain: ImageVector
    get() {
        if (_bracketsContain != null) return _bracketsContain!!
        _bracketsContain = tablerOutlineIcon(
            name = "BracketsContain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 4h-4v16h4")
            addPathData("M17 4h4v16h-4")
            addPathData("M8 16h.01")
            addPathData("M12 16h.01")
            addPathData("M16 16h.01")
        }
        return _bracketsContain!!
    }

private var _bracketsContain: ImageVector? = null
