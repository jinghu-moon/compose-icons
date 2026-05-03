package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorThinIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.830 141.170 C 204.393 142.733 204.393 145.267 202.830 146.830 C 201.267 148.393 198.733 148.393 197.170 146.830 L 132.000 81.660 L 132.000 224.000 C 132.000 226.209 130.209 228.000 128.000 228.000 C 125.791 228.000 124.000 226.209 124.000 224.000 L 124.000 81.660 L 58.830 146.830 C 57.267 148.393 54.733 148.393 53.170 146.830 C 51.607 145.267 51.607 142.733 53.170 141.170 L 125.170 69.170 C 125.920 68.419 126.938 67.997 128.000 67.997 C 129.062 67.997 130.080 68.419 130.830 69.170 ZM 216.000 36.000 L 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 C 36.000 42.209 37.791 44.000 40.000 44.000 L 216.000 44.000 C 218.209 44.000 220.000 42.209 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 Z"),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
