package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IdBadgeOff: ImageVector
    get() {
        if (_idBadgeOff != null) return _idBadgeOff!!
        _idBadgeOff = tablerOutlineIcon(
            name = "IdBadgeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.141 3.125C7.42 3.042 7.709 3 8 3h8c1.657 0 3 1.343 3 3v9M18.87 18.874C18.485 20.137 17.32 21 16 21h-8C6.343 21 5 19.657 5 18v-12c-0-.294 .043-.587 .128-.869")
            addPathData("M11.179 11.176c-.809 .364-1.281 1.218-1.16 2.097 .121 .879 .807 1.573 1.684 1.704 .877 .132 1.736-.33 2.111-1.134")
            addPathData("M10 6h4")
            addPathData("M9 18h6")
            addPathData("M3 3 21 21")
        }
        return _idBadgeOff!!
    }

private var _idBadgeOff: ImageVector? = null
