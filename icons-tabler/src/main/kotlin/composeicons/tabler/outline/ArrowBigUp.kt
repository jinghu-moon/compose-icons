package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = tablerOutlineIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 20v-8h-3.586c-.404-0-.769-.244-.924-.617-.155-.374-.069-.804 .217-1.09L11.293 3.707c.391-.39 1.023-.39 1.414 0l6.586 6.586c.286 .286 .371 .716 .217 1.09-.155 .374-.519 .617-.924 .617h-3.586v8c0 .552-.448 1-1 1h-4C9.448 21 9 20.552 9 20"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
