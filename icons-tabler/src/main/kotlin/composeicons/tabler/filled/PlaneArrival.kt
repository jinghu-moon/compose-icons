package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) return _planeArrival!!
        _planeArrival = tablerFilledIcon(
            name = "PlaneArrival",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.466 2.271l2.898 .777c.346 .093 .617 .364 .708 .711l1.904 7.235 4.255 1.141c1.045 .267 1.866 1.074 2.151 2.114 .285 1.04-.011 2.153-.774 2.915-.763 .762-1.876 1.056-2.916 .77L4.203 14.052c-.365-.098-.644-.394-.72-.765L2.136 6.715c-.07-.34 .041-.691 .294-.929 .252-.238 .61-.328 .945-.238l2.898 .776c.256 .069 .474 .236 .607 .466L8.087 8.881l1.217 .326L9.206 3.253c-.005-.314 .137-.612 .385-.805 .247-.193 .571-.259 .874-.177")
            addPathData("M22 21c0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1")
        }
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
