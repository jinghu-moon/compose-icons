package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigRightLines: ImageVector
    get() {
        if (_arrowBigRightLines != null) return _arrowBigRightLines!!
        _arrowBigRightLines = tablerOutlineIcon(
            name = "ArrowBigRightLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9v-3.586c0-.404 .244-.769 .617-.924 .374-.155 .804-.069 1.09 .217l6.586 6.586c.39 .391 .39 1.023 0 1.414l-6.586 6.586c-.286 .286-.716 .371-1.09 .217-.374-.155-.617-.519-.617-.924v-3.586h-3v-6h3")
            addPathData("M3 9v6")
            addPathData("M6 9v6")
        }
        return _arrowBigRightLines!!
    }

private var _arrowBigRightLines: ImageVector? = null
