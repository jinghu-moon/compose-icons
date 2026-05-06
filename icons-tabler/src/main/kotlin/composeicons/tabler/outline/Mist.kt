package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mist: ImageVector
    get() {
        if (_mist != null) return _mist!!
        _mist = tablerOutlineIcon(
            name = "Mist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5h3M12 5h9")
            addPathData("M3 10h11M18 10h1")
            addPathData("M5 15h5M14 15h7")
            addPathData("M3 20h9M16 20h3")
        }
        return _mist!!
    }

private var _mist: ImageVector? = null
