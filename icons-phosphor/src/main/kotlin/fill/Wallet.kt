package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorFillIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 64.000 L 56.000 64.000 C 51.582 64.000 48.000 60.418 48.000 56.000 C 48.000 51.582 51.582 48.000 56.000 48.000 L 192.000 48.000 C 196.418 48.000 200.000 44.418 200.000 40.000 C 200.000 35.582 196.418 32.000 192.000 32.000 L 56.000 32.000 C 42.745 32.000 32.000 42.745 32.000 56.000 L 32.000 184.000 C 32.000 197.255 42.745 208.000 56.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 80.000 C 232.000 71.163 224.837 64.000 216.000 64.000 ZM 180.000 144.000 C 173.373 144.000 168.000 138.627 168.000 132.000 C 168.000 125.373 173.373 120.000 180.000 120.000 C 186.627 120.000 192.000 125.373 192.000 132.000 C 192.000 138.627 186.627 144.000 180.000 144.000 Z"),
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
        return _wallet!!
    }

private var _wallet: ImageVector? = null
