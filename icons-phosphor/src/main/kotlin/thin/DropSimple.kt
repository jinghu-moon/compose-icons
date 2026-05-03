package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorThinIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.000 50.370 C 158.861 36.349 145.200 23.722 130.270 12.720 C 128.894 11.759 127.066 11.759 125.690 12.720 C 110.774 23.724 97.127 36.351 85.000 50.370 C 58.170 81.210 44.000 113.580 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 113.580 197.830 81.210 171.000 50.370 ZM 128.000 220.000 C 86.045 219.956 52.044 185.955 52.000 144.000 C 52.000 108.100 73.150 76.200 90.900 55.770 C 102.073 42.968 114.501 31.320 128.000 21.000 C 141.500 31.333 153.929 42.994 165.100 55.810 C 182.850 76.200 204.000 108.100 204.000 144.000 C 203.956 185.955 169.955 219.956 128.000 220.000 Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
