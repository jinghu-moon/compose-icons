package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FunctionOff: ImageVector
    get() {
        if (_functionOff != null) return _functionOff!!
        _functionOff = tablerOutlineIcon(
            name = "FunctionOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15.5v.25C9 16.44 9.56 17 10.25 17c.71 0 1.304-.538 1.374-1.244L12 12M12.363 8.37l.013-.126C12.446 7.538 13.04 7 13.75 7 14.44 7 15 7.56 15 8.25v.25")
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.414 19.414c-.375 .375-.884 .586-1.414 .586h-12C4.895 20 4 19.105 4 18v-12C4 5.453 4.22 4.957 4.576 4.595")
            addPathData("M9 12h3")
            addPathData("M3 3 21 21")
        }
        return _functionOff!!
    }

private var _functionOff: ImageVector? = null
