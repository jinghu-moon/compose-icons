package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorThinIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 220.000 128.000 C 220.000 138.160 197.740 149.210 162.890 153.800 C 163.610 145.620 164.000 137.000 164.000 128.000 C 164.000 86.840 155.930 53.000 143.720 37.350 C 187.778 45.049 219.944 83.275 220.000 128.000 ZM 128.000 36.000 C 141.240 36.000 156.000 73.780 156.000 128.000 C 156.000 137.450 155.540 146.390 154.730 154.730 C 146.390 155.540 137.450 156.000 128.000 156.000 C 73.780 156.000 36.000 141.240 36.000 128.000 C 36.055 77.213 77.213 36.055 128.000 36.000 ZM 37.350 143.720 C 53.000 155.930 86.840 164.000 128.000 164.000 C 137.000 164.000 145.620 163.610 153.800 162.890 C 149.210 197.740 138.160 220.000 128.000 220.000 C 83.275 219.944 45.049 187.778 37.350 143.720 ZM 143.720 218.650 C 152.350 207.590 158.910 187.430 162.020 162.020 C 187.430 158.910 207.590 152.350 218.650 143.720 C 211.946 181.984 181.984 211.946 143.720 218.650 Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
