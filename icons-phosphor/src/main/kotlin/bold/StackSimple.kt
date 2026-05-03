package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorBoldIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.050 110.420 L 122.050 174.420 C 125.737 176.525 130.263 176.525 133.950 174.420 L 245.950 110.420 C 249.690 108.284 251.998 104.307 251.998 100.000 C 251.998 95.693 249.690 91.716 245.950 89.580 L 133.950 25.580 C 130.263 23.475 125.737 23.475 122.050 25.580 L 10.050 89.580 C 6.310 91.716 4.002 95.693 4.002 100.000 C 4.002 104.307 6.310 108.284 10.050 110.420 ZM 128.050 49.820 L 215.810 100.000 L 128.000 150.180 L 40.190 100.000 ZM 250.470 142.050 C 253.756 147.805 251.754 155.134 246.000 158.420 L 134.000 222.420 C 130.313 224.525 125.787 224.525 122.100 222.420 L 10.100 158.420 C 6.321 156.323 3.962 152.355 3.924 148.034 C 3.886 143.712 6.175 139.704 9.916 137.540 C 13.658 135.376 18.273 135.392 22.000 137.580 L 128.000 198.180 L 234.000 137.580 C 236.768 135.986 240.057 135.562 243.139 136.401 C 246.221 137.240 248.842 139.273 250.420 142.050 Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
