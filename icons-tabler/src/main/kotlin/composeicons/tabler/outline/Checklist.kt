package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Checklist: ImageVector
    get() {
        if (_checklist != null) return _checklist!!
        _checklist = tablerOutlineIcon(
            name = "Checklist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.615 20h-2.615C5.895 20 5 19.105 5 18v-12C5 4.895 5.895 4 7 4h8c1.105 0 2 .895 2 2v8")
            addPathData("M14 19l2 2 4-4")
            addPathData("M9 8h4")
            addPathData("M9 12h2")
        }
        return _checklist!!
    }

private var _checklist: ImageVector? = null
