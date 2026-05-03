package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerOutlineIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.604 7.197 L 10.742 4.088 C 10.980 3.986 11.249 3.984 11.488 4.084 C 11.727 4.183 11.916 4.374 12.012 4.615 L 16.936 16.517 C 17.149 17.019 16.920 17.599 16.422 17.821 L 9.285 20.930 C 9.047 21.032 8.778 21.034 8.538 20.935 C 8.299 20.836 8.110 20.644 8.014 20.403 L 3.090 8.500 C 2.877 7.998 3.106 7.418 3.604 7.196 L 3.604 7.197"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.000 4.000 L 16.000 4.000 C 16.552 4.000 17.000 4.448 17.000 5.000 L 17.000 8.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 20.000 6.000 C 20.264 6.112 20.520 6.217 20.768 6.315 C 21.276 6.531 21.514 7.118 21.298 7.626 L 19.000 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
