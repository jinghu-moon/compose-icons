package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmokingNo: ImageVector
    get() {
        if (_smokingNo != null) return _smokingNo!!
        _smokingNo = tablerOutlineIcon(
            name = "SmokingNo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v4")
            addPathData("M16 5v.5c0 1.105 .895 2 2 2 1.105 0 2 .895 2 2v.5")
            addPathData("M3 3 21 21")
            addPathData("M17 13h3c.552 0 1 .448 1 1v2c0 .28-.115 .533-.3 .714M17 17h-13C3.448 17 3 16.552 3 16v-2c0-.552 .448-1 1-1h9")
        }
        return _smokingNo!!
    }

private var _smokingNo: ImageVector? = null
