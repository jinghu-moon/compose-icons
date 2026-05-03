package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorBoldIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.380 68.520 C 228.636 63.179 222.523 59.999 216.000 60.000 L 140.000 60.000 L 140.000 36.000 L 152.000 36.000 C 158.627 36.000 164.000 30.627 164.000 24.000 C 164.000 17.373 158.627 12.000 152.000 12.000 L 104.000 12.000 C 97.373 12.000 92.000 17.373 92.000 24.000 C 92.000 30.627 97.373 36.000 104.000 36.000 L 116.000 36.000 L 116.000 60.000 L 40.000 60.000 C 33.476 59.999 27.362 63.180 23.618 68.523 C 19.875 73.866 18.972 80.698 21.200 86.830 L 47.390 158.830 C 50.276 166.722 57.776 171.979 66.180 172.000 L 92.000 172.000 L 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 C 110.627 244.000 116.000 238.627 116.000 232.000 L 116.000 172.000 L 140.000 172.000 L 140.000 232.000 C 140.000 238.627 145.373 244.000 152.000 244.000 C 158.627 244.000 164.000 238.627 164.000 232.000 L 164.000 172.000 L 189.820 172.000 C 198.224 171.979 205.724 166.722 208.610 158.830 L 234.800 86.830 C 237.028 80.697 236.125 73.863 232.380 68.520 ZM 114.000 148.000 L 102.380 84.000 L 153.620 84.000 L 142.000 148.000 ZM 45.710 84.000 L 78.000 84.000 L 89.640 148.000 L 69.000 148.000 ZM 187.000 148.000 L 166.380 148.000 L 178.000 84.000 L 210.270 84.000 Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
