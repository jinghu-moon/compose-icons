package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorThinIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 44.170 L 164.000 32.000 C 164.000 20.954 155.046 12.000 144.000 12.000 L 112.000 12.000 C 100.954 12.000 92.000 20.954 92.000 32.000 L 92.000 44.170 C 64.931 46.283 44.032 68.848 44.000 96.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 96.000 C 211.968 68.848 191.069 46.283 164.000 44.170 ZM 112.000 20.000 L 144.000 20.000 C 150.627 20.000 156.000 25.373 156.000 32.000 L 156.000 44.000 L 100.000 44.000 L 100.000 32.000 C 100.000 25.373 105.373 20.000 112.000 20.000 ZM 172.000 164.000 L 84.000 164.000 L 84.000 152.000 C 84.000 145.373 89.373 140.000 96.000 140.000 L 160.000 140.000 C 166.627 140.000 172.000 145.373 172.000 152.000 ZM 84.000 172.000 L 140.000 172.000 L 140.000 184.000 C 140.000 186.209 141.791 188.000 144.000 188.000 C 146.209 188.000 148.000 186.209 148.000 184.000 L 148.000 172.000 L 172.000 172.000 L 172.000 220.000 L 84.000 220.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 180.000 220.000 L 180.000 152.000 C 180.000 140.954 171.046 132.000 160.000 132.000 L 96.000 132.000 C 84.954 132.000 76.000 140.954 76.000 152.000 L 76.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 96.000 C 52.028 71.711 71.711 52.028 96.000 52.000 L 160.000 52.000 C 184.289 52.028 203.972 71.711 204.000 96.000 ZM 148.000 88.000 C 148.000 90.209 146.209 92.000 144.000 92.000 L 112.000 92.000 C 109.791 92.000 108.000 90.209 108.000 88.000 C 108.000 85.791 109.791 84.000 112.000 84.000 L 144.000 84.000 C 146.209 84.000 148.000 85.791 148.000 88.000 Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
