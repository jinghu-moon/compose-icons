package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Scissors2Fill: ImageVector
    get() {
        if (_scissors2Fill != null) return _scissors2Fill!!
        _scissors2Fill = remixIcon(
            name = "Scissors2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 14.118 L 9.683 16.434 C 9.887 16.914 10.000 17.442 10.000 17.997 C 10.000 20.206 8.209 21.997 6.000 21.997 C 3.791 21.997 2.000 20.206 2.000 17.997 C 2.000 15.788 3.791 13.997 6.000 13.997 C 6.554 13.997 7.082 14.109 7.562 14.313 L 9.879 11.997 L 4.211 6.329 C 3.430 5.548 3.430 4.282 4.211 3.501 L 4.919 2.794 L 12.000 9.875 L 19.081 2.794 L 19.789 3.501 C 20.570 4.282 20.570 5.548 19.789 6.329 L 14.121 11.997 L 16.438 14.313 C 16.918 14.109 17.446 13.997 18.000 13.997 C 20.209 13.997 22.000 15.788 22.000 17.997 C 22.000 20.206 20.209 21.997 18.000 21.997 C 15.791 21.997 14.000 20.206 14.000 17.997 C 14.000 17.442 14.113 16.914 14.316 16.434 L 12.000 14.118 ZM 6.000 19.997 C 7.105 19.997 8.000 19.101 8.000 17.997 C 8.000 16.892 7.105 15.997 6.000 15.997 C 4.895 15.997 4.000 16.892 4.000 17.997 C 4.000 19.101 4.895 19.997 6.000 19.997 ZM 18.000 19.997 C 19.105 19.997 20.000 19.101 20.000 17.997 C 20.000 16.892 19.105 15.997 18.000 15.997 C 16.895 15.997 16.000 16.892 16.000 17.997 C 16.000 19.101 16.895 19.997 18.000 19.997 Z"),
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
        return _scissors2Fill!!
    }

private var _scissors2Fill: ImageVector? = null
