package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WiperWash: ImageVector
    get() {
        if (_wiperWash != null) return _wiperWash!!
        _wiperWash = tablerOutlineIcon(
            name = "WiperWash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 11l5.5 5.5c1.944-1.906 5.056-1.906 7 0L21 11C18.722 8.417 15.444 6.937 12 6.937 8.556 6.937 5.278 8.417 3 11")
            addPathData("M12 20v-14")
            addPathData("M4 6C3.991 5.377 4.128 4.761 4.4 4.2")
            addPathData("M7 2.1c.656-.169 1.344-.169 2 0")
            addPathData("M12 6c.009-.623-.128-1.239-.4-1.8")
            addPathData("M12 6c-.009-.623 .128-1.239 .4-1.8")
            addPathData("M15 2.1c.656-.169 1.344-.169 2 0")
            addPathData("M20 6c.009-.623-.128-1.239-.4-1.8")
        }
        return _wiperWash!!
    }

private var _wiperWash: ImageVector? = null
