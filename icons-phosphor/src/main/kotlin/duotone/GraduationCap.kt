package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorDuotoneIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 113.070 L 216.000 166.290 C 216.005 168.245 215.293 170.134 214.000 171.600 C 202.700 184.190 175.100 208.000 128.000 208.000 C 80.900 208.000 53.320 184.190 42.000 171.600 C 40.707 170.134 39.995 168.245 40.000 166.290 L 40.000 113.070 L 128.000 160.000 Z"),
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
        pathData = parseSvgPathData("M 251.760 88.940 L 131.760 24.940 C 129.410 23.688 126.590 23.688 124.240 24.940 L 4.240 88.940 C 1.632 90.330 0.002 93.045 0.002 96.000 C 0.002 98.955 1.632 101.670 4.240 103.060 L 32.000 117.870 L 32.000 166.290 C 31.992 170.220 33.438 174.013 36.060 176.940 C 49.160 191.530 78.510 216.000 128.000 216.000 C 144.409 216.136 160.696 213.163 176.000 207.240 L 176.000 240.000 C 176.000 244.418 179.582 248.000 184.000 248.000 C 188.418 248.000 192.000 244.418 192.000 240.000 L 192.000 199.510 C 202.432 193.488 211.859 185.873 219.940 176.940 C 222.562 174.013 224.008 170.220 224.000 166.290 L 224.000 117.870 L 251.760 103.060 C 254.368 101.670 255.997 98.955 255.997 96.000 C 255.997 93.045 254.368 90.330 251.760 88.940 ZM 128.000 200.000 C 84.730 200.000 59.280 178.860 48.000 166.290 L 48.000 126.400 L 124.240 167.060 C 126.590 168.312 129.410 168.312 131.760 167.060 L 176.000 143.470 L 176.000 189.810 C 163.400 195.690 147.520 200.000 128.000 200.000 ZM 208.000 166.250 C 203.204 171.571 197.839 176.350 192.000 180.500 L 192.000 134.930 L 208.000 126.400 ZM 188.000 118.940 L 187.780 118.810 L 131.780 88.940 C 127.893 86.955 123.132 88.451 121.080 92.304 C 119.028 96.156 120.443 100.943 124.260 103.060 L 171.000 128.000 L 128.000 150.930 L 25.000 96.000 L 128.000 41.070 L 231.000 96.000 Z"),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
