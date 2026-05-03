package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorThinIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 197.170 C 212.393 198.733 212.393 201.267 210.830 202.830 C 209.267 204.393 206.733 204.393 205.170 202.830 L 128.000 125.660 L 50.830 202.830 C 49.267 204.393 46.733 204.393 45.170 202.830 C 43.607 201.267 43.607 198.733 45.170 197.170 L 125.170 117.170 C 125.920 116.419 126.938 115.997 128.000 115.997 C 129.062 115.997 130.080 116.419 130.830 117.170 ZM 50.830 122.830 L 128.000 45.660 L 205.170 122.830 C 206.733 124.393 209.267 124.393 210.830 122.830 C 212.393 121.267 212.393 118.733 210.830 117.170 L 130.830 37.170 C 130.080 36.419 129.062 35.997 128.000 35.997 C 126.938 35.997 125.920 36.419 125.170 37.170 L 45.170 117.170 C 43.607 118.733 43.607 121.267 45.170 122.830 C 46.733 124.393 49.267 124.393 50.830 122.830 Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
