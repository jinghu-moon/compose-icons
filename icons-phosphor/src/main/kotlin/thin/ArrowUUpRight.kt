package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorThinIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 173.170 133.170 L 214.340 92.000 L 88.000 92.000 C 59.281 92.000 36.000 115.281 36.000 144.000 C 36.000 172.719 59.281 196.000 88.000 196.000 L 176.000 196.000 C 178.209 196.000 180.000 197.791 180.000 200.000 C 180.000 202.209 178.209 204.000 176.000 204.000 L 88.000 204.000 C 54.863 204.000 28.000 177.137 28.000 144.000 C 28.000 110.863 54.863 84.000 88.000 84.000 L 214.340 84.000 L 173.170 42.830 C 171.607 41.267 171.607 38.733 173.170 37.170 C 174.733 35.607 177.267 35.607 178.830 37.170 L 226.830 85.170 C 227.581 85.920 228.003 86.938 228.003 88.000 C 228.003 89.062 227.581 90.080 226.830 90.830 L 178.830 138.830 C 177.267 140.393 174.733 140.393 173.170 138.830 C 171.607 137.267 171.607 134.733 173.170 133.170 Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
