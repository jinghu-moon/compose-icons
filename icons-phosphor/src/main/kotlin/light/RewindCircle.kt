package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorLightIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 174.680 86.630 C 172.648 85.616 170.217 85.837 168.400 87.200 L 122.000 122.000 L 122.000 92.000 C 122.000 89.727 120.716 87.650 118.683 86.633 C 116.651 85.617 114.218 85.836 112.400 87.200 L 64.400 123.200 C 62.889 124.333 62.000 126.111 62.000 128.000 C 62.000 129.889 62.889 131.667 64.400 132.800 L 112.400 168.800 C 114.218 170.164 116.651 170.383 118.683 169.367 C 120.716 168.350 122.000 166.273 122.000 164.000 L 122.000 134.000 L 168.400 168.800 C 170.218 170.164 172.651 170.383 174.683 169.367 C 176.716 168.350 178.000 166.273 178.000 164.000 L 178.000 92.000 C 178.001 89.725 176.715 87.646 174.680 86.630 ZM 110.000 152.000 L 78.000 128.000 L 110.000 104.000 ZM 166.000 152.000 L 134.000 128.000 L 166.000 104.000 Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
