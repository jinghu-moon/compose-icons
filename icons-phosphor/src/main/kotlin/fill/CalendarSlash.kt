package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorFillIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 224.000 187.570 C 224.023 189.244 223.001 190.754 221.440 191.357 C 219.878 191.959 218.107 191.525 217.000 190.270 L 116.800 80.000 L 208.000 80.000 L 208.000 48.000 L 184.000 48.000 L 184.000 56.000 C 184.005 58.215 183.091 60.333 181.476 61.849 C 179.861 63.365 177.690 64.144 175.480 64.000 C 171.203 63.633 167.937 60.022 168.000 55.730 L 168.000 48.000 L 87.710 48.000 L 79.250 38.690 C 78.180 37.513 77.910 35.814 78.560 34.363 C 79.211 32.912 80.660 31.984 82.250 32.000 L 168.000 32.000 L 168.000 24.000 C 167.995 21.785 168.909 19.667 170.524 18.151 C 172.139 16.635 174.310 15.856 176.520 16.000 C 180.797 16.367 184.063 19.978 184.000 24.270 L 184.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 213.920 210.620 C 216.049 212.963 216.596 216.342 215.315 219.237 C 214.034 222.132 211.166 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 C 50.258 31.997 52.412 32.949 53.930 34.620 ZM 73.550 80.000 L 48.000 51.890 L 48.000 80.000 Z"),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
