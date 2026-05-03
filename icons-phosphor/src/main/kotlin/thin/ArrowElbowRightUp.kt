package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRightUp: ImageVector
    get() {
        if (_arrowElbowRightUp != null) return _arrowElbowRightUp!!
        _arrowElbowRightUp = phosphorThinIcon(
            name = "ArrowElbowRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.830 98.830 C 218.080 99.581 217.062 100.003 216.000 100.003 C 214.938 100.003 213.920 99.581 213.170 98.830 L 172.000 57.660 L 172.000 192.000 C 172.000 194.209 170.209 196.000 168.000 196.000 L 24.000 196.000 C 21.791 196.000 20.000 194.209 20.000 192.000 C 20.000 189.791 21.791 188.000 24.000 188.000 L 164.000 188.000 L 164.000 57.660 L 122.830 98.830 C 121.267 100.393 118.733 100.393 117.170 98.830 C 115.607 97.267 115.607 94.733 117.170 93.170 L 165.170 45.170 C 165.920 44.419 166.938 43.997 168.000 43.997 C 169.062 43.997 170.080 44.419 170.830 45.170 L 218.830 93.170 C 219.581 93.920 220.003 94.938 220.003 96.000 C 220.003 97.062 219.581 98.080 218.830 98.830 Z"),
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
        return _arrowElbowRightUp!!
    }

private var _arrowElbowRightUp: ImageVector? = null
