package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorFillIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.540 86.660 L 52.480 32.660 C 47.649 31.251 42.436 32.197 38.408 35.214 C 34.380 38.231 32.006 42.967 32.000 48.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 C 49.530 208.001 51.052 207.782 52.520 207.350 L 136.000 181.730 L 136.000 192.000 C 136.000 200.837 143.163 208.000 152.000 208.000 L 184.000 208.000 C 192.837 208.000 200.000 200.837 200.000 192.000 L 200.000 162.100 L 228.540 153.350 C 235.322 151.312 239.974 145.081 240.000 138.000 L 240.000 102.000 C 239.969 94.923 235.318 88.696 228.540 86.660 ZM 184.000 192.000 L 152.000 192.000 L 152.000 176.820 L 184.000 167.000 ZM 224.000 138.000 L 223.890 138.000 L 152.000 160.080 L 152.000 79.910 L 223.890 102.000 L 224.000 102.000 L 224.000 138.000 Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
