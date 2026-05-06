package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BracketsContainStart: ImageVector
    get() {
        if (_bracketsContainStart != null) return _bracketsContainStart!!
        _bracketsContainStart = tablerOutlineIcon(
            name = "BracketsContainStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4h-4v16h4")
            addPathData("M18 16h-.01")
            addPathData("M14 16h-.01")
            addPathData("M10 16h-.01")
        }
        return _bracketsContainStart!!
    }

private var _bracketsContainStart: ImageVector? = null
