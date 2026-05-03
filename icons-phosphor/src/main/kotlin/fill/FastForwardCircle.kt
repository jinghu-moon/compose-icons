package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorFillIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 196.800 134.400 L 148.800 170.400 C 147.415 171.439 145.731 172.000 144.000 172.000 C 139.582 172.000 136.000 168.418 136.000 164.000 L 136.000 128.000 C 136.000 130.518 134.814 132.889 132.800 134.400 L 84.800 170.400 C 83.415 171.439 81.731 172.000 80.000 172.000 C 75.582 172.000 72.000 168.418 72.000 164.000 L 72.000 92.000 C 72.000 88.970 73.712 86.200 76.422 84.845 C 79.133 83.489 82.376 83.782 84.800 85.600 L 132.800 121.600 C 134.814 123.111 136.000 125.482 136.000 128.000 L 136.000 92.000 C 136.000 88.970 137.712 86.200 140.422 84.845 C 143.133 83.489 146.376 83.782 148.800 85.600 L 196.800 121.600 C 198.814 123.111 200.000 125.482 200.000 128.000 C 200.000 130.518 198.814 132.889 196.800 134.400 Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
