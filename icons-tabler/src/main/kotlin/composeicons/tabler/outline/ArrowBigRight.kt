package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = tablerOutlineIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 9h8v-3.586c0-.404 .244-.769 .617-.924 .374-.155 .804-.069 1.09 .217l6.586 6.586c.39 .391 .39 1.023 0 1.414l-6.586 6.586c-.286 .286-.716 .371-1.09 .217-.374-.155-.617-.519-.617-.924v-3.586h-8C3.448 15 3 14.552 3 14v-4C3 9.448 3.448 9 4 9"),
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
