package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OlympicsOff: ImageVector
    get() {
        if (_olympicsOff != null) return _olympicsOff!!
        _olympicsOff = tablerOutlineIcon(
            name = "OlympicsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6C4.343 6 3 7.343 3 9c0 1.657 1.343 3 3 3C7.657 12 9 10.657 9 9")
            addPathData("M15 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 7.343 19.657 6 18 6 16.343 6 15 7.343 15 9")
            addPathData("M9 9c0 1.657 1.343 3 3 3M14.566 10.555c.719-1.184 .534-2.707-.449-3.684C13.135 5.894 11.611 5.717 10.431 6.442")
            addPathData("M6 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C12 13.343 10.657 12 9 12 7.343 12 6 13.343 6 15")
            addPathData("M12.878 12.88c-1.173 1.171-1.175 3.07-.004 4.243 1.171 1.173 3.07 1.175 4.243 .004M17.703 13.696c-.301-.621-.805-1.12-1.43-1.414")
            addPathData("M3 3 21 21")
        }
        return _olympicsOff!!
    }

private var _olympicsOff: ImageVector? = null
