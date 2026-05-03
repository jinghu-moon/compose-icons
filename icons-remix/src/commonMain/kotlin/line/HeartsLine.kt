package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartsLine: ImageVector
    get() {
        if (_heartsLine != null) return _heartsLine!!
        _heartsLine = remixIcon(
            name = "HeartsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.243 4.757 C 20.705 6.223 21.255 8.250 20.892 10.137 C 21.461 10.297 21.999 10.600 22.447 11.045 C 23.851 12.439 23.851 14.699 22.447 16.092 L 17.000 21.500 L 13.978 18.500 L 11.000 21.485 L 2.521 12.993 C 0.417 10.637 0.496 7.019 2.757 4.757 C 5.022 2.493 8.645 2.417 11.001 4.529 C 13.350 2.420 16.980 2.490 19.243 4.757 ZM 12.962 12.465 C 12.346 13.076 12.346 14.061 12.962 14.673 L 17.000 18.682 L 21.038 14.673 C 21.654 14.061 21.654 13.076 21.038 12.465 C 20.414 11.845 19.396 11.845 18.770 12.467 L 16.998 14.221 L 15.591 12.825 L 15.228 12.465 C 14.604 11.845 13.586 11.845 12.962 12.465 ZM 4.172 6.172 C 2.682 7.661 2.607 10.047 3.980 11.623 L 11.000 18.654 L 12.559 17.092 L 11.553 16.092 C 10.149 14.699 10.149 12.439 11.553 11.045 C 12.957 9.652 15.233 9.652 16.637 11.045 L 17.000 11.405 L 17.363 11.045 C 17.788 10.624 18.292 10.330 18.828 10.163 C 19.244 8.796 18.906 7.251 17.827 6.170 C 16.328 4.668 13.908 4.607 12.337 6.017 L 11.002 7.215 L 9.666 6.018 C 8.091 4.606 5.675 4.668 4.172 6.172 Z"),
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
        return _heartsLine!!
    }

private var _heartsLine: ImageVector? = null
