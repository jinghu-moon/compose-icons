package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorFillIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 64.000 L 72.000 56.000 C 72.000 51.582 75.582 48.000 80.000 48.000 C 84.418 48.000 88.000 51.582 88.000 56.000 L 88.000 64.000 C 88.000 68.418 84.418 72.000 80.000 72.000 C 75.582 72.000 72.000 68.418 72.000 64.000 ZM 154.560 167.070 C 146.898 173.417 138.597 178.950 129.790 183.580 C 128.663 184.144 127.337 184.144 126.210 183.580 C 117.403 178.950 109.102 173.417 101.440 167.070 C 84.560 153.000 76.000 138.510 76.000 124.000 C 76.005 111.420 84.400 100.389 96.523 97.029 C 108.645 93.670 121.520 98.807 128.000 109.590 C 134.480 98.807 147.355 93.670 159.477 97.029 C 171.600 100.389 179.995 111.420 180.000 124.000 C 180.000 138.510 171.440 153.000 154.560 167.070 ZM 184.000 64.000 C 184.000 68.418 180.418 72.000 176.000 72.000 C 171.582 72.000 168.000 68.418 168.000 64.000 L 168.000 56.000 C 168.000 51.582 171.582 48.000 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
