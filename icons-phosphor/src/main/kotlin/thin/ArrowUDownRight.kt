package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorThinIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 170.830 L 178.830 218.830 C 177.267 220.393 174.733 220.393 173.170 218.830 C 171.607 217.267 171.607 214.733 173.170 213.170 L 214.340 172.000 L 88.000 172.000 C 54.863 172.000 28.000 145.137 28.000 112.000 C 28.000 78.863 54.863 52.000 88.000 52.000 L 176.000 52.000 C 178.209 52.000 180.000 53.791 180.000 56.000 C 180.000 58.209 178.209 60.000 176.000 60.000 L 88.000 60.000 C 59.281 60.000 36.000 83.281 36.000 112.000 C 36.000 140.719 59.281 164.000 88.000 164.000 L 214.340 164.000 L 173.170 122.830 C 171.607 121.267 171.607 118.733 173.170 117.170 C 174.733 115.607 177.267 115.607 178.830 117.170 L 226.830 165.170 C 227.581 165.920 228.003 166.938 228.003 168.000 C 228.003 169.062 227.581 170.080 226.830 170.830 Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
