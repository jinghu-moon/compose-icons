package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InfraredThermometerFill: ImageVector
    get() {
        if (_infraredThermometerFill != null) return _infraredThermometerFill!!
        _infraredThermometerFill = remixIcon(
            name = "InfraredThermometerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 2.000 L 21.000 11.000 L 17.999 11.000 L 18.000 12.000 C 18.000 14.209 16.209 16.000 14.000 16.000 L 12.621 16.000 L 12.008 19.111 L 12.919 20.432 C 13.233 20.887 13.118 21.510 12.663 21.823 C 12.497 21.938 12.299 22.000 12.096 22.000 L 3.000 22.000 L 5.313 11.976 L 3.000 11.000 L 7.000 2.000 L 21.000 2.000 ZM 15.999 11.000 L 13.605 11.000 L 13.014 14.000 L 14.000 14.000 C 15.105 14.000 16.000 13.105 16.000 12.000 L 15.999 11.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _infraredThermometerFill!!
    }

private var _infraredThermometerFill: ImageVector? = null
