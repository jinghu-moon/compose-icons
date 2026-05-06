package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPins: ImageVector
    get() {
        if (_mapPins != null) return _mapPins!!
        _mapPins = tablerOutlineIcon(
            name = "MapPins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.828 9.828c1.144-1.144 1.487-2.864 .868-4.359C11.077 3.974 9.618 2.999 8 2.999c-1.618 0-3.077 .975-3.696 2.47-.619 1.495-.277 3.215 .868 4.359L8 12.657 10.828 9.828")
            addPathData("M8 7v.01")
            addPathData("M18.828 17.828c1.144-1.144 1.487-2.864 .868-4.359C19.077 11.974 17.618 10.999 16 10.999c-1.618 0-3.077 .975-3.696 2.47-.619 1.495-.277 3.215 .868 4.359L16 20.657l2.828-2.829")
            addPathData("M16 15v.01")
        }
        return _mapPins!!
    }

private var _mapPins: ImageVector? = null
