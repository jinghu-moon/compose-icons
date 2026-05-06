package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WritingSign: ImageVector
    get() {
        if (_writingSign != null) return _writingSign!!
        _writingSign = tablerOutlineIcon(
            name = "WritingSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19C6.333 17 8 15 8 13 8 10 7 10 6 10 5 10 3.968 11.085 4 13c.034 2.048 1.658 2.877 2.5 4C8 19 9 19.5 10 18c.667-1 1.167-1.833 1.5-2.5 1 2.333 2.333 3.5 4 3.5h2.5")
            addPathData("M20 17v-12C20 3.879 19.121 3 18 3c-1.121 0-2 .879-2 2v12l2 2 2-2")
            addPathData("M16 7h4")
        }
        return _writingSign!!
    }

private var _writingSign: ImageVector? = null
