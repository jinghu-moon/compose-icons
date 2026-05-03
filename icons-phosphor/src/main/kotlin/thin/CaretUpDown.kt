package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorThinIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.830 173.170 C 179.581 173.920 180.003 174.938 180.003 176.000 C 180.003 177.062 179.581 178.080 178.830 178.830 L 130.830 226.830 C 130.080 227.581 129.062 228.003 128.000 228.003 C 126.938 228.003 125.920 227.581 125.170 226.830 L 77.170 178.830 C 75.607 177.267 75.607 174.733 77.170 173.170 C 78.733 171.607 81.267 171.607 82.830 173.170 L 128.000 218.340 L 173.170 173.170 C 173.920 172.419 174.938 171.997 176.000 171.997 C 177.062 171.997 178.080 172.419 178.830 173.170 ZM 82.830 82.830 L 128.000 37.660 L 173.170 82.830 C 174.733 84.393 177.267 84.393 178.830 82.830 C 180.393 81.267 180.393 78.733 178.830 77.170 L 130.830 29.170 C 130.080 28.419 129.062 27.997 128.000 27.997 C 126.938 27.997 125.920 28.419 125.170 29.170 L 77.170 77.170 C 75.607 78.733 75.607 81.267 77.170 82.830 C 78.733 84.393 81.267 84.393 82.830 82.830 Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
