package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorFillIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 207.240 C 181.519 205.066 186.867 202.482 192.000 199.510 L 192.000 240.000 C 192.000 244.418 188.418 248.000 184.000 248.000 C 179.582 248.000 176.000 244.418 176.000 240.000 ZM 187.760 118.810 L 131.760 88.940 C 127.873 86.955 123.112 88.451 121.060 92.304 C 119.008 96.156 120.423 100.943 124.240 103.060 L 171.000 128.000 L 188.000 118.940 ZM 251.760 88.940 L 131.760 24.940 C 129.410 23.688 126.590 23.688 124.240 24.940 L 4.240 88.940 C 1.632 90.330 0.002 93.045 0.002 96.000 C 0.002 98.955 1.632 101.670 4.240 103.060 L 32.000 117.870 L 32.000 166.290 C 31.992 170.220 33.438 174.013 36.060 176.940 C 49.160 191.530 78.510 216.000 128.000 216.000 C 144.409 216.136 160.696 213.163 176.000 207.240 L 176.000 130.670 L 171.000 128.000 L 128.000 150.930 L 43.830 106.000 L 43.830 106.000 L 25.000 96.000 L 128.000 41.070 L 231.000 96.000 L 212.220 106.000 L 212.160 106.000 L 188.000 118.940 C 190.476 120.369 192.001 123.011 192.000 125.870 L 192.000 199.510 C 202.432 193.488 211.859 185.873 219.940 176.940 C 222.562 174.013 224.008 170.220 224.000 166.290 L 224.000 117.870 L 251.760 103.060 C 254.368 101.670 255.997 98.955 255.997 96.000 C 255.997 93.045 254.368 90.330 251.760 88.940 Z"),
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
