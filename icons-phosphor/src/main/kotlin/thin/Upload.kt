package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorThinIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 136.000 L 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 L 32.000 212.000 C 25.373 212.000 20.000 206.627 20.000 200.000 L 20.000 136.000 C 20.000 129.373 25.373 124.000 32.000 124.000 L 80.000 124.000 C 82.209 124.000 84.000 125.791 84.000 128.000 C 84.000 130.209 82.209 132.000 80.000 132.000 L 32.000 132.000 C 29.791 132.000 28.000 133.791 28.000 136.000 L 28.000 200.000 C 28.000 202.209 29.791 204.000 32.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 202.209 228.000 200.000 L 228.000 136.000 C 228.000 133.791 226.209 132.000 224.000 132.000 L 176.000 132.000 C 173.791 132.000 172.000 130.209 172.000 128.000 C 172.000 125.791 173.791 124.000 176.000 124.000 L 224.000 124.000 C 230.627 124.000 236.000 129.373 236.000 136.000 ZM 82.830 74.830 L 124.000 33.660 L 124.000 128.000 C 124.000 130.209 125.791 132.000 128.000 132.000 C 130.209 132.000 132.000 130.209 132.000 128.000 L 132.000 33.660 L 173.170 74.830 C 174.733 76.393 177.267 76.393 178.830 74.830 C 180.393 73.267 180.393 70.733 178.830 69.170 L 130.830 21.170 C 130.080 20.419 129.062 19.997 128.000 19.997 C 126.938 19.997 125.920 20.419 125.170 21.170 L 77.170 69.170 C 75.607 70.733 75.607 73.267 77.170 74.830 C 78.733 76.393 81.267 76.393 82.830 74.830 ZM 196.000 168.000 C 196.000 163.582 192.418 160.000 188.000 160.000 C 183.582 160.000 180.000 163.582 180.000 168.000 C 180.000 172.418 183.582 176.000 188.000 176.000 C 192.418 176.000 196.000 172.418 196.000 168.000 Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
