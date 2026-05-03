package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorThinIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 44.000 L 72.000 44.000 C 43.295 44.033 20.033 67.295 20.000 96.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 96.000 C 235.967 67.295 212.705 44.033 184.000 44.000 ZM 228.000 96.000 L 228.000 108.000 L 188.000 108.000 L 188.000 52.190 C 210.640 54.285 227.968 73.263 228.000 96.000 ZM 140.000 140.000 L 116.000 140.000 L 116.000 100.000 L 140.000 100.000 ZM 112.000 148.000 L 144.000 148.000 C 146.209 148.000 148.000 146.209 148.000 144.000 L 148.000 116.000 L 180.000 116.000 L 180.000 196.000 L 76.000 196.000 L 76.000 116.000 L 108.000 116.000 L 108.000 144.000 C 108.000 146.209 109.791 148.000 112.000 148.000 ZM 148.000 108.000 L 148.000 96.000 C 148.000 93.791 146.209 92.000 144.000 92.000 L 112.000 92.000 C 109.791 92.000 108.000 93.791 108.000 96.000 L 108.000 108.000 L 76.000 108.000 L 76.000 52.000 L 180.000 52.000 L 180.000 108.000 ZM 68.000 52.190 L 68.000 108.000 L 28.000 108.000 L 28.000 96.000 C 28.032 73.263 45.360 54.285 68.000 52.190 ZM 28.000 192.000 L 28.000 116.000 L 68.000 116.000 L 68.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 ZM 224.000 196.000 L 188.000 196.000 L 188.000 116.000 L 228.000 116.000 L 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
