package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Device3DLens: ImageVector
    get() {
        if (_device3DLens != null) return _device3DLens!!
        _device3DLens = tablerOutlineIcon(
            name = "Device3DLens",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.005 14.64c.643-.729 .997-1.668 .995-2.64")
            addPathData("M12 4v16")
            addPathData("M15 5v14c3.866 0 7-3.134 7-7C22 8.134 18.866 5 15 5")
            addPathData("M9 5v14C5.134 19 2 15.866 2 12 2 8.134 5.134 5 9 5")
        }
        return _device3DLens!!
    }

private var _device3DLens: ImageVector? = null
