package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorThinIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.830 205.170 C 204.393 206.733 204.393 209.267 202.830 210.830 C 201.267 212.393 198.733 212.393 197.170 210.830 L 117.170 130.830 C 116.419 130.080 115.997 129.062 115.997 128.000 C 115.997 126.938 116.419 125.920 117.170 125.170 L 197.170 45.170 C 198.733 43.607 201.267 43.607 202.830 45.170 C 204.393 46.733 204.393 49.267 202.830 50.830 L 125.660 128.000 ZM 45.660 128.000 L 122.830 50.830 C 124.393 49.267 124.393 46.733 122.830 45.170 C 121.267 43.607 118.733 43.607 117.170 45.170 L 37.170 125.170 C 36.419 125.920 35.997 126.938 35.997 128.000 C 35.997 129.062 36.419 130.080 37.170 130.830 L 117.170 210.830 C 118.733 212.393 121.267 212.393 122.830 210.830 C 124.393 209.267 124.393 206.733 122.830 205.170 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
