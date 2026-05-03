package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RainbowLine: ImageVector
    get() {
        if (_rainbowLine != null) return _rainbowLine!!
        _rainbowLine = remixIcon(
            name = "RainbowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 18.075 4.000 23.000 8.925 23.000 15.000 L 23.000 20.000 L 21.000 20.000 L 21.000 15.000 C 21.000 10.118 17.113 6.144 12.265 6.004 L 12.000 6.000 C 7.118 6.000 3.144 9.887 3.004 14.735 L 3.000 15.000 L 3.000 20.000 L 1.000 20.000 L 1.000 15.000 C 1.000 8.925 5.925 4.000 12.000 4.000 ZM 12.000 8.000 C 15.866 8.000 19.000 11.134 19.000 15.000 L 19.000 20.000 L 17.000 20.000 L 17.000 15.000 C 17.000 12.311 14.878 10.118 12.217 10.005 L 12.000 10.000 C 9.311 10.000 7.118 12.122 7.005 14.783 L 7.000 15.000 L 7.000 20.000 L 5.000 20.000 L 5.000 15.000 C 5.000 11.134 8.134 8.000 12.000 8.000 ZM 12.000 12.000 C 13.657 12.000 15.000 13.343 15.000 15.000 L 15.000 20.000 L 13.000 20.000 L 13.000 15.000 C 13.000 14.487 12.614 14.064 12.117 14.007 L 12.000 14.000 C 11.487 14.000 11.064 14.386 11.007 14.883 L 11.000 15.000 L 11.000 20.000 L 9.000 20.000 L 9.000 15.000 C 9.000 13.343 10.343 12.000 12.000 12.000 Z"),
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
        return _rainbowLine!!
    }

private var _rainbowLine: ImageVector? = null
