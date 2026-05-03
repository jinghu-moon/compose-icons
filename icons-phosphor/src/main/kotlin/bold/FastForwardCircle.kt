package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorBoldIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 128.000 C 196.001 131.645 194.345 135.092 191.500 137.370 L 151.500 169.370 C 147.898 172.254 142.962 172.817 138.803 170.819 C 134.644 168.820 131.999 164.614 132.000 160.000 L 132.000 140.170 L 95.500 169.370 C 91.898 172.254 86.962 172.817 82.803 170.819 C 78.644 168.820 75.999 164.614 76.000 160.000 L 76.000 96.000 C 75.999 91.386 78.644 87.180 82.803 85.181 C 86.962 83.183 91.898 83.746 95.500 86.630 L 132.000 115.830 L 132.000 96.000 C 131.999 91.386 134.644 87.180 138.803 85.181 C 142.962 83.183 147.898 83.746 151.500 86.630 L 191.500 118.630 C 194.345 120.908 196.001 124.355 196.000 128.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 212.000 128.000 C 212.000 81.608 174.392 44.000 128.000 44.000 C 81.608 44.000 44.000 81.608 44.000 128.000 C 44.000 174.392 81.608 212.000 128.000 212.000 C 174.371 211.950 211.950 174.371 212.000 128.000 Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
