package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DirectionFill: ImageVector
    get() {
        if (_directionFill != null) return _directionFill!!
        _directionFill = remixIcon(
            name = "DirectionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 10.000 C 8.448 10.000 8.000 10.448 8.000 11.000 L 8.000 15.000 L 10.000 15.000 L 10.000 12.000 L 13.000 12.000 L 13.000 14.500 L 16.500 11.000 L 13.000 7.500 L 13.000 10.000 L 9.000 10.000 ZM 12.707 1.393 L 22.607 11.293 C 22.997 11.684 22.997 12.317 22.607 12.707 L 12.707 22.607 C 12.317 22.997 11.684 22.997 11.293 22.607 L 1.393 12.707 C 1.003 12.317 1.003 11.684 1.393 11.293 L 11.293 1.393 C 11.684 1.003 12.317 1.003 12.707 1.393 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _directionFill!!
    }

private var _directionFill: ImageVector? = null
