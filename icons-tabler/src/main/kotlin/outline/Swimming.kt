package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swimming: ImageVector
    get() {
        if (_swimming != null) return _swimming!!
        _swimming = tablerOutlineIcon(
            name = "Swimming",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 9.000 C 15.000 9.552 15.448 10.000 16.000 10.000 C 16.552 10.000 17.000 9.552 17.000 9.000 C 17.000 8.448 16.552 8.000 16.000 8.000 C 15.448 8.000 15.000 8.448 15.000 9.000"),
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
        pathData = parseSvgPathData("M 6.000 11.000 L 10.000 9.000 L 13.500 12.000 L 12.000 14.000"),
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
        pathData = parseSvgPathData("M 3.000 16.750 C 3.311 16.905 3.652 16.990 4.000 17.000 C 4.791 17.017 5.539 16.643 6.000 16.000 C 6.461 15.357 7.209 14.983 8.000 15.000 C 8.791 14.983 9.539 15.357 10.000 16.000 C 10.461 16.643 11.209 17.017 12.000 17.000 C 12.791 17.017 13.539 16.643 14.000 16.000 C 14.461 15.357 15.209 14.983 16.000 15.000 C 16.791 14.983 17.539 15.357 18.000 16.000 C 18.461 16.643 19.209 17.017 20.000 17.000 C 20.348 16.990 20.689 16.905 21.000 16.750"),
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
        return _swimming!!
    }

private var _swimming: ImageVector? = null
