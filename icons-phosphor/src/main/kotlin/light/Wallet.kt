package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = phosphorLightIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 66.000 L 56.000 66.000 C 50.477 66.000 46.000 61.523 46.000 56.000 C 46.000 50.477 50.477 46.000 56.000 46.000 L 192.000 46.000 C 195.314 46.000 198.000 43.314 198.000 40.000 C 198.000 36.686 195.314 34.000 192.000 34.000 L 56.000 34.000 C 43.850 34.000 34.000 43.850 34.000 56.000 L 34.000 184.000 C 34.000 196.150 43.850 206.000 56.000 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 80.000 C 230.000 72.268 223.732 66.000 216.000 66.000 ZM 218.000 192.000 C 218.000 193.105 217.105 194.000 216.000 194.000 L 56.000 194.000 C 50.477 194.000 46.000 189.523 46.000 184.000 L 46.000 75.590 C 49.094 77.178 52.522 78.004 56.000 78.000 L 216.000 78.000 C 217.105 78.000 218.000 78.895 218.000 80.000 ZM 190.000 132.000 C 190.000 137.523 185.523 142.000 180.000 142.000 C 174.477 142.000 170.000 137.523 170.000 132.000 C 170.000 126.477 174.477 122.000 180.000 122.000 C 185.523 122.000 190.000 126.477 190.000 132.000 Z"),
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
