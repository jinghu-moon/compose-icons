package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorThinIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 202.830 82.830 C 202.080 83.581 201.062 84.003 200.000 84.003 C 198.938 84.003 197.920 83.581 197.170 82.830 L 156.000 41.660 L 156.000 128.000 C 155.939 183.203 111.203 227.939 56.000 228.000 C 53.791 228.000 52.000 226.209 52.000 224.000 C 52.000 221.791 53.791 220.000 56.000 220.000 C 106.787 219.945 147.945 178.787 148.000 128.000 L 148.000 41.660 L 106.830 82.830 C 105.267 84.393 102.733 84.393 101.170 82.830 C 99.607 81.267 99.607 78.733 101.170 77.170 L 149.170 29.170 C 149.920 28.419 150.938 27.997 152.000 27.997 C 153.062 27.997 154.080 28.419 154.830 29.170 L 202.830 77.170 C 203.581 77.920 204.003 78.938 204.003 80.000 C 204.003 81.062 203.581 82.080 202.830 82.830 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
