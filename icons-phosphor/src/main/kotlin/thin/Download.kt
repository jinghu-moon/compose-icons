package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorThinIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 136.000 L 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 L 32.000 212.000 C 25.373 212.000 20.000 206.627 20.000 200.000 L 20.000 136.000 C 20.000 129.373 25.373 124.000 32.000 124.000 L 72.000 124.000 C 74.209 124.000 76.000 125.791 76.000 128.000 C 76.000 130.209 74.209 132.000 72.000 132.000 L 32.000 132.000 C 29.791 132.000 28.000 133.791 28.000 136.000 L 28.000 200.000 C 28.000 202.209 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 202.209 228.000 200.000 L 228.000 136.000 C 228.000 133.791 226.209 132.000 224.000 132.000 L 184.000 132.000 C 181.791 132.000 180.000 130.209 180.000 128.000 C 180.000 125.791 181.791 124.000 184.000 124.000 L 224.000 124.000 C 230.627 124.000 236.000 129.373 236.000 136.000 ZM 125.170 130.830 C 125.920 131.581 126.938 132.003 128.000 132.003 C 129.062 132.003 130.080 131.581 130.830 130.830 L 178.830 82.830 C 180.393 81.267 180.393 78.733 178.830 77.170 C 177.267 75.607 174.733 75.607 173.170 77.170 L 132.000 118.340 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 118.340 L 82.830 77.170 C 81.267 75.607 78.733 75.607 77.170 77.170 C 75.607 78.733 75.607 81.267 77.170 82.830 ZM 196.000 168.000 C 196.000 163.582 192.418 160.000 188.000 160.000 C 183.582 160.000 180.000 163.582 180.000 168.000 C 180.000 172.418 183.582 176.000 188.000 176.000 C 192.418 176.000 196.000 172.418 196.000 168.000 Z"),
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
        return _download!!
    }

private var _download: ImageVector? = null
