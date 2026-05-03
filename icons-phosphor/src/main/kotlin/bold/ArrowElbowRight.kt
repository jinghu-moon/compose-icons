package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorBoldIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 80.000 L 244.000 152.000 C 244.000 158.627 238.627 164.000 232.000 164.000 C 225.373 164.000 220.000 158.627 220.000 152.000 L 220.000 109.000 L 128.490 200.520 C 126.238 202.779 123.180 204.049 119.990 204.049 C 116.800 204.049 113.742 202.779 111.490 200.520 L 15.490 104.520 C 10.796 99.826 10.796 92.214 15.490 87.520 C 20.184 82.826 27.796 82.826 32.490 87.520 L 120.000 175.000 L 203.000 92.000 L 160.000 92.000 C 153.373 92.000 148.000 86.627 148.000 80.000 C 148.000 73.373 153.373 68.000 160.000 68.000 L 232.000 68.000 C 238.627 68.000 244.000 73.373 244.000 80.000 Z"),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
