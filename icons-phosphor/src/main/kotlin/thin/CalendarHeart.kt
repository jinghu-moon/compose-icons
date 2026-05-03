package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorThinIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 180.000 36.000 L 180.000 24.000 C 180.000 21.791 178.209 20.000 176.000 20.000 C 173.791 20.000 172.000 21.791 172.000 24.000 L 172.000 36.000 L 84.000 36.000 L 84.000 24.000 C 84.000 21.791 82.209 20.000 80.000 20.000 C 77.791 20.000 76.000 21.791 76.000 24.000 L 76.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 76.000 44.000 L 76.000 56.000 C 76.000 58.209 77.791 60.000 80.000 60.000 C 82.209 60.000 84.000 58.209 84.000 56.000 L 84.000 44.000 L 172.000 44.000 L 172.000 56.000 C 172.000 58.209 173.791 60.000 176.000 60.000 C 178.209 60.000 180.000 58.209 180.000 56.000 L 180.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 152.000 92.000 C 142.169 92.003 133.059 97.161 128.000 105.590 C 121.520 94.807 108.645 89.670 96.523 93.029 C 84.400 96.389 76.005 107.420 76.000 120.000 C 76.000 134.510 84.560 149.000 101.440 163.070 C 109.102 169.417 117.403 174.950 126.210 179.580 C 127.337 180.144 128.663 180.144 129.790 179.580 C 138.597 174.950 146.898 169.417 154.560 163.070 C 171.440 149.000 180.000 134.510 180.000 120.000 C 180.000 104.536 167.464 92.000 152.000 92.000 ZM 128.000 171.470 C 119.540 166.830 84.000 145.800 84.000 120.000 C 84.000 108.954 92.954 100.000 104.000 100.000 C 115.046 100.000 124.000 108.954 124.000 120.000 C 124.000 122.209 125.791 124.000 128.000 124.000 C 130.209 124.000 132.000 122.209 132.000 120.000 C 132.000 108.954 140.954 100.000 152.000 100.000 C 163.046 100.000 172.000 108.954 172.000 120.000 C 172.000 145.800 136.460 166.830 128.000 171.470 Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
