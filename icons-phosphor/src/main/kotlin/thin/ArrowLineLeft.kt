package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorThinIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 228.000 130.209 226.209 132.000 224.000 132.000 L 81.660 132.000 L 146.830 197.170 C 148.393 198.733 148.393 201.267 146.830 202.830 C 145.267 204.393 142.733 204.393 141.170 202.830 L 69.170 130.830 C 68.419 130.080 67.997 129.062 67.997 128.000 C 67.997 126.938 68.419 125.920 69.170 125.170 L 141.170 53.170 C 142.733 51.607 145.267 51.607 146.830 53.170 C 148.393 54.733 148.393 57.267 146.830 58.830 L 81.660 124.000 L 224.000 124.000 C 226.209 124.000 228.000 125.791 228.000 128.000 ZM 40.000 36.000 C 37.791 36.000 36.000 37.791 36.000 40.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 C 42.209 220.000 44.000 218.209 44.000 216.000 L 44.000 40.000 C 44.000 37.791 42.209 36.000 40.000 36.000 Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
