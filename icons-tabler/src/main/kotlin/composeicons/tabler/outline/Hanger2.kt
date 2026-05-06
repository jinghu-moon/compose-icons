package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerOutlineIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9 4.029 13.428C3.394 13.781 3 14.45 3 15.177v.823c0 1.105 .895 2 2 2h1")
            addPathData("M18 18h1c1.105 0 2-.895 2-2v-.823c0-.727-.394-1.396-1.029-1.749L12 9C10.543 8.19 10.007 6.667 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M6 18c0-1.105 .895-2 2-2h8c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-1")
        }
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
