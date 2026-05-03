package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorThinIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 112.000 132.000 C 109.791 132.000 108.000 130.209 108.000 128.000 C 108.000 125.791 109.791 124.000 112.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 112.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 66.209 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 112.000 60.000 C 109.791 60.000 108.000 61.791 108.000 64.000 C 108.000 66.209 109.791 68.000 112.000 68.000 ZM 216.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 37.170 138.830 C 37.920 139.581 38.938 140.003 40.000 140.003 C 41.062 140.003 42.080 139.581 42.830 138.830 L 82.830 98.830 C 83.581 98.080 84.003 97.062 84.003 96.000 C 84.003 94.938 83.581 93.920 82.830 93.170 L 42.830 53.170 C 41.267 51.607 38.733 51.607 37.170 53.170 C 35.607 54.733 35.607 57.267 37.170 58.830 L 74.340 96.000 L 37.170 133.170 C 36.419 133.920 35.997 134.938 35.997 136.000 C 35.997 137.062 36.419 138.080 37.170 138.830 Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
