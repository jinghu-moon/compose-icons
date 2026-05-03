package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorBoldIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 136.000 C 196.000 144.837 188.837 152.000 180.000 152.000 C 171.163 152.000 164.000 144.837 164.000 136.000 C 164.000 127.163 171.163 120.000 180.000 120.000 C 188.837 120.000 196.000 127.163 196.000 136.000 ZM 236.000 100.000 L 236.000 180.000 C 236.000 197.673 221.673 212.000 204.000 212.000 L 60.000 212.000 C 42.327 212.000 28.000 197.673 28.000 180.000 L 28.000 60.920 C 27.751 52.275 31.013 43.897 37.041 37.695 C 43.069 31.494 51.351 27.996 60.000 28.000 L 192.000 28.000 C 198.627 28.000 204.000 33.373 204.000 40.000 C 204.000 46.627 198.627 52.000 192.000 52.000 L 60.000 52.000 C 57.832 51.999 55.757 52.877 54.249 54.434 C 52.741 55.991 51.930 58.094 52.000 60.260 L 52.000 60.340 C 52.349 64.738 56.070 68.099 60.480 68.000 L 204.000 68.000 C 221.673 68.000 236.000 82.327 236.000 100.000 ZM 212.000 100.000 C 212.000 95.582 208.418 92.000 204.000 92.000 L 60.480 92.000 C 57.619 92.001 54.769 91.638 52.000 90.920 L 52.000 180.000 C 52.000 184.418 55.582 188.000 60.000 188.000 L 204.000 188.000 C 208.418 188.000 212.000 184.418 212.000 180.000 Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
