package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Waterpolo: ImageVector
    get() {
        if (_waterpolo != null) return _waterpolo!!
        _waterpolo = tablerOutlineIcon(
            name = "Waterpolo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 C 12.000 9.552 12.448 10.000 13.000 10.000 C 13.552 10.000 14.000 9.552 14.000 9.000 C 14.000 8.448 13.552 8.000 13.000 8.000 C 12.448 8.000 12.000 8.448 12.000 9.000"),
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
                pathData = parseSvgPathData("M 5.000 8.000 L 8.000 12.000 L 12.500 13.000 L 20.000 12.000"),
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
                pathData = parseSvgPathData("M 3.000 18.750 C 3.311 18.905 3.652 18.990 4.000 19.000 C 4.791 19.017 5.539 18.643 6.000 18.000 C 6.461 17.357 7.209 16.983 8.000 17.000 C 8.791 16.983 9.539 17.357 10.000 18.000 C 10.461 18.643 11.209 19.017 12.000 19.000 C 12.791 19.017 13.539 18.643 14.000 18.000 C 14.461 17.357 15.209 16.983 16.000 17.000 C 16.791 16.983 17.539 17.357 18.000 18.000 C 18.461 18.643 19.209 19.017 20.000 19.000 C 20.348 18.990 20.689 18.905 21.000 18.750"),
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
                pathData = parseSvgPathData("M 12.000 16.000 L 12.500 13.000"),
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
                pathData = parseSvgPathData("M 6.500 5.000 C 6.776 5.000 7.000 4.776 7.000 4.500 C 7.000 4.224 6.776 4.000 6.500 4.000 C 6.224 4.000 6.000 4.224 6.000 4.500 C 6.000 4.776 6.224 5.000 6.500 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _waterpolo!!
    }

private var _waterpolo: ImageVector? = null
