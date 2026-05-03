package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorDuotoneIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 149.600 143.410 L 157.670 176.000 L 128.000 158.540 L 98.330 176.000 L 106.400 143.410 L 80.000 121.610 L 114.650 118.940 L 128.000 88.000 L 141.350 118.940 L 176.000 121.610 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 72.000 48.000 L 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 L 88.000 48.000 L 168.000 48.000 L 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 L 184.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 176.620 113.640 L 146.780 111.330 L 135.350 84.830 C 134.088 81.892 131.197 79.989 128.000 79.989 C 124.803 79.989 121.912 81.892 120.650 84.830 L 109.220 111.330 L 79.380 113.640 C 76.131 113.896 73.363 116.097 72.381 119.204 C 71.398 122.311 72.399 125.703 74.910 127.780 L 97.430 146.370 L 90.570 174.080 C 89.801 177.204 90.978 180.484 93.557 182.406 C 96.136 184.329 99.616 184.519 102.390 182.890 L 128.000 167.820 L 153.610 182.890 C 156.384 184.519 159.864 184.329 162.443 182.406 C 165.022 180.484 166.199 177.204 165.430 174.080 L 158.570 146.370 L 181.090 127.780 C 183.601 125.703 184.602 122.311 183.619 119.204 C 182.637 116.097 179.869 113.896 176.620 113.640 ZM 144.510 137.240 C 142.135 139.197 141.093 142.342 141.830 145.330 L 145.330 159.450 L 132.060 151.640 C 129.554 150.164 126.446 150.164 123.940 151.640 L 110.670 159.450 L 114.170 145.330 C 114.907 142.342 113.865 139.197 111.490 137.240 L 100.380 128.060 L 115.270 126.910 C 118.230 126.683 120.821 124.835 122.000 122.110 L 128.000 108.190 L 134.000 122.110 C 135.179 124.835 137.770 126.683 140.730 126.910 L 155.620 128.060 Z"),
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
