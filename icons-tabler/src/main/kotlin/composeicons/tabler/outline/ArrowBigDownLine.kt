package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigDownLine: ImageVector
    get() {
        if (_arrowBigDownLine != null) return _arrowBigDownLine!!
        _arrowBigDownLine = tablerOutlineIcon(
            name = "ArrowBigDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12h3.586c.404 0 .769 .244 .924 .617 .155 .374 .069 .804-.217 1.09l-6.586 6.586c-.391 .39-1.023 .39-1.414 0L4.707 13.707c-.286-.286-.371-.716-.217-1.09 .155-.374 .519-.617 .924-.617h3.586v-6h6v6")
            addPathData("M15 3h-6")
        }
        return _arrowBigDownLine!!
    }

private var _arrowBigDownLine: ImageVector? = null
