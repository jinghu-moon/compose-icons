package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorThinIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 122.830 C 202.080 123.581 201.062 124.003 200.000 124.003 C 198.938 124.003 197.920 123.581 197.170 122.830 L 128.000 53.660 L 58.830 122.830 C 57.267 124.393 54.733 124.393 53.170 122.830 C 51.607 121.267 51.607 118.733 53.170 117.170 L 125.170 45.170 C 125.920 44.419 126.938 43.997 128.000 43.997 C 129.062 43.997 130.080 44.419 130.830 45.170 L 202.830 117.170 C 203.581 117.920 204.003 118.938 204.003 120.000 C 204.003 121.062 203.581 122.080 202.830 122.830 Z"),
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
        return _control!!
    }

private var _control: ImageVector? = null
