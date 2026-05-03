package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorThinIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 40.000 132.000 C 37.791 132.000 36.000 130.209 36.000 128.000 C 36.000 125.791 37.791 124.000 40.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 98.830 50.830 L 124.000 25.660 L 124.000 96.000 C 124.000 98.209 125.791 100.000 128.000 100.000 C 130.209 100.000 132.000 98.209 132.000 96.000 L 132.000 25.660 L 157.170 50.830 C 158.733 52.393 161.267 52.393 162.830 50.830 C 164.393 49.267 164.393 46.733 162.830 45.170 L 130.830 13.170 C 130.080 12.419 129.062 11.997 128.000 11.997 C 126.938 11.997 125.920 12.419 125.170 13.170 L 93.170 45.170 C 91.607 46.733 91.607 49.267 93.170 50.830 C 94.733 52.393 97.267 52.393 98.830 50.830 ZM 157.170 205.170 L 132.000 230.340 L 132.000 160.000 C 132.000 157.791 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 157.791 124.000 160.000 L 124.000 230.340 L 98.830 205.170 C 97.267 203.607 94.733 203.607 93.170 205.170 C 91.607 206.733 91.607 209.267 93.170 210.830 L 125.170 242.830 C 125.920 243.581 126.938 244.003 128.000 244.003 C 129.062 244.003 130.080 243.581 130.830 242.830 L 162.830 210.830 C 164.393 209.267 164.393 206.733 162.830 205.170 C 161.267 203.607 158.733 203.607 157.170 205.170 Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
