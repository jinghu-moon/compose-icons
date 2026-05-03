package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorBoldIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.820 170.800 C 248.821 166.642 244.614 163.998 240.000 164.000 L 148.000 164.000 L 148.000 148.000 L 216.000 148.000 C 220.749 148.000 225.051 145.198 226.973 140.855 C 228.894 136.512 228.074 131.445 224.880 127.930 L 148.000 43.360 L 148.000 12.000 C 147.997 6.957 144.842 2.454 140.103 0.730 C 135.364 -0.995 130.053 0.428 126.810 4.290 L 22.810 128.290 C 19.815 131.862 19.160 136.846 21.130 141.071 C 23.100 145.296 27.338 147.998 32.000 148.000 L 124.000 148.000 L 124.000 164.000 L 16.000 164.000 C 11.386 163.999 7.180 166.644 5.181 170.803 C 3.183 174.962 3.746 179.898 6.630 183.500 L 36.230 220.500 C 40.016 225.252 45.765 228.014 51.840 228.000 L 204.160 228.000 C 210.237 228.011 215.986 225.246 219.770 220.490 L 249.370 183.490 C 252.251 179.890 252.815 174.957 250.820 170.800 ZM 188.870 124.000 L 148.000 124.000 L 148.000 79.000 ZM 57.730 124.000 L 124.000 45.000 L 124.000 124.000 ZM 202.230 204.000 L 53.770 204.000 L 41.000 188.000 L 215.000 188.000 Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
