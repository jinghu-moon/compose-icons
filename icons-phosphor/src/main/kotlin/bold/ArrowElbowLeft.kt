package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorBoldIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.490 104.490 L 144.490 200.490 C 142.238 202.749 139.180 204.019 135.990 204.019 C 132.800 204.019 129.742 202.749 127.490 200.490 L 36.000 109.000 L 36.000 152.000 C 36.000 158.627 30.627 164.000 24.000 164.000 C 17.373 164.000 12.000 158.627 12.000 152.000 L 12.000 80.000 C 12.000 73.373 17.373 68.000 24.000 68.000 L 96.000 68.000 C 102.627 68.000 108.000 73.373 108.000 80.000 C 108.000 86.627 102.627 92.000 96.000 92.000 L 53.000 92.000 L 136.000 175.000 L 223.510 87.480 C 228.204 82.786 235.816 82.786 240.510 87.480 C 245.204 92.174 245.204 99.786 240.510 104.480 Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
