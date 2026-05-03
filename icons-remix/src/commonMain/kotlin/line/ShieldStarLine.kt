package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShieldStarLine: ImageVector
    get() {
        if (_shieldStarLine != null) return _shieldStarLine!!
        _shieldStarLine = remixIcon(
            name = "ShieldStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 4.604 L 5.000 13.789 C 5.000 15.126 5.668 16.375 6.781 17.117 L 12.000 20.596 L 17.219 17.117 C 18.332 16.375 19.000 15.126 19.000 13.789 L 19.000 4.604 L 12.000 3.049 L 5.000 4.604 ZM 3.783 2.826 L 12.000 1.000 L 20.217 2.826 C 20.674 2.928 21.000 3.333 21.000 3.802 L 21.000 13.789 C 21.000 15.795 19.997 17.668 18.328 18.781 L 12.000 23.000 L 5.672 18.781 C 4.003 17.668 3.000 15.795 3.000 13.789 L 3.000 3.802 C 3.000 3.333 3.326 2.928 3.783 2.826 ZM 12.000 13.500 L 9.061 15.045 L 9.622 11.773 L 7.245 9.455 L 10.531 8.977 L 12.000 6.000 L 13.469 8.977 L 16.755 9.455 L 14.378 11.773 L 14.939 15.045 L 12.000 13.500 Z"),
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
        return _shieldStarLine!!
    }

private var _shieldStarLine: ImageVector? = null
