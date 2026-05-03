package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = tablerOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 L 21.000 12.500 C 21.000 14.000 18.483 18.073 17.000 19.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 8.000 21.000 C 7.448 21.000 7.000 20.552 7.000 20.000 L 7.000 19.000 C 5.313 17.946 3.000 14.000 3.000 12.500 L 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000"),
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
        pathData = parseSvgPathData("M 18.500 11.000 C 18.851 9.983 18.926 8.764 19.000 7.286 L 19.000 6.000 L 16.744 6.000 C 13.914 6.000 12.128 6.804 11.104 8.076"),
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
        pathData = parseSvgPathData("M 5.255 11.008 C 5.115 10.347 5.029 9.675 5.000 9.000 L 5.000 8.000 L 6.755 8.000 C 7.735 8.000 8.556 8.124 9.234 8.350"),
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
        pathData = parseSvgPathData("M 8.000 8.000 L 9.000 4.000 L 13.000 6.500"),
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
        pathData = parseSvgPathData("M 13.000 11.000 L 13.000 10.500 C 13.000 9.119 11.881 8.000 10.500 8.000 C 9.119 8.000 8.000 9.119 8.000 10.500 L 8.000 11.000"),
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
        return _salad!!
    }

private var _salad: ImageVector? = null
