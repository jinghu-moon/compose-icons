package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorThinIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 L 161.920 36.000 C 153.561 25.883 141.123 20.026 128.000 20.026 C 114.877 20.026 102.439 25.883 94.080 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 ZM 128.000 28.000 C 147.882 28.000 164.000 44.118 164.000 64.000 L 164.000 68.000 L 92.000 68.000 L 92.000 64.000 C 92.000 44.118 108.118 28.000 128.000 28.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 88.830 44.000 C 85.652 50.187 83.996 57.044 84.000 64.000 L 84.000 72.000 C 84.000 74.209 85.791 76.000 88.000 76.000 L 168.000 76.000 C 170.209 76.000 172.000 74.209 172.000 72.000 L 172.000 64.000 C 172.004 57.044 170.348 50.187 167.170 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
