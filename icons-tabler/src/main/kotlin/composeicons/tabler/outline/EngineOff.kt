package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EngineOff: ImageVector
    get() {
        if (_engineOff != null) return _engineOff!!
        _engineOff = tablerOutlineIcon(
            name = "EngineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10v6")
            addPathData("M12 5v3")
            addPathData("M10 5h4")
            addPathData("M5 13h-2")
            addPathData("M16 16h-1v2c0 .552-.448 1-1 1h-3.465c-.334 0-.646-.167-.832-.445L8 16h-2v-6h2l.99-.99M12 8h1.382c.379 0 .725 .214 .894 .553l1.448 2.894c.169 .339 .515 .553 .894 .553h1.382v-2h2c.552 0 1 .448 1 1v6")
            addPathData("M3 3 21 21")
        }
        return _engineOff!!
    }

private var _engineOff: ImageVector? = null
