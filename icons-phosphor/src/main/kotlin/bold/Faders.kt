package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorBoldIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 124.000 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 124.000 C 116.000 117.373 121.373 112.000 128.000 112.000 C 134.627 112.000 140.000 117.373 140.000 124.000 ZM 200.000 192.000 C 193.373 192.000 188.000 197.373 188.000 204.000 L 188.000 216.000 C 188.000 222.627 193.373 228.000 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 204.000 C 212.000 197.373 206.627 192.000 200.000 192.000 ZM 224.000 152.000 L 212.000 152.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 C 193.373 28.000 188.000 33.373 188.000 40.000 L 188.000 152.000 L 176.000 152.000 C 169.373 152.000 164.000 157.373 164.000 164.000 C 164.000 170.627 169.373 176.000 176.000 176.000 L 224.000 176.000 C 230.627 176.000 236.000 170.627 236.000 164.000 C 236.000 157.373 230.627 152.000 224.000 152.000 ZM 56.000 160.000 C 49.373 160.000 44.000 165.373 44.000 172.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 C 62.627 228.000 68.000 222.627 68.000 216.000 L 68.000 172.000 C 68.000 165.373 62.627 160.000 56.000 160.000 ZM 80.000 120.000 L 68.000 120.000 L 68.000 40.000 C 68.000 33.373 62.627 28.000 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 120.000 L 32.000 120.000 C 25.373 120.000 20.000 125.373 20.000 132.000 C 20.000 138.627 25.373 144.000 32.000 144.000 L 80.000 144.000 C 86.627 144.000 92.000 138.627 92.000 132.000 C 92.000 125.373 86.627 120.000 80.000 120.000 ZM 152.000 72.000 L 140.000 72.000 L 140.000 40.000 C 140.000 33.373 134.627 28.000 128.000 28.000 C 121.373 28.000 116.000 33.373 116.000 40.000 L 116.000 72.000 L 104.000 72.000 C 97.373 72.000 92.000 77.373 92.000 84.000 C 92.000 90.627 97.373 96.000 104.000 96.000 L 152.000 96.000 C 158.627 96.000 164.000 90.627 164.000 84.000 C 164.000 77.373 158.627 72.000 152.000 72.000 Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
