package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorDuotoneIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 94.810 192.000 L 65.360 214.240 C 63.204 215.967 60.309 216.459 57.703 215.541 C 55.097 214.624 53.149 212.427 52.550 209.730 L 40.190 154.100 C 39.650 151.680 40.263 149.146 41.850 147.240 L 72.160 110.910 C 71.000 134.250 76.700 161.430 94.810 192.000 ZM 214.150 147.240 L 183.840 110.910 C 185.050 134.250 179.300 161.430 161.190 192.000 L 190.640 214.240 C 192.796 215.967 195.691 216.459 198.297 215.541 C 200.903 214.624 202.851 212.427 203.450 209.730 L 215.810 154.100 C 216.350 151.680 215.737 149.146 214.150 147.240 Z"),
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
        pathData = parseSvgPathData("M 152.000 224.000 C 152.000 228.418 148.418 232.000 144.000 232.000 L 112.000 232.000 C 107.582 232.000 104.000 228.418 104.000 224.000 C 104.000 219.582 107.582 216.000 112.000 216.000 L 144.000 216.000 C 148.418 216.000 152.000 219.582 152.000 224.000 ZM 128.000 112.000 C 134.627 112.000 140.000 106.627 140.000 100.000 C 140.000 93.373 134.627 88.000 128.000 88.000 C 121.373 88.000 116.000 93.373 116.000 100.000 C 116.000 106.627 121.373 112.000 128.000 112.000 ZM 223.620 155.830 L 211.260 211.460 C 210.068 216.830 206.201 221.211 201.021 223.061 C 195.841 224.911 190.074 223.970 185.750 220.570 L 158.510 200.000 L 97.510 200.000 L 70.250 220.570 C 65.926 223.970 60.159 224.911 54.979 223.061 C 49.799 221.211 45.932 216.830 44.740 211.460 L 32.380 155.830 C 31.318 150.993 32.542 145.935 35.700 142.120 L 64.260 107.860 C 65.219 95.269 68.109 82.901 72.830 71.190 C 85.730 38.850 108.830 18.560 118.200 11.340 C 123.969 6.870 132.031 6.870 137.800 11.340 C 147.140 18.560 170.270 38.850 183.170 71.190 C 187.891 82.901 190.781 95.269 191.740 107.860 L 220.300 142.120 C 223.458 145.935 224.682 150.993 223.620 155.830 ZM 99.430 184.000 L 156.570 184.000 C 177.690 146.460 181.640 110.520 168.310 77.120 C 156.550 47.640 134.490 29.000 128.000 24.000 C 121.490 29.000 99.430 47.640 87.670 77.120 C 74.360 110.520 78.310 146.460 99.430 184.000 ZM 84.430 189.850 Q 68.280 160.500 64.830 132.160 L 48.000 152.360 L 60.360 208.000 L 60.540 207.870 ZM 208.000 152.360 L 191.170 132.160 Q 187.750 160.440 171.610 189.850 L 195.460 207.850 L 195.640 207.980 Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
