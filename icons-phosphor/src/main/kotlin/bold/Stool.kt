package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorBoldIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 64.000 L 204.000 40.000 C 204.000 28.954 195.046 20.000 184.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 64.000 C 52.000 75.046 60.954 84.000 72.000 84.000 L 74.000 84.000 L 52.150 222.130 C 51.370 226.414 52.972 230.785 56.336 233.551 C 59.700 236.316 64.298 237.042 68.351 235.447 C 72.403 233.852 75.273 230.187 75.850 225.870 L 83.100 180.000 L 172.900 180.000 L 180.150 225.870 C 180.727 230.187 183.597 233.852 187.649 235.447 C 191.702 237.042 196.300 236.316 199.664 233.551 C 203.028 230.785 204.630 226.414 203.850 222.130 L 182.000 84.000 L 184.000 84.000 C 195.046 84.000 204.000 75.046 204.000 64.000 ZM 76.000 44.000 L 180.000 44.000 L 180.000 60.000 L 76.000 60.000 ZM 169.110 156.000 L 86.890 156.000 L 98.250 84.000 L 157.750 84.000 Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
