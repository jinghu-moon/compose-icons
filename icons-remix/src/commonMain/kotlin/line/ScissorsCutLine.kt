package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScissorsCutLine: ImageVector
    get() {
        if (_scissorsCutLine != null) return _scissorsCutLine!!
        _scissorsCutLine = remixIcon(
            name = "ScissorsCutLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 5.997 C 10.000 6.729 9.803 7.416 9.459 8.006 L 12.000 10.583 L 18.728 3.855 C 19.509 3.074 20.775 3.074 21.556 3.855 L 9.446 15.965 C 9.798 16.560 10.000 17.255 10.000 17.997 C 10.000 20.206 8.209 21.997 6.000 21.997 C 3.791 21.997 2.000 20.206 2.000 17.997 C 2.000 15.788 3.791 13.997 6.000 13.997 C 6.742 13.997 7.436 14.199 8.032 14.550 L 10.586 11.997 L 8.032 9.443 C 7.436 9.795 6.742 9.997 6.000 9.997 C 3.791 9.997 2.000 8.206 2.000 5.997 C 2.000 3.788 3.791 1.997 6.000 1.997 C 8.209 1.997 10.000 3.788 10.000 5.997 ZM 8.000 5.997 C 8.000 4.892 7.105 3.997 6.000 3.997 C 4.895 3.997 4.000 4.892 4.000 5.997 C 4.000 7.101 4.895 7.997 6.000 7.997 C 7.105 7.997 8.000 7.101 8.000 5.997 ZM 21.556 20.139 C 20.775 20.920 19.509 20.920 18.728 20.139 L 13.411 14.822 L 14.825 13.408 L 21.556 20.139 ZM 16.000 10.997 L 18.000 10.997 L 18.000 12.997 L 16.000 12.997 L 16.000 10.997 ZM 20.000 10.997 L 22.000 10.997 L 22.000 12.997 L 20.000 12.997 L 20.000 10.997 ZM 6.000 10.997 L 8.000 10.997 L 8.000 12.997 L 6.000 12.997 L 6.000 10.997 ZM 2.000 10.997 L 4.000 10.997 L 4.000 12.997 L 2.000 12.997 L 2.000 10.997 ZM 6.000 19.997 C 7.105 19.997 8.000 19.101 8.000 17.997 C 8.000 16.892 7.105 15.997 6.000 15.997 C 4.895 15.997 4.000 16.892 4.000 17.997 C 4.000 19.101 4.895 19.997 6.000 19.997 Z"),
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
        return _scissorsCutLine!!
    }

private var _scissorsCutLine: ImageVector? = null
