package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Prompt: ImageVector
    get() {
        if (_prompt != null) return _prompt!!
        _prompt = tablerOutlineIcon(
            name = "Prompt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7l5 5L5 17")
            addPathData("M13 17h6")
        }
        return _prompt!!
    }

private var _prompt: ImageVector? = null
