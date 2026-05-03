package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorThinIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.720 145.060 C 229.674 144.012 228.136 143.628 226.720 144.060 C 194.228 153.881 158.967 145.029 134.967 121.025 C 110.966 97.022 102.117 61.761 111.940 29.270 C 112.376 27.854 111.993 26.312 110.946 25.264 C 109.898 24.217 108.356 23.834 106.940 24.270 C 86.662 30.492 68.863 42.953 56.080 59.880 C 26.221 99.692 30.180 155.401 65.369 190.591 C 100.559 225.780 156.268 229.739 196.080 199.880 C 213.001 187.091 225.455 169.289 231.670 149.010 C 232.095 147.619 231.732 146.106 230.720 145.060 ZM 191.300 193.530 C 154.672 221.095 103.340 217.489 70.926 185.074 C 38.511 152.660 34.905 101.328 62.470 64.700 C 72.736 51.125 86.530 40.627 102.350 34.350 C 94.991 67.713 105.158 102.525 129.316 126.684 C 153.475 150.842 188.287 161.009 221.650 153.650 C 215.373 169.470 204.875 183.264 191.300 193.530 Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
