package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorBoldIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.000 187.130 L 191.000 43.130 C 189.070 38.784 184.756 35.987 180.000 36.000 L 76.000 36.000 C 71.352 36.005 67.125 38.693 65.150 42.900 C 65.106 42.974 65.066 43.051 65.030 43.130 L 65.000 43.300 L 65.000 43.300 L 1.000 187.130 C -0.651 190.847 -0.306 195.147 1.915 198.554 C 4.137 201.961 7.933 204.011 12.000 204.000 L 244.000 204.000 C 248.067 204.011 251.863 201.961 254.085 198.554 C 256.306 195.147 256.651 190.847 255.000 187.130 ZM 64.000 104.550 L 64.000 180.000 L 30.460 180.000 ZM 88.000 180.000 L 88.000 104.550 L 121.540 180.000 ZM 147.800 180.000 L 94.470 60.000 L 172.200 60.000 L 225.540 180.000 Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
