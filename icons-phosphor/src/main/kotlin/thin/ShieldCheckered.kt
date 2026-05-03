package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorThinIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 44.000 L 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 112.000 C 36.000 163.160 60.730 194.120 81.470 211.100 C 103.870 229.420 126.020 235.600 126.950 235.860 C 127.638 236.047 128.362 236.047 129.050 235.860 C 129.980 235.600 152.130 229.420 174.530 211.100 C 195.270 194.100 220.000 163.160 220.000 112.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 212.000 56.000 L 212.000 112.000 Q 212.000 118.120 211.510 124.000 L 132.000 124.000 L 132.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 53.791 212.000 56.000 ZM 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 124.000 52.000 L 124.000 124.000 L 44.490 124.000 Q 44.000 118.120 44.000 112.000 ZM 45.380 132.000 L 124.000 132.000 L 124.000 226.440 C 110.339 221.281 97.604 213.943 86.290 204.710 C 63.270 185.780 49.560 161.380 45.380 132.000 ZM 169.710 204.710 C 158.399 213.947 145.663 221.286 132.000 226.440 L 132.000 132.000 L 210.620 132.000 C 206.440 161.380 192.730 185.780 169.710 204.710 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
