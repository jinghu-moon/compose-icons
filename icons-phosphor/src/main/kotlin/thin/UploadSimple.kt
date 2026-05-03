package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorThinIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 144.000 L 220.000 208.000 C 220.000 210.209 218.209 212.000 216.000 212.000 L 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 L 36.000 144.000 C 36.000 141.791 37.791 140.000 40.000 140.000 C 42.209 140.000 44.000 141.791 44.000 144.000 L 44.000 204.000 L 212.000 204.000 L 212.000 144.000 C 212.000 141.791 213.791 140.000 216.000 140.000 C 218.209 140.000 220.000 141.791 220.000 144.000 ZM 90.830 74.830 L 124.000 41.660 L 124.000 144.000 C 124.000 146.209 125.791 148.000 128.000 148.000 C 130.209 148.000 132.000 146.209 132.000 144.000 L 132.000 41.660 L 165.170 74.830 C 166.733 76.393 169.267 76.393 170.830 74.830 C 172.393 73.267 172.393 70.733 170.830 69.170 L 130.830 29.170 C 130.080 28.419 129.062 27.997 128.000 27.997 C 126.938 27.997 125.920 28.419 125.170 29.170 L 85.170 69.170 C 83.607 70.733 83.607 73.267 85.170 74.830 C 86.733 76.393 89.267 76.393 90.830 74.830 Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
