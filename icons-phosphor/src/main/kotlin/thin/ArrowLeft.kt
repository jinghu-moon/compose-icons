package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorThinIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 49.660 132.000 L 114.830 197.170 C 116.393 198.733 116.393 201.267 114.830 202.830 C 113.267 204.393 110.733 204.393 109.170 202.830 L 37.170 130.830 C 36.419 130.080 35.997 129.062 35.997 128.000 C 35.997 126.938 36.419 125.920 37.170 125.170 L 109.170 53.170 C 110.733 51.607 113.267 51.607 114.830 53.170 C 116.393 54.733 116.393 57.267 114.830 58.830 L 49.660 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 Z"),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
