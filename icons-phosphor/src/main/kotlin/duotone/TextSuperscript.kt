package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorDuotoneIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 64.000 L 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 L 40.000 200.000 L 40.000 64.000 C 40.000 55.163 47.163 48.000 56.000 48.000 L 224.000 48.000 C 232.837 48.000 240.000 55.163 240.000 64.000 Z"),
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
        pathData = parseSvgPathData("M 248.000 144.000 C 248.000 148.418 244.418 152.000 240.000 152.000 L 192.000 152.000 C 188.970 152.000 186.200 150.288 184.845 147.578 C 183.489 144.867 183.782 141.624 185.600 139.200 L 228.770 81.650 C 232.546 76.618 233.023 69.840 229.988 64.329 C 226.953 58.818 220.971 55.597 214.699 56.098 C 208.428 56.598 203.032 60.727 200.910 66.650 C 199.438 70.817 194.867 73.002 190.700 71.530 C 186.533 70.058 184.348 65.487 185.820 61.320 C 190.030 49.445 200.815 41.146 213.372 40.119 C 225.929 39.092 237.920 45.528 244.003 56.561 C 250.087 67.594 249.130 81.169 241.560 91.240 L 208.000 136.000 L 240.000 136.000 C 244.418 136.000 248.000 139.582 248.000 144.000 ZM 149.240 74.000 C 147.637 72.608 145.547 71.910 143.429 72.060 C 141.312 72.210 139.341 73.196 137.950 74.800 L 92.000 127.790 L 46.050 74.790 C 43.075 71.863 38.350 71.714 35.197 74.448 C 32.044 77.182 31.523 81.881 34.000 85.240 L 81.410 140.000 L 34.000 194.760 C 31.106 198.101 31.469 203.156 34.810 206.050 C 38.151 208.944 43.206 208.581 46.100 205.240 L 92.100 152.240 L 138.050 205.240 C 140.944 208.581 145.999 208.944 149.340 206.050 C 152.681 203.156 153.044 198.101 150.150 194.760 L 102.590 140.000 L 150.050 85.240 C 152.912 81.907 152.551 76.889 149.240 74.000 Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
