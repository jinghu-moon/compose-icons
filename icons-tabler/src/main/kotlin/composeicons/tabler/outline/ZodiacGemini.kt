package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacGemini: ImageVector
    get() {
        if (_zodiacGemini != null) return _zodiacGemini!!
        _zodiacGemini = tablerOutlineIcon(
            name = "ZodiacGemini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3C8.696 5.702 15.304 5.702 21 3")
            addPathData("M3 21c5.696-2.702 12.304-2.702 18 0")
            addPathData("M7 4.5v15")
            addPathData("M17 4.5v15")
        }
        return _zodiacGemini!!
    }

private var _zodiacGemini: ImageVector? = null
