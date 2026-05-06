package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MasksTheater: ImageVector
    get() {
        if (_masksTheater != null) return _masksTheater!!
        _masksTheater = tablerOutlineIcon(
            name = "MasksTheater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.192 9h6.616c.562-0 1.099 .237 1.478 .652 .379 .415 .566 .971 .514 1.531l-.567 6.182c-.189 2.059-1.915 3.635-3.983 3.635h-1.5c-2.068-0-3.794-1.576-3.983-3.635l-.567-6.182c-.051-.56 .135-1.116 .514-1.531 .379-.415 .915-.652 1.478-.652")
            addPathData("M15 13h.01")
            addPathData("M18 13h.01")
            addPathData("M15 16.5c1 .667 2 .667 3 0")
            addPathData("M8.632 15.982c-.127 .012-.254 .018-.382 .018h-1.5C4.682 16 2.956 14.424 2.767 12.365L2.2 6.183C2.149 5.623 2.335 5.067 2.714 4.652 3.093 4.237 3.63 4 4.192 4h6.616c1.105 0 2 .895 2 2")
            addPathData("M6 8h.01")
            addPathData("M9 8h.01")
            addPathData("M6 12c.764-.51 1.528-.63 2.291-.36")
        }
        return _masksTheater!!
    }

private var _masksTheater: ImageVector? = null
