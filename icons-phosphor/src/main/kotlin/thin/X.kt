package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorThinIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.830 197.170 C 204.393 198.733 204.393 201.267 202.830 202.830 C 201.267 204.393 198.733 204.393 197.170 202.830 L 128.000 133.660 L 58.830 202.830 C 57.267 204.393 54.733 204.393 53.170 202.830 C 51.607 201.267 51.607 198.733 53.170 197.170 L 122.340 128.000 L 53.170 58.830 C 51.607 57.267 51.607 54.733 53.170 53.170 C 54.733 51.607 57.267 51.607 58.830 53.170 L 128.000 122.340 L 197.170 53.170 C 198.733 51.607 201.267 51.607 202.830 53.170 C 204.393 54.733 204.393 57.267 202.830 58.830 L 133.660 128.000 Z"),
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
        return _x!!
    }

private var _x: ImageVector? = null
