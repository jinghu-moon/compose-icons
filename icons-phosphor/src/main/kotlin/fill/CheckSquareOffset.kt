package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorFillIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 200.000 C 77.878 200.002 75.842 199.160 74.340 197.660 L 58.340 181.660 C 55.214 178.534 55.214 173.466 58.340 170.340 C 61.466 167.214 66.534 167.214 69.660 170.340 L 80.000 180.690 L 114.340 146.340 C 117.466 143.214 122.534 143.214 125.660 146.340 C 128.786 149.466 128.786 154.534 125.660 157.660 L 85.660 197.660 C 84.158 199.160 82.122 200.002 80.000 200.000 ZM 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 136.000 200.000 C 131.582 200.000 128.000 196.418 128.000 192.000 C 128.000 187.582 131.582 184.000 136.000 184.000 L 184.000 184.000 L 184.000 72.000 L 72.000 72.000 L 72.000 136.000 C 72.000 140.418 68.418 144.000 64.000 144.000 C 59.582 144.000 56.000 140.418 56.000 136.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
