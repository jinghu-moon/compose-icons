package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MasksTheaterOff: ImageVector
    get() {
        if (_masksTheaterOff != null) return _masksTheaterOff!!
        _masksTheaterOff = tablerOutlineIcon(
            name = "MasksTheaterOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 9c.058 0 .133 0 .192 0h6.616c.562-0 1.099 .237 1.478 .652 .379 .415 .566 .971 .514 1.531l-.554 6.041M19.96 19.942c-.738 .681-1.706 1.059-2.71 1.058h-1.5c-2.068-0-3.794-1.576-3.983-3.635l-.567-6.182")
            addPathData("M18 13h.01")
            addPathData("M15 16.5c.657 .438 1.313 .588 1.97 .451")
            addPathData("M8.632 15.982c-.127 .012-.254 .018-.382 .018h-1.5C4.682 16 2.956 14.424 2.767 12.365L2.2 6.183C2.149 5.623 2.335 5.067 2.714 4.652 3.046 4.282 3.505 4.049 4 4M8 4h2.808c1.105 0 2 .895 2 2")
            addPathData("M6 8h.01")
            addPathData("M6 12c.764-.51 1.528-.63 2.291-.36")
            addPathData("M3 3 21 21")
        }
        return _masksTheaterOff!!
    }

private var _masksTheaterOff: ImageVector? = null
