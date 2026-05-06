package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RocketOff: ImageVector
    get() {
        if (_rocketOff != null) return _rocketOff!!
        _rocketOff = tablerOutlineIcon(
            name = "RocketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.29 9.275C9.183 9.512 9.086 9.754 9 10c-2.073 .068-3.964 1.203-5 3 3.67 .436 6.564 3.33 7 7 1.797-1.036 2.932-2.927 3-5 .241-.085 .478-.18 .708-.283M17.136 13.107C18.846 11.52 19.873 9.33 20 7 20 5.343 18.657 4 17 4c-2.33 .127-4.52 1.154-6.107 2.864")
            addPathData("M7 14C4.871 15.202 3.684 17.576 4 20c2.424 .316 4.798-.871 6-3")
            addPathData("M14 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 8.448 15.552 8 15 8c-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _rocketOff!!
    }

private var _rocketOff: ImageVector? = null
