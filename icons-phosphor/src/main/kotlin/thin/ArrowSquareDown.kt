package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) return _arrowSquareDown!!
        _arrowSquareDown = phosphorThinIcon(
            name = "ArrowSquareDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 162.830 133.170 C 163.581 133.920 164.003 134.938 164.003 136.000 C 164.003 137.062 163.581 138.080 162.830 138.830 L 130.830 170.830 C 130.080 171.581 129.062 172.003 128.000 172.003 C 126.938 172.003 125.920 171.581 125.170 170.830 L 93.170 138.830 C 91.607 137.267 91.607 134.733 93.170 133.170 C 94.733 131.607 97.267 131.607 98.830 133.170 L 124.000 158.340 L 124.000 88.000 C 124.000 85.791 125.791 84.000 128.000 84.000 C 130.209 84.000 132.000 85.791 132.000 88.000 L 132.000 158.340 L 157.170 133.170 C 157.920 132.419 158.938 131.997 160.000 131.997 C 161.062 131.997 162.080 132.419 162.830 133.170 Z"),
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
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
