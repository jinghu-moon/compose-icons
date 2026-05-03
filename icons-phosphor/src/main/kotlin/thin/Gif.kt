package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorThinIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 72.000 L 140.000 184.000 C 140.000 186.209 138.209 188.000 136.000 188.000 C 133.791 188.000 132.000 186.209 132.000 184.000 L 132.000 72.000 C 132.000 69.791 133.791 68.000 136.000 68.000 C 138.209 68.000 140.000 69.791 140.000 72.000 ZM 232.000 68.000 L 176.000 68.000 C 173.791 68.000 172.000 69.791 172.000 72.000 L 172.000 184.000 C 172.000 186.209 173.791 188.000 176.000 188.000 C 178.209 188.000 180.000 186.209 180.000 184.000 L 180.000 132.000 L 224.000 132.000 C 226.209 132.000 228.000 130.209 228.000 128.000 C 228.000 125.791 226.209 124.000 224.000 124.000 L 180.000 124.000 L 180.000 76.000 L 232.000 76.000 C 234.209 76.000 236.000 74.209 236.000 72.000 C 236.000 69.791 234.209 68.000 232.000 68.000 ZM 96.000 124.000 L 72.000 124.000 C 69.791 124.000 68.000 125.791 68.000 128.000 C 68.000 130.209 69.791 132.000 72.000 132.000 L 92.000 132.000 L 92.000 152.000 C 92.000 167.464 79.464 180.000 64.000 180.000 C 48.536 180.000 36.000 167.464 36.000 152.000 L 36.000 104.000 C 36.000 88.536 48.536 76.000 64.000 76.000 C 77.000 76.000 89.000 85.000 92.130 97.000 C 92.442 98.432 93.513 99.578 94.920 99.988 C 96.326 100.397 97.845 100.005 98.877 98.965 C 99.909 97.925 100.290 96.404 99.870 95.000 C 95.850 79.360 80.760 68.000 64.000 68.000 C 44.118 68.000 28.000 84.118 28.000 104.000 L 28.000 152.000 C 28.000 171.882 44.118 188.000 64.000 188.000 C 83.882 188.000 100.000 171.882 100.000 152.000 L 100.000 128.000 C 100.000 125.791 98.209 124.000 96.000 124.000 Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
