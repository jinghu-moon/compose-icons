package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorLightIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.230 101.570 L 137.630 130.570 L 188.740 196.280 C 190.772 198.898 190.298 202.668 187.680 204.700 C 185.062 206.732 181.292 206.258 179.260 203.640 L 128.000 137.770 L 76.740 203.680 C 74.708 206.298 70.938 206.772 68.320 204.740 C 65.702 202.708 65.228 198.938 67.260 196.320 L 118.370 130.610 L 45.770 101.610 C 43.763 100.825 42.332 99.024 42.020 96.892 C 41.708 94.760 42.563 92.624 44.260 91.297 C 45.957 89.969 48.236 89.654 50.230 90.470 L 122.000 119.140 L 122.000 40.000 C 122.000 36.686 124.686 34.000 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 L 134.000 119.140 L 205.770 90.430 C 207.764 89.614 210.043 89.929 211.740 91.257 C 213.437 92.584 214.292 94.720 213.980 96.852 C 213.668 98.984 212.237 100.785 210.230 101.570 Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
