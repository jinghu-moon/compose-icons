package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scissors2Line: ImageVector
    get() {
        if (_scissors2Line != null) return _scissors2Line!!
        _scissors2Line = remixIcon(
            name = "Scissors2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 13.411 L 9.446 15.965 C 9.798 16.560 10.000 17.255 10.000 17.997 C 10.000 20.206 8.209 21.997 6.000 21.997 C 3.791 21.997 2.000 20.206 2.000 17.997 C 2.000 15.787 3.791 13.997 6.000 13.997 C 6.742 13.997 7.436 14.198 8.032 14.550 L 10.586 11.997 L 4.565 5.976 C 3.784 5.195 3.784 3.928 4.565 3.147 L 12.000 10.582 L 19.435 3.147 C 20.216 3.928 20.216 5.195 19.435 5.976 L 13.414 11.997 L 15.968 14.550 C 16.563 14.198 17.258 13.997 18.000 13.997 C 20.209 13.997 22.000 15.787 22.000 17.997 C 22.000 20.206 20.209 21.997 18.000 21.997 C 15.791 21.997 14.000 20.206 14.000 17.997 C 14.000 17.255 14.202 16.560 14.554 15.965 L 12.000 13.411 ZM 6.000 19.997 C 7.105 19.997 8.000 19.101 8.000 17.997 C 8.000 16.892 7.105 15.997 6.000 15.997 C 4.895 15.997 4.000 16.892 4.000 17.997 C 4.000 19.101 4.895 19.997 6.000 19.997 ZM 18.000 19.997 C 19.105 19.997 20.000 19.101 20.000 17.997 C 20.000 16.892 19.105 15.997 18.000 15.997 C 16.895 15.997 16.000 16.892 16.000 17.997 C 16.000 19.101 16.895 19.997 18.000 19.997 Z"),
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
        return _scissors2Line!!
    }

private var _scissors2Line: ImageVector? = null
