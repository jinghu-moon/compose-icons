package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorFillIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 64.000 L 72.000 56.000 C 72.000 51.582 75.582 48.000 80.000 48.000 C 84.418 48.000 88.000 51.582 88.000 56.000 L 88.000 64.000 C 88.000 68.418 84.418 72.000 80.000 72.000 C 75.582 72.000 72.000 68.418 72.000 64.000 ZM 178.550 124.700 L 154.090 144.890 L 161.550 175.000 C 161.938 176.563 161.351 178.207 160.060 179.170 C 159.367 179.681 158.530 179.957 157.670 179.960 C 156.967 179.956 156.277 179.766 155.670 179.410 L 128.000 163.180 L 100.360 179.450 C 98.965 180.277 97.210 180.180 95.915 179.204 C 94.620 178.229 94.041 176.569 94.450 175.000 L 101.910 144.850 L 77.450 124.700 C 76.187 123.663 75.682 121.961 76.175 120.402 C 76.668 118.844 78.060 117.742 79.690 117.620 L 111.930 115.130 L 124.330 86.420 C 124.964 84.957 126.406 84.011 128.000 84.011 C 129.594 84.011 131.036 84.957 131.670 86.420 L 144.070 115.130 L 176.310 117.620 C 177.940 117.742 179.332 118.844 179.825 120.402 C 180.318 121.961 179.813 123.663 178.550 124.700 ZM 184.000 64.000 C 184.000 68.418 180.418 72.000 176.000 72.000 C 171.582 72.000 168.000 68.418 168.000 64.000 L 168.000 56.000 C 168.000 51.582 171.582 48.000 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 Z"),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
