package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyOff: ImageVector
    get() {
        if (_copyOff != null) return _copyOff!!
        _copyOff = tablerOutlineIcon(
            name = "CopyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.414 19.415c-.375 .375-.884 .585-1.414 .585h-8C8.895 20 8 19.105 8 18v-8C8 9.446 8.225 8.945 8.589 8.583M12 8h6c1.105 0 2 .895 2 2v6")
            addPathData("M16 8v-2C16 4.895 15.105 4 14 4h-6M4.582 4.59C4.222 4.95 4 5.45 4 6v8c0 1.105 .895 2 2 2h2")
            addPathData("M3 3 21 21")
        }
        return _copyOff!!
    }

private var _copyOff: ImageVector? = null
