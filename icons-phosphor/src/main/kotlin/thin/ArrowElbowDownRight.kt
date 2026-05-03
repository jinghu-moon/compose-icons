package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorThinIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.830 178.830 L 170.830 226.830 C 169.267 228.393 166.733 228.393 165.170 226.830 C 163.607 225.267 163.607 222.733 165.170 221.170 L 206.340 180.000 L 72.000 180.000 C 69.791 180.000 68.000 178.209 68.000 176.000 L 68.000 32.000 C 68.000 29.791 69.791 28.000 72.000 28.000 C 74.209 28.000 76.000 29.791 76.000 32.000 L 76.000 172.000 L 206.340 172.000 L 165.170 130.830 C 163.607 129.267 163.607 126.733 165.170 125.170 C 166.733 123.607 169.267 123.607 170.830 125.170 L 218.830 173.170 C 219.581 173.920 220.003 174.938 220.003 176.000 C 220.003 177.062 219.581 178.080 218.830 178.830 Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
