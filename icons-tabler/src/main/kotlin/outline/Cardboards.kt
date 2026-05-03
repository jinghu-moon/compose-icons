package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cardboards: ImageVector
    get() {
        if (_cardboards != null) return _cardboards!!
        _cardboards = tablerOutlineIcon(
            name = "Cardboards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 8.000 L 3.000 16.500 C 3.000 17.881 4.119 19.000 5.500 19.000 L 6.560 19.000 C 7.471 18.998 8.332 18.582 8.900 17.870 L 10.440 15.950 C 10.820 15.477 11.393 15.202 12.000 15.202 C 12.607 15.202 13.180 15.477 13.560 15.950 L 15.100 17.870 C 15.668 18.582 16.529 18.998 17.440 19.000 L 18.500 19.000 C 19.881 19.000 21.000 17.881 21.000 16.500 L 21.000 8.000 C 21.000 6.895 20.105 6.000 19.000 6.000 L 5.000 6.000 C 3.895 6.000 3.000 6.895 3.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 C 7.000 12.552 7.448 13.000 8.000 13.000 C 8.552 13.000 9.000 12.552 9.000 12.000 C 9.000 11.448 8.552 11.000 8.000 11.000 C 7.448 11.000 7.000 11.448 7.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 C 15.000 12.552 15.448 13.000 16.000 13.000 C 16.552 13.000 17.000 12.552 17.000 12.000 C 17.000 11.448 16.552 11.000 16.000 11.000 C 15.448 11.000 15.000 11.448 15.000 12.000"),
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
        return _cardboards!!
    }

private var _cardboards: ImageVector? = null
