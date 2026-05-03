package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorFillIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 208.000 136.000 L 188.640 136.000 L 159.000 188.000 C 157.567 190.482 154.916 192.008 152.050 192.000 L 151.590 192.000 C 148.561 191.824 145.893 189.949 144.700 187.160 L 103.000 89.920 L 79.000 132.000 C 77.558 134.498 74.884 136.026 72.000 136.000 L 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 C 40.000 123.582 43.582 120.000 48.000 120.000 L 67.360 120.000 L 97.050 68.000 C 98.556 65.365 101.424 63.809 104.454 63.982 C 107.484 64.156 110.155 66.030 111.350 68.820 L 153.000 166.080 L 177.000 124.030 C 178.433 121.548 181.084 120.022 183.950 120.030 L 207.950 120.030 C 212.368 120.030 215.950 123.612 215.950 128.030 C 215.950 132.448 212.368 136.030 207.950 136.030 Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
