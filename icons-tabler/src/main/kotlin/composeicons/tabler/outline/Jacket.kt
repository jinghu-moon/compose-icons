package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jacket: ImageVector
    get() {
        if (_jacket != null) return _jacket!!
        _jacket = tablerOutlineIcon(
            name = "Jacket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3 12 8 8 3")
            addPathData("M12 19c0 1.105-.895 2-2 2h-4C4.895 21 4 20.105 4 19v-8.172c0-.53 .211-1.039 .586-1.414l.828-.828C5.789 8.211 6 7.702 6 7.172v-2.172C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v2.172c0 .53 .211 1.039 .586 1.414l.828 .828c.375 .375 .586 .884 .586 1.414v8.172c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2")
            addPathData("M20 13h-3c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h3")
            addPathData("M4 17h3c.552 0 1-.448 1-1v-2C8 13.448 7.552 13 7 13h-3")
            addPathData("M12 19v-11")
        }
        return _jacket!!
    }

private var _jacket: ImageVector? = null
