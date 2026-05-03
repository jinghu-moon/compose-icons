package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorThinIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 32.000 L 196.000 176.000 C 196.000 178.209 194.209 180.000 192.000 180.000 L 57.660 180.000 L 98.830 221.170 C 100.393 222.733 100.393 225.267 98.830 226.830 C 97.267 228.393 94.733 228.393 93.170 226.830 L 45.170 178.830 C 44.419 178.080 43.997 177.062 43.997 176.000 C 43.997 174.938 44.419 173.920 45.170 173.170 L 93.170 125.170 C 94.733 123.607 97.267 123.607 98.830 125.170 C 100.393 126.733 100.393 129.267 98.830 130.830 L 57.660 172.000 L 188.000 172.000 L 188.000 32.000 C 188.000 29.791 189.791 28.000 192.000 28.000 C 194.209 28.000 196.000 29.791 196.000 32.000 Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
