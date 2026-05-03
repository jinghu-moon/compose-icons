package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) return _arrowFatLineUp!!
        _arrowFatLineUp = phosphorBoldIcon(
            name = "ArrowFatLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.480 111.510 L 136.480 15.510 C 134.228 13.251 131.170 11.981 127.980 11.981 C 124.790 11.981 121.732 13.251 119.480 15.510 L 23.480 111.510 C 20.040 114.946 19.013 120.118 20.880 124.607 C 22.747 129.097 27.138 132.016 32.000 132.000 L 68.000 132.000 L 68.000 176.000 C 68.000 182.627 73.373 188.000 80.000 188.000 L 176.000 188.000 C 182.627 188.000 188.000 182.627 188.000 176.000 L 188.000 132.000 L 224.000 132.000 C 228.855 132.000 233.231 129.075 235.087 124.589 C 236.944 120.103 235.915 114.941 232.480 111.510 ZM 176.000 108.000 C 169.373 108.000 164.000 113.373 164.000 120.000 L 164.000 164.000 L 92.000 164.000 L 92.000 120.000 C 92.000 113.373 86.627 108.000 80.000 108.000 L 61.000 108.000 L 128.000 41.000 L 195.000 108.000 ZM 188.000 216.000 C 188.000 222.627 182.627 228.000 176.000 228.000 L 80.000 228.000 C 73.373 228.000 68.000 222.627 68.000 216.000 C 68.000 209.373 73.373 204.000 80.000 204.000 L 176.000 204.000 C 182.627 204.000 188.000 209.373 188.000 216.000 Z"),
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
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
