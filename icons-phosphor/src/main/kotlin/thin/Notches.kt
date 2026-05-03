package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorThinIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 130.830 L 130.830 210.830 C 129.267 212.393 126.733 212.393 125.170 210.830 C 123.607 209.267 123.607 206.733 125.170 205.170 L 205.170 125.170 C 206.733 123.607 209.267 123.607 210.830 125.170 C 212.393 126.733 212.393 129.267 210.830 130.830 ZM 194.830 37.170 C 194.080 36.419 193.062 35.997 192.000 35.997 C 190.938 35.997 189.920 36.419 189.170 37.170 L 37.170 189.170 C 35.607 190.733 35.607 193.267 37.170 194.830 C 38.733 196.393 41.267 196.393 42.830 194.830 L 194.830 42.830 C 195.581 42.080 196.003 41.062 196.003 40.000 C 196.003 38.938 195.581 37.920 194.830 37.170 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
