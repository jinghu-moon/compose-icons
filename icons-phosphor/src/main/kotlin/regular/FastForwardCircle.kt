package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorRegularIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 196.800 121.600 L 148.800 85.600 C 146.376 83.782 143.133 83.489 140.422 84.845 C 137.712 86.200 136.000 88.970 136.000 92.000 L 136.000 164.000 C 136.000 167.030 137.712 169.800 140.422 171.155 C 143.133 172.511 146.376 172.218 148.800 170.400 L 196.800 134.400 C 198.814 132.889 200.000 130.518 200.000 128.000 C 200.000 125.482 198.814 123.111 196.800 121.600 ZM 152.000 148.000 L 152.000 108.000 L 178.670 128.000 ZM 132.800 121.600 L 84.800 85.600 C 82.376 83.782 79.133 83.489 76.422 84.845 C 73.712 86.200 72.000 88.970 72.000 92.000 L 72.000 164.000 C 72.000 167.030 73.712 169.800 76.422 171.155 C 79.133 172.511 82.376 172.218 84.800 170.400 L 132.800 134.400 C 134.814 132.889 136.000 130.518 136.000 128.000 C 136.000 125.482 134.814 123.111 132.800 121.600 ZM 88.000 148.000 L 88.000 108.000 L 114.670 128.000 Z"),
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
