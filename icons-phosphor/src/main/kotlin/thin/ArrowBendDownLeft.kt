package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorThinIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 56.000 C 227.939 111.203 183.203 155.939 128.000 156.000 L 41.660 156.000 L 82.830 197.170 C 84.393 198.733 84.393 201.267 82.830 202.830 C 81.267 204.393 78.733 204.393 77.170 202.830 L 29.170 154.830 C 28.419 154.080 27.997 153.062 27.997 152.000 C 27.997 150.938 28.419 149.920 29.170 149.170 L 77.170 101.170 C 78.733 99.607 81.267 99.607 82.830 101.170 C 84.393 102.733 84.393 105.267 82.830 106.830 L 41.660 148.000 L 128.000 148.000 C 178.787 147.945 219.945 106.787 220.000 56.000 C 220.000 53.791 221.791 52.000 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
