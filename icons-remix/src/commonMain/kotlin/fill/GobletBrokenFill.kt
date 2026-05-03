package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GobletBrokenFill: ImageVector
    get() {
        if (_gobletBrokenFill != null) return _gobletBrokenFill!!
        _gobletBrokenFill = remixIcon(
            name = "GobletBrokenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.923 2.000 L 10.835 5.616 L 13.434 7.116 L 11.684 10.147 L 13.415 11.147 L 16.166 6.384 L 13.567 4.884 L 15.232 2.000 L 17.868 2.000 L 18.990 9.859 C 19.292 11.973 18.469 13.789 17.110 15.047 C 16.005 16.069 14.542 16.732 13.000 16.934 L 13.000 20.000 L 18.000 20.000 L 18.000 22.000 L 6.000 22.000 L 6.000 20.000 L 11.000 20.000 L 11.000 16.934 C 9.459 16.732 7.996 16.069 6.891 15.047 C 5.532 13.789 4.708 11.973 5.011 9.859 L 6.133 2.000 L 12.923 2.000 Z"),
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
        return _gobletBrokenFill!!
    }

private var _gobletBrokenFill: ImageVector? = null
