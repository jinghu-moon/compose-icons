package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorThinIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.000 156.000 L 216.000 156.000 C 222.627 156.000 228.000 150.627 228.000 144.000 L 228.000 72.000 C 228.000 65.373 222.627 60.000 216.000 60.000 L 180.000 60.000 L 180.000 40.000 C 180.000 33.373 174.627 28.000 168.000 28.000 L 136.000 28.000 C 129.373 28.000 124.000 33.373 124.000 40.000 L 124.000 60.000 L 88.000 60.000 C 81.373 60.000 76.000 65.373 76.000 72.000 L 76.000 144.000 C 76.000 150.627 81.373 156.000 88.000 156.000 ZM 132.000 40.000 C 132.000 37.791 133.791 36.000 136.000 36.000 L 168.000 36.000 C 170.209 36.000 172.000 37.791 172.000 40.000 L 172.000 60.000 L 132.000 60.000 ZM 84.000 72.000 C 84.000 69.791 85.791 68.000 88.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 69.791 220.000 72.000 L 220.000 144.000 C 220.000 146.209 218.209 148.000 216.000 148.000 L 88.000 148.000 C 85.791 148.000 84.000 146.209 84.000 144.000 ZM 84.000 224.000 C 84.000 230.627 78.627 236.000 72.000 236.000 C 65.373 236.000 60.000 230.627 60.000 224.000 C 60.000 217.373 65.373 212.000 72.000 212.000 C 78.627 212.000 84.000 217.373 84.000 224.000 ZM 228.000 224.000 C 228.000 230.627 222.627 236.000 216.000 236.000 C 209.373 236.000 204.000 230.627 204.000 224.000 C 204.000 217.373 209.373 212.000 216.000 212.000 C 222.627 212.000 228.000 217.373 228.000 224.000 ZM 244.000 184.000 C 244.000 186.209 242.209 188.000 240.000 188.000 L 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 C 28.000 181.791 29.791 180.000 32.000 180.000 L 44.000 180.000 L 44.000 75.310 C 44.001 74.249 43.580 73.231 42.830 72.480 L 21.170 50.830 C 19.607 49.267 19.607 46.733 21.170 45.170 C 22.733 43.607 25.267 43.607 26.830 45.170 L 48.490 66.830 C 50.737 69.080 52.000 72.130 52.000 75.310 L 52.000 180.000 L 240.000 180.000 C 242.209 180.000 244.000 181.791 244.000 184.000 Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
