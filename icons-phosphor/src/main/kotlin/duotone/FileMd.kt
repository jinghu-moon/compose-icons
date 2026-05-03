package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorDuotoneIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 224.000 C 200.000 228.418 203.582 232.000 208.000 232.000 C 212.418 232.000 216.000 228.418 216.000 224.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 144.000 144.000 L 128.000 144.000 C 123.582 144.000 120.000 147.582 120.000 152.000 L 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 L 144.000 216.000 C 163.882 216.000 180.000 199.882 180.000 180.000 C 180.000 160.118 163.882 144.000 144.000 144.000 ZM 144.000 200.000 L 136.000 200.000 L 136.000 160.000 L 144.000 160.000 C 155.046 160.000 164.000 168.954 164.000 180.000 C 164.000 191.046 155.046 200.000 144.000 200.000 ZM 104.000 152.000 L 104.000 208.000 C 104.000 212.418 100.418 216.000 96.000 216.000 C 91.582 216.000 88.000 212.418 88.000 208.000 L 88.000 177.380 L 74.550 196.590 C 73.053 198.725 70.608 199.997 68.000 199.997 C 65.392 199.997 62.947 198.725 61.450 196.590 L 48.000 177.380 L 48.000 208.000 C 48.000 212.418 44.418 216.000 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 152.000 C 32.001 148.510 34.265 145.424 37.593 144.374 C 40.921 143.324 44.546 144.553 46.550 147.410 L 68.000 178.050 L 89.450 147.410 C 91.454 144.553 95.079 143.324 98.407 144.374 C 101.735 145.424 103.999 148.510 104.000 152.000 Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
