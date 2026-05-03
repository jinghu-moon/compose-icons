package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorThinIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 76.000 L 156.000 76.000 L 156.000 32.000 C 156.000 25.373 150.627 20.000 144.000 20.000 L 112.000 20.000 C 105.373 20.000 100.000 25.373 100.000 32.000 L 100.000 76.000 L 56.000 76.000 C 49.373 76.000 44.000 81.373 44.000 88.000 L 44.000 120.000 C 44.000 126.627 49.373 132.000 56.000 132.000 L 100.000 132.000 L 100.000 224.000 C 100.000 230.627 105.373 236.000 112.000 236.000 L 144.000 236.000 C 150.627 236.000 156.000 230.627 156.000 224.000 L 156.000 132.000 L 200.000 132.000 C 206.627 132.000 212.000 126.627 212.000 120.000 L 212.000 88.000 C 212.000 81.373 206.627 76.000 200.000 76.000 ZM 204.000 120.000 C 204.000 122.209 202.209 124.000 200.000 124.000 L 152.000 124.000 C 149.791 124.000 148.000 125.791 148.000 128.000 L 148.000 224.000 C 148.000 226.209 146.209 228.000 144.000 228.000 L 112.000 228.000 C 109.791 228.000 108.000 226.209 108.000 224.000 L 108.000 128.000 C 108.000 125.791 106.209 124.000 104.000 124.000 L 56.000 124.000 C 53.791 124.000 52.000 122.209 52.000 120.000 L 52.000 88.000 C 52.000 85.791 53.791 84.000 56.000 84.000 L 104.000 84.000 C 106.209 84.000 108.000 82.209 108.000 80.000 L 108.000 32.000 C 108.000 29.791 109.791 28.000 112.000 28.000 L 144.000 28.000 C 146.209 28.000 148.000 29.791 148.000 32.000 L 148.000 80.000 C 148.000 82.209 149.791 84.000 152.000 84.000 L 200.000 84.000 C 202.209 84.000 204.000 85.791 204.000 88.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
