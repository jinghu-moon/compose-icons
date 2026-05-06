package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MistOff: ImageVector
    get() {
        if (_mistOff != null) return _mistOff!!
        _mistOff = tablerOutlineIcon(
            name = "MistOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5h9")
            addPathData("M3 10h7")
            addPathData("M18 10h1")
            addPathData("M5 15h5")
            addPathData("M14 15h1M19 15h2")
            addPathData("M3 20h9M16 20h3")
            addPathData("M3 3 21 21")
        }
        return _mistOff!!
    }

private var _mistOff: ImageVector? = null
