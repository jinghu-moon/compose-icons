package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorThinIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 156.000 L 220.000 156.000 L 220.000 136.000 C 219.896 96.008 194.061 60.627 156.000 48.350 L 156.000 40.000 C 156.000 33.373 150.627 28.000 144.000 28.000 L 112.000 28.000 C 105.373 28.000 100.000 33.373 100.000 40.000 L 100.000 48.350 C 61.939 60.627 36.104 96.008 36.000 136.000 L 36.000 156.000 L 32.000 156.000 C 25.373 156.000 20.000 161.373 20.000 168.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 168.000 C 236.000 161.373 230.627 156.000 224.000 156.000 ZM 212.000 136.000 L 212.000 156.000 L 156.000 156.000 L 156.000 56.800 C 189.501 68.749 211.903 100.432 212.000 136.000 ZM 112.000 36.000 L 144.000 36.000 C 146.209 36.000 148.000 37.791 148.000 40.000 L 148.000 156.000 L 108.000 156.000 L 108.000 40.000 C 108.000 37.791 109.791 36.000 112.000 36.000 ZM 44.000 136.000 C 44.097 100.432 66.499 68.749 100.000 56.800 L 100.000 156.000 L 44.000 156.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 168.000 C 28.000 165.791 29.791 164.000 32.000 164.000 L 224.000 164.000 C 226.209 164.000 228.000 165.791 228.000 168.000 Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
