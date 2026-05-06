package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScriptX: ImageVector
    get() {
        if (_scriptX != null) return _scriptX!!
        _scriptX = tablerOutlineIcon(
            name = "ScriptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 20h-8C4.343 20 3 18.657 3 17 3 15.343 4.343 14 6 14h11c-1.657 0-3 1.343-3 3M21 14v-8C21 4.895 20.105 4 19 4h-10C7.895 4 7 4.895 7 6v8")
            addPathData("M17 17l4 4M21 17l-4 4")
        }
        return _scriptX!!
    }

private var _scriptX: ImageVector? = null
