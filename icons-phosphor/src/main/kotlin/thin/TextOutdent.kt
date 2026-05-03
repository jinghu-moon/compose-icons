package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorThinIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 112.000 132.000 C 109.791 132.000 108.000 130.209 108.000 128.000 C 108.000 125.791 109.791 124.000 112.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 112.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 66.209 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 112.000 60.000 C 109.791 60.000 108.000 61.791 108.000 64.000 C 108.000 66.209 109.791 68.000 112.000 68.000 ZM 216.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 72.000 140.000 C 73.619 140.001 75.079 139.027 75.698 137.531 C 76.318 136.036 75.975 134.314 74.830 133.170 L 37.660 96.000 L 74.830 58.830 C 76.393 57.267 76.393 54.733 74.830 53.170 C 73.267 51.607 70.733 51.607 69.170 53.170 L 29.170 93.170 C 28.419 93.920 27.997 94.938 27.997 96.000 C 27.997 97.062 28.419 98.080 29.170 98.830 L 69.170 138.830 C 69.921 139.580 70.939 140.001 72.000 140.000 Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
