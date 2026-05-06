package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Puzzle2: ImageVector
    get() {
        if (_puzzle2 != null) return _puzzle2!!
        _puzzle2 = tablerOutlineIcon(
            name = "Puzzle2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M12 4v2.5C12 6.776 11.776 7 11.5 7 10.672 7 10 7.672 10 8.5c0 .828 .672 1.5 1.5 1.5 .276 0 .5 .224 .5 .5v1.5")
            addPathData("M12 12v1.5c0 .276 .224 .5 .5 .5 .828 0 1.5 .672 1.5 1.5C14 16.328 13.328 17 12.5 17c-.276 0-.5 .224-.5 .5v2.5")
            addPathData("M20 12h-2.5C17.224 12 17 11.776 17 11.5 17 10.672 16.328 10 15.5 10 14.672 10 14 10.672 14 11.5c0 .276-.224 .5-.5 .5h-1.5")
            addPathData("M12 12h-1.5c-.276 0-.5 .224-.5 .5C10 13.328 9.328 14 8.5 14 7.672 14 7 13.328 7 12.5 7 12.224 6.776 12 6.5 12h-2.5")
        }
        return _puzzle2!!
    }

private var _puzzle2: ImageVector? = null
