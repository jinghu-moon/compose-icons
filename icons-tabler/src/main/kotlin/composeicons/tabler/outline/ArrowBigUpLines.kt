package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigUpLines: ImageVector
    get() {
        if (_arrowBigUpLines != null) return _arrowBigUpLines!!
        _arrowBigUpLines = tablerOutlineIcon(
            name = "ArrowBigUpLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12h-3.586c-.404-0-.769-.244-.924-.617-.155-.374-.069-.804 .217-1.09L11.293 3.707c.391-.39 1.023-.39 1.414 0l6.586 6.586c.286 .286 .371 .716 .217 1.09-.155 .374-.519 .617-.924 .617h-3.586v3h-6v-3")
            addPathData("M9 21h6")
            addPathData("M9 18h6")
        }
        return _arrowBigUpLines!!
    }

private var _arrowBigUpLines: ImageVector? = null
