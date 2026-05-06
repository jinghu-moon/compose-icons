package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = tablerOutlineIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 20l7-7")
            addPathData("M13 20v-6c0-.552 .448-1 1-1h6v-7C20 4.895 19.105 4 18 4h-12C4.895 4 4 4.895 4 6v12c0 1.105 .895 2 2 2h7")
        }
        return _note!!
    }

private var _note: ImageVector? = null
