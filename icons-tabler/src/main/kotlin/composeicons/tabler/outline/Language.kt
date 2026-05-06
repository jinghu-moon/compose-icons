package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Language: ImageVector
    get() {
        if (_language != null) return _language!!
        _language = tablerOutlineIcon(
            name = "Language",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6.371C9 10.789 6.761 13 4 13")
            addPathData("M4 6.371h7")
            addPathData("M5 9c0 2.144 2.252 3.908 6 4")
            addPathData("M12 20l4-9 4 9")
            addPathData("M19.1 18h-6.2")
            addPathData("M6.694 3l.793 .582")
        }
        return _language!!
    }

private var _language: ImageVector? = null
