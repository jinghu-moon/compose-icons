package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigLeftLine: ImageVector
    get() {
        if (_arrowBigLeftLine != null) return _arrowBigLeftLine!!
        _arrowBigLeftLine = tablerOutlineIcon(
            name = "ArrowBigLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15v3.586c-0 .404-.244 .769-.617 .924-.374 .155-.804 .069-1.09-.217L3.707 12.707c-.39-.391-.39-1.023 0-1.414L10.293 4.707c.286-.286 .716-.371 1.09-.217 .374 .155 .617 .519 .617 .924v3.586h6v6h-6")
            addPathData("M21 15v-6")
        }
        return _arrowBigLeftLine!!
    }

private var _arrowBigLeftLine: ImageVector? = null
