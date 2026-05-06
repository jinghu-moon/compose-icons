package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinDown: ImageVector
    get() {
        if (_mapPinDown != null) return _mapPinDown!!
        _mapPinDown = tablerOutlineIcon(
            name = "MapPinDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.736 21.345c-.741 .293-1.585 .118-2.149-.445L6.343 16.657C3.692 14.006 3.238 9.868 5.251 6.705 7.264 3.542 11.204 2.201 14.729 3.48c3.525 1.279 5.688 4.835 5.204 8.553")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _mapPinDown!!
    }

private var _mapPinDown: ImageVector? = null
