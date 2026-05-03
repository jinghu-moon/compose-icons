package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorBoldIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 104.490 C 222.238 106.749 219.180 108.019 215.990 108.019 C 212.800 108.019 209.742 106.749 207.490 104.490 L 180.000 77.000 L 180.000 192.000 C 180.000 198.627 174.627 204.000 168.000 204.000 L 24.000 204.000 C 17.373 204.000 12.000 198.627 12.000 192.000 C 12.000 185.373 17.373 180.000 24.000 180.000 L 156.000 180.000 L 156.000 77.000 L 128.490 104.520 C 123.796 109.214 116.184 109.214 111.490 104.520 C 106.796 99.826 106.796 92.214 111.490 87.520 L 159.490 39.520 C 161.742 37.261 164.800 35.991 167.990 35.991 C 171.180 35.991 174.238 37.261 176.490 39.520 L 224.490 87.520 C 229.176 92.206 229.176 99.804 224.490 104.490 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
