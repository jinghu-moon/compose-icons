package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBooking: ImageVector
    get() {
        if (_brandBooking != null) return _brandBooking!!
        _brandBooking = tablerOutlineIcon(
            name = "BrandBooking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 18.000 L 4.000 8.500 C 4.000 6.015 6.015 4.000 8.500 4.000 L 15.500 4.000 C 17.985 4.000 20.000 6.015 20.000 8.500 L 20.000 15.500 C 20.000 17.985 17.985 20.000 15.500 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000"),
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
        pathData = parseSvgPathData("M 8.000 12.000 L 11.500 12.000 C 12.605 12.000 13.500 12.895 13.500 14.000 C 13.500 15.105 12.605 16.000 11.500 16.000 L 8.000 16.000 L 8.000 9.000 C 8.000 8.448 8.448 8.000 9.000 8.000 L 10.500 8.000 C 11.605 8.000 12.500 8.895 12.500 10.000 C 12.500 11.105 11.605 12.000 10.500 12.000 L 9.000 12.000"),
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
        pathData = parseSvgPathData("M 16.000 16.000 L 16.010 16.000"),
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
        return _brandBooking!!
    }

private var _brandBooking: ImageVector? = null
