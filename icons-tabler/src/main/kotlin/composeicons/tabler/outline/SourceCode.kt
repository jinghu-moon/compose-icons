package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SourceCode: ImageVector
    get() {
        if (_sourceCode != null) return _sourceCode!!
        _sourceCode = tablerOutlineIcon(
            name = "SourceCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 4h2.5c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-10C5.343 20 4 18.657 4 17v-5")
            addPathData("M6 5 4 7 6 9")
            addPathData("M10 9 12 7 10 5")
        }
        return _sourceCode!!
    }

private var _sourceCode: ImageVector? = null
