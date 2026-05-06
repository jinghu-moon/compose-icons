package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterQ: ImageVector
    get() {
        if (_letterQ != null) return _letterQ!!
        _letterQ = tablerOutlineIcon(
            name = "LetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 9C18 6.239 15.761 4 13 4h-2C8.239 4 6 6.239 6 9v6c0 2.761 2.239 5 5 5h2c2.761 0 5-2.239 5-5v-6")
            addPathData("M13 15l5 5")
        }
        return _letterQ!!
    }

private var _letterQ: ImageVector? = null
