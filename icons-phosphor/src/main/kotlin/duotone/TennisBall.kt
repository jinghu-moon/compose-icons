package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorDuotoneIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 60.120 60.090 C 78.070 42.115 102.427 32.010 127.830 32.000 L 127.830 32.000 C 127.725 84.869 84.869 127.689 32.000 127.750 C 32.020 102.358 42.137 78.016 60.120 60.090 ZM 32.000 127.920 L 32.000 127.750 L 32.000 127.750 ZM 156.280 156.180 C 138.293 174.099 128.179 198.441 128.170 223.830 C 181.025 223.737 223.862 180.935 224.000 128.080 L 224.000 128.080 C 198.593 128.095 174.234 138.203 156.280 156.180 ZM 128.170 224.000 L 128.170 223.830 L 128.170 223.830 Z"),
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
        pathData = parseSvgPathData("M 201.570 54.460 C 160.955 13.846 95.107 13.847 54.492 54.461 C 13.878 95.076 13.878 160.924 54.492 201.539 C 95.107 242.153 160.955 242.154 201.570 201.540 C 221.223 182.115 232.283 155.632 232.283 128.000 C 232.283 100.368 221.223 73.885 201.570 54.460 ZM 65.750 65.770 C 80.150 51.351 99.125 42.401 119.410 40.460 C 117.455 60.745 108.466 79.706 94.000 94.060 C 79.627 108.500 60.661 117.467 40.380 119.410 C 42.338 99.123 51.309 80.153 65.750 65.770 ZM 40.330 135.480 C 64.895 133.519 87.949 122.839 105.330 105.370 C 122.810 87.994 133.497 64.939 135.460 40.370 C 178.166 43.930 212.058 77.806 215.640 120.510 C 164.927 124.663 124.665 164.899 120.480 215.610 C 77.774 212.050 43.882 178.174 40.300 135.470 ZM 190.250 190.230 C 175.847 204.645 156.874 213.594 136.590 215.540 C 140.709 173.743 173.791 140.683 215.590 136.590 C 213.641 156.873 204.680 175.842 190.250 190.230 Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
