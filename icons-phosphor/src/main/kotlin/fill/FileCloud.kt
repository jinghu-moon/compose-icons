package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorFillIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 181.000 C 159.423 209.314 136.320 231.973 108.000 232.000 L 60.720 232.000 C 40.870 232.000 24.000 215.770 24.000 195.920 C 24.034 182.568 31.455 170.331 43.280 164.130 C 44.645 163.419 46.297 163.555 47.528 164.479 C 48.759 165.402 49.351 166.951 49.050 168.460 C 48.389 172.140 48.055 175.871 48.050 179.610 C 47.944 183.948 51.227 187.621 55.550 188.000 C 57.749 188.124 59.901 187.336 61.500 185.822 C 63.099 184.308 64.003 182.202 64.000 180.000 C 63.987 173.095 65.478 166.270 68.370 160.000 L 68.370 160.000 C 77.847 139.309 100.550 128.116 122.733 133.200 C 144.916 138.284 160.480 158.247 160.000 181.000 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 176.000 232.000 C 171.582 232.000 168.000 228.418 168.000 224.000 C 168.000 219.582 171.582 216.000 176.000 216.000 L 200.000 216.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 128.000 C 56.000 132.418 52.418 136.000 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 188.690 80.000 L 160.000 51.310 L 160.000 80.000 Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
