package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorThinIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.830 178.830 L 170.830 226.830 C 170.080 227.581 169.062 228.003 168.000 228.003 C 166.938 228.003 165.920 227.581 165.170 226.830 L 117.170 178.830 C 115.607 177.267 115.607 174.733 117.170 173.170 C 118.733 171.607 121.267 171.607 122.830 173.170 L 164.000 214.340 L 164.000 88.000 C 164.000 59.281 140.719 36.000 112.000 36.000 C 83.281 36.000 60.000 59.281 60.000 88.000 L 60.000 176.000 C 60.000 178.209 58.209 180.000 56.000 180.000 C 53.791 180.000 52.000 178.209 52.000 176.000 L 52.000 88.000 C 52.000 54.863 78.863 28.000 112.000 28.000 C 145.137 28.000 172.000 54.863 172.000 88.000 L 172.000 214.340 L 213.170 173.170 C 214.733 171.607 217.267 171.607 218.830 173.170 C 220.393 174.733 220.393 177.267 218.830 178.830 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
