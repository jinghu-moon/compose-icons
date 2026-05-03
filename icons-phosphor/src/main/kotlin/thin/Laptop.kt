package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorThinIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 172.000 L 220.000 172.000 L 220.000 72.000 C 220.000 60.954 211.046 52.000 200.000 52.000 L 56.000 52.000 C 44.954 52.000 36.000 60.954 36.000 72.000 L 36.000 172.000 L 24.000 172.000 C 21.791 172.000 20.000 173.791 20.000 176.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 176.000 C 236.000 173.791 234.209 172.000 232.000 172.000 ZM 44.000 72.000 C 44.000 65.373 49.373 60.000 56.000 60.000 L 200.000 60.000 C 206.627 60.000 212.000 65.373 212.000 72.000 L 212.000 172.000 L 44.000 172.000 ZM 228.000 192.000 C 228.000 198.627 222.627 204.000 216.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 198.627 28.000 192.000 L 28.000 180.000 L 228.000 180.000 ZM 148.000 88.000 C 148.000 90.209 146.209 92.000 144.000 92.000 L 112.000 92.000 C 109.791 92.000 108.000 90.209 108.000 88.000 C 108.000 85.791 109.791 84.000 112.000 84.000 L 144.000 84.000 C 146.209 84.000 148.000 85.791 148.000 88.000 Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
