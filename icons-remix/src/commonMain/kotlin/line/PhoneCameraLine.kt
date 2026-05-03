package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PhoneCameraLine: ImageVector
    get() {
        if (_phoneCameraLine != null) return _phoneCameraLine!!
        _phoneCameraLine = remixIcon(
            name = "PhoneCameraLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.803 4.000 C 14.451 4.607 14.203 5.282 14.083 6.000 L 3.000 6.000 L 3.000 18.000 L 21.000 18.000 L 21.000 12.917 C 21.718 12.797 22.393 12.549 23.000 12.197 L 23.000 18.999 C 23.000 19.552 22.560 20.000 21.997 20.000 L 2.002 20.000 C 1.449 20.000 1.000 19.555 1.000 18.999 L 1.000 5.001 C 1.000 4.448 1.439 4.000 2.002 4.000 L 14.803 4.000 ZM 20.000 9.000 C 21.105 9.000 22.000 8.105 22.000 7.000 C 22.000 5.895 21.105 5.000 20.000 5.000 C 18.895 5.000 18.000 5.895 18.000 7.000 C 18.000 8.105 18.895 9.000 20.000 9.000 ZM 20.000 11.000 C 17.791 11.000 16.000 9.209 16.000 7.000 C 16.000 4.791 17.791 3.000 20.000 3.000 C 22.209 3.000 24.000 4.791 24.000 7.000 C 24.000 9.209 22.209 11.000 20.000 11.000 ZM 18.000 13.000 L 20.000 13.000 L 20.000 16.000 L 18.000 16.000 L 18.000 13.000 Z"),
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
        return _phoneCameraLine!!
    }

private var _phoneCameraLine: ImageVector? = null
