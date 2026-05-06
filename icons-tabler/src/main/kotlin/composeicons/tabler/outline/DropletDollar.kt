package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletDollar: ImageVector
    get() {
        if (_dropletDollar != null) return _dropletDollar!!
        _dropletDollar = tablerOutlineIcon(
            name = "DropletDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.668 10.29 13.175 3.617c-.421-.625-1.288-.803-1.937-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.544 1.24 3.532 1.786 5.493 1.51")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _dropletDollar!!
    }

private var _dropletDollar: ImageVector? = null
