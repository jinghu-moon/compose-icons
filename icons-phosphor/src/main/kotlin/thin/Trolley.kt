package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorThinIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 224.000 C 84.000 230.627 78.627 236.000 72.000 236.000 C 65.373 236.000 60.000 230.627 60.000 224.000 C 60.000 217.373 65.373 212.000 72.000 212.000 C 78.627 212.000 84.000 217.373 84.000 224.000 ZM 216.000 212.000 C 209.373 212.000 204.000 217.373 204.000 224.000 C 204.000 230.627 209.373 236.000 216.000 236.000 C 222.627 236.000 228.000 230.627 228.000 224.000 C 228.000 217.373 222.627 212.000 216.000 212.000 ZM 240.000 180.000 L 52.000 180.000 L 52.000 75.310 C 52.000 72.130 50.737 69.080 48.490 66.830 L 26.830 45.170 C 25.267 43.607 22.733 43.607 21.170 45.170 C 19.607 46.733 19.607 49.267 21.170 50.830 L 42.830 72.480 C 43.580 73.231 44.001 74.249 44.000 75.310 L 44.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 181.791 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 240.000 188.000 C 242.209 188.000 244.000 186.209 244.000 184.000 C 244.000 181.791 242.209 180.000 240.000 180.000 Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
