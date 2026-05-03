package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorLightIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 182.000 34.000 L 182.000 24.000 C 182.000 20.686 179.314 18.000 176.000 18.000 C 172.686 18.000 170.000 20.686 170.000 24.000 L 170.000 34.000 L 86.000 34.000 L 86.000 24.000 C 86.000 20.686 83.314 18.000 80.000 18.000 C 76.686 18.000 74.000 20.686 74.000 24.000 L 74.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 74.000 46.000 L 74.000 56.000 C 74.000 59.314 76.686 62.000 80.000 62.000 C 83.314 62.000 86.000 59.314 86.000 56.000 L 86.000 46.000 L 170.000 46.000 L 170.000 56.000 C 170.000 59.314 172.686 62.000 176.000 62.000 C 179.314 62.000 182.000 59.314 182.000 56.000 L 182.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 176.460 115.630 L 145.460 113.230 L 133.510 85.620 C 132.556 83.432 130.397 82.018 128.010 82.018 C 125.623 82.018 123.464 83.432 122.510 85.620 L 110.600 113.230 L 79.600 115.630 C 77.160 115.817 75.078 117.468 74.339 119.801 C 73.600 122.134 74.352 124.682 76.240 126.240 L 99.730 145.630 L 92.570 174.560 C 91.990 176.905 92.873 179.368 94.809 180.811 C 96.746 182.255 99.359 182.396 101.440 181.170 L 128.000 165.500 L 154.620 181.170 C 156.701 182.396 159.314 182.255 161.251 180.811 C 163.187 179.368 164.070 176.905 163.490 174.560 L 156.330 145.630 L 179.820 126.240 C 181.708 124.682 182.460 122.134 181.721 119.801 C 180.982 117.468 178.900 115.817 176.460 115.630 ZM 145.780 138.780 C 144.002 140.250 143.224 142.610 143.780 144.850 L 148.410 163.590 L 131.000 153.370 C 129.123 152.267 126.797 152.267 124.920 153.370 L 107.550 163.590 L 112.180 144.850 C 112.736 142.610 111.958 140.250 110.180 138.780 L 95.280 126.450 L 115.110 124.920 C 117.315 124.731 119.237 123.343 120.110 121.310 L 128.000 103.140 L 135.840 121.310 C 136.713 123.343 138.635 124.731 140.840 124.920 L 160.670 126.450 Z"),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
