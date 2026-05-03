package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorThinIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 68.000 L 56.000 68.000 C 49.373 68.000 44.000 62.627 44.000 56.000 C 44.000 49.373 49.373 44.000 56.000 44.000 L 192.000 44.000 C 194.209 44.000 196.000 42.209 196.000 40.000 C 196.000 37.791 194.209 36.000 192.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 184.000 C 36.000 195.046 44.954 204.000 56.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 80.000 C 228.000 73.373 222.627 68.000 216.000 68.000 ZM 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 L 56.000 196.000 C 49.373 196.000 44.000 190.627 44.000 184.000 L 44.000 72.000 C 47.457 74.606 51.671 76.010 56.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 ZM 188.000 132.000 C 188.000 136.418 184.418 140.000 180.000 140.000 C 175.582 140.000 172.000 136.418 172.000 132.000 C 172.000 127.582 175.582 124.000 180.000 124.000 C 184.418 124.000 188.000 127.582 188.000 132.000 Z"),
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
