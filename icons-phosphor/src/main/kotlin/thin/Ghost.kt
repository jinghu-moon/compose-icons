package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorThinIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 116.000 C 108.000 120.418 104.418 124.000 100.000 124.000 C 95.582 124.000 92.000 120.418 92.000 116.000 C 92.000 111.582 95.582 108.000 100.000 108.000 C 104.418 108.000 108.000 111.582 108.000 116.000 ZM 156.000 108.000 C 151.582 108.000 148.000 111.582 148.000 116.000 C 148.000 120.418 151.582 124.000 156.000 124.000 C 160.418 124.000 164.000 120.418 164.000 116.000 C 164.000 111.582 160.418 108.000 156.000 108.000 ZM 220.000 120.000 L 220.000 216.000 C 220.001 217.545 219.111 218.953 217.715 219.615 C 216.320 220.278 214.667 220.077 213.470 219.100 L 186.670 197.170 L 159.870 219.100 C 158.396 220.308 156.274 220.308 154.800 219.100 L 128.000 197.170 L 101.200 219.100 C 99.726 220.308 97.604 220.308 96.130 219.100 L 69.330 197.170 L 42.530 219.100 C 41.333 220.077 39.680 220.278 38.285 219.615 C 36.889 218.953 35.999 217.545 36.000 216.000 L 36.000 120.000 C 36.000 69.190 77.190 28.000 128.000 28.000 C 178.810 28.000 220.000 69.190 220.000 120.000 ZM 212.000 120.000 C 212.000 73.608 174.392 36.000 128.000 36.000 C 81.608 36.000 44.000 73.608 44.000 120.000 L 44.000 207.560 L 66.800 188.900 C 68.274 187.692 70.396 187.692 71.870 188.900 L 98.670 210.830 L 125.470 188.900 C 126.942 187.698 129.058 187.698 130.530 188.900 L 157.330 210.830 L 184.130 188.900 C 185.604 187.692 187.726 187.692 189.200 188.900 L 212.000 207.560 Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
