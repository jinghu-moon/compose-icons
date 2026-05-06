package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeQuestion: ImageVector
    get() {
        if (_homeQuestion != null) return _homeQuestion!!
        _homeQuestion = tablerOutlineIcon(
            name = "HomeQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.136 11.136 12 3 3 12h2v7c0 1.105 .895 2 2 2h7")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2c.467 0 .896 .16 1.236 .428")
            addPathData("M19 22v.01")
            addPathData("M19 19c.926 .003 1.733-.63 1.95-1.53 .217-.9-.211-1.831-1.036-2.252-.819-.42-1.819-.219-2.414 .483")
        }
        return _homeQuestion!!
    }

private var _homeQuestion: ImageVector? = null
