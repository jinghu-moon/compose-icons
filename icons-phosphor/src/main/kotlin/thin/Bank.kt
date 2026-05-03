package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorThinIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 100.000 L 52.000 100.000 L 52.000 172.000 L 32.000 172.000 C 29.791 172.000 28.000 173.791 28.000 176.000 C 28.000 178.209 29.791 180.000 32.000 180.000 L 224.000 180.000 C 226.209 180.000 228.000 178.209 228.000 176.000 C 228.000 173.791 226.209 172.000 224.000 172.000 L 204.000 172.000 L 204.000 100.000 L 232.000 100.000 C 233.792 100.004 235.369 98.815 235.858 97.091 C 236.346 95.366 235.628 93.527 234.100 92.590 L 130.100 28.590 C 128.813 27.796 127.187 27.796 125.900 28.590 L 21.900 92.590 C 20.372 93.527 19.654 95.366 20.142 97.091 C 20.631 98.815 22.208 100.004 24.000 100.000 ZM 60.000 100.000 L 100.000 100.000 L 100.000 172.000 L 60.000 172.000 ZM 148.000 100.000 L 148.000 172.000 L 108.000 172.000 L 108.000 100.000 ZM 196.000 172.000 L 156.000 172.000 L 156.000 100.000 L 196.000 100.000 ZM 128.000 36.700 L 217.870 92.000 L 38.130 92.000 ZM 244.000 208.000 C 244.000 210.209 242.209 212.000 240.000 212.000 L 16.000 212.000 C 13.791 212.000 12.000 210.209 12.000 208.000 C 12.000 205.791 13.791 204.000 16.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 205.791 244.000 208.000 Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
