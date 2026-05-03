package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorFillIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 124.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 124.000 C 16.000 121.791 17.791 120.000 20.000 120.000 L 56.000 120.000 L 56.000 184.000 C 55.995 186.217 56.910 188.336 58.527 189.853 C 60.144 191.369 62.318 192.147 64.530 192.000 C 68.805 191.633 72.068 188.021 72.000 183.730 L 72.000 120.000 L 112.000 120.000 L 112.000 140.000 C 112.000 142.209 113.791 144.000 116.000 144.000 L 140.000 144.000 C 142.209 144.000 144.000 142.209 144.000 140.000 L 144.000 120.000 L 184.000 120.000 L 184.000 184.000 C 183.995 186.217 184.910 188.336 186.527 189.853 C 188.144 191.369 190.318 192.147 192.530 192.000 C 196.798 191.633 200.058 188.033 200.000 183.750 L 200.000 120.000 L 236.000 120.000 C 238.209 120.000 240.000 121.791 240.000 124.000 ZM 184.000 40.000 L 72.000 40.000 C 41.072 40.000 16.000 65.072 16.000 96.000 L 16.000 100.000 C 16.000 102.209 17.791 104.000 20.000 104.000 L 56.000 104.000 L 56.000 64.270 C 55.932 59.979 59.195 56.367 63.470 56.000 C 65.682 55.853 67.856 56.631 69.473 58.147 C 71.090 59.664 72.005 61.783 72.000 64.000 L 72.000 104.000 L 112.000 104.000 L 112.000 92.000 C 112.000 89.791 113.791 88.000 116.000 88.000 L 140.000 88.000 C 142.209 88.000 144.000 89.791 144.000 92.000 L 144.000 104.000 L 184.000 104.000 L 184.000 64.270 C 183.932 59.979 187.195 56.367 191.470 56.000 C 193.682 55.853 195.856 56.631 197.473 58.147 C 199.090 59.664 200.005 61.783 200.000 64.000 L 200.000 104.000 L 236.000 104.000 C 238.209 104.000 240.000 102.209 240.000 100.000 L 240.000 96.000 C 240.000 65.072 214.928 40.000 184.000 40.000 Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
