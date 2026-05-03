package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorLightIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 191.600 123.200 L 143.600 87.200 C 141.782 85.836 139.349 85.617 137.317 86.633 C 135.284 87.650 134.000 89.727 134.000 92.000 L 134.000 122.000 L 87.600 87.200 C 85.782 85.836 83.349 85.617 81.317 86.633 C 79.284 87.650 78.000 89.727 78.000 92.000 L 78.000 164.000 C 78.000 166.273 79.284 168.350 81.317 169.367 C 83.349 170.383 85.782 170.164 87.600 168.800 L 134.000 134.000 L 134.000 164.000 C 134.000 166.273 135.284 168.350 137.317 169.367 C 139.349 170.383 141.782 170.164 143.600 168.800 L 191.600 132.800 C 193.111 131.667 194.000 129.889 194.000 128.000 C 194.000 126.111 193.111 124.333 191.600 123.200 ZM 90.000 152.000 L 90.000 104.000 L 122.000 128.000 ZM 146.000 152.000 L 146.000 104.000 L 178.000 128.000 Z"),
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
