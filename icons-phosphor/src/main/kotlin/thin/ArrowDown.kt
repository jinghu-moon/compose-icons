package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorThinIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.830 146.830 L 130.830 218.830 C 130.080 219.581 129.062 220.003 128.000 220.003 C 126.938 220.003 125.920 219.581 125.170 218.830 L 53.170 146.830 C 51.607 145.267 51.607 142.733 53.170 141.170 C 54.733 139.607 57.267 139.607 58.830 141.170 L 124.000 206.340 L 124.000 40.000 C 124.000 37.791 125.791 36.000 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 L 132.000 206.340 L 197.170 141.170 C 198.733 139.607 201.267 139.607 202.830 141.170 C 204.393 142.733 204.393 145.267 202.830 146.830 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
