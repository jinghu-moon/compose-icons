package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapMinus: ImageVector
    get() {
        if (_mapMinus != null) return _mapMinus!!
        _mapMinus = tablerOutlineIcon(
            name = "MapMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18.5 9 17 3 20v-13L9 4l6 3L21 4v11")
            addPathData("M9 4v13")
            addPathData("M15 7v8")
            addPathData("M16 19h6")
        }
        return _mapMinus!!
    }

private var _mapMinus: ImageVector? = null
