package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorLightIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 64.000 L 198.000 40.000 C 198.000 32.268 191.732 26.000 184.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 64.000 C 58.000 71.732 64.268 78.000 72.000 78.000 L 81.000 78.000 L 58.070 223.060 C 57.820 224.634 58.206 226.244 59.144 227.533 C 60.083 228.821 61.495 229.684 63.070 229.930 C 64.643 230.177 66.249 229.789 67.536 228.852 C 68.823 227.914 69.684 226.503 69.930 224.930 L 78.000 174.000 L 178.000 174.000 L 186.000 224.930 C 186.516 228.205 189.590 230.441 192.865 229.925 C 196.140 229.409 198.376 226.335 197.860 223.060 L 175.000 78.000 L 184.000 78.000 C 191.732 78.000 198.000 71.732 198.000 64.000 ZM 70.000 64.000 L 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 L 184.000 38.000 C 185.105 38.000 186.000 38.895 186.000 40.000 L 186.000 64.000 C 186.000 65.105 185.105 66.000 184.000 66.000 L 72.000 66.000 C 70.895 66.000 70.000 65.105 70.000 64.000 ZM 176.140 162.000 L 79.860 162.000 L 93.130 78.000 L 162.870 78.000 Z"),
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
