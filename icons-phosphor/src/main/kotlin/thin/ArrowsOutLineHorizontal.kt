package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorThinIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.000 40.000 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 40.000 C 124.000 37.791 125.791 36.000 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 ZM 96.000 124.000 L 25.660 124.000 L 50.830 98.830 C 52.393 97.267 52.393 94.733 50.830 93.170 C 49.267 91.607 46.733 91.607 45.170 93.170 L 13.170 125.170 C 12.419 125.920 11.997 126.938 11.997 128.000 C 11.997 129.062 12.419 130.080 13.170 130.830 L 45.170 162.830 C 46.733 164.393 49.267 164.393 50.830 162.830 C 52.393 161.267 52.393 158.733 50.830 157.170 L 25.660 132.000 L 96.000 132.000 C 98.209 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 98.209 124.000 96.000 124.000 ZM 242.830 125.170 L 210.830 93.170 C 209.267 91.607 206.733 91.607 205.170 93.170 C 203.607 94.733 203.607 97.267 205.170 98.830 L 230.340 124.000 L 160.000 124.000 C 157.791 124.000 156.000 125.791 156.000 128.000 C 156.000 130.209 157.791 132.000 160.000 132.000 L 230.340 132.000 L 205.170 157.170 C 203.607 158.733 203.607 161.267 205.170 162.830 C 206.733 164.393 209.267 164.393 210.830 162.830 L 242.830 130.830 C 243.581 130.080 244.003 129.062 244.003 128.000 C 244.003 126.938 243.581 125.920 242.830 125.170 Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
