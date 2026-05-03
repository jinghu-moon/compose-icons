package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorThinIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.000 48.000 L 108.000 208.000 C 108.000 210.209 106.209 212.000 104.000 212.000 C 101.791 212.000 100.000 210.209 100.000 208.000 L 100.000 132.000 L 33.660 132.000 L 58.830 157.170 C 60.393 158.733 60.393 161.267 58.830 162.830 C 57.267 164.393 54.733 164.393 53.170 162.830 L 21.170 130.830 C 20.419 130.080 19.997 129.062 19.997 128.000 C 19.997 126.938 20.419 125.920 21.170 125.170 L 53.170 93.170 C 54.733 91.607 57.267 91.607 58.830 93.170 C 60.393 94.733 60.393 97.267 58.830 98.830 L 33.660 124.000 L 100.000 124.000 L 100.000 48.000 C 100.000 45.791 101.791 44.000 104.000 44.000 C 106.209 44.000 108.000 45.791 108.000 48.000 ZM 234.830 125.170 L 202.830 93.170 C 201.267 91.607 198.733 91.607 197.170 93.170 C 195.607 94.733 195.607 97.267 197.170 98.830 L 222.340 124.000 L 156.000 124.000 L 156.000 48.000 C 156.000 45.791 154.209 44.000 152.000 44.000 C 149.791 44.000 148.000 45.791 148.000 48.000 L 148.000 208.000 C 148.000 210.209 149.791 212.000 152.000 212.000 C 154.209 212.000 156.000 210.209 156.000 208.000 L 156.000 132.000 L 222.340 132.000 L 197.170 157.170 C 195.607 158.733 195.607 161.267 197.170 162.830 C 198.733 164.393 201.267 164.393 202.830 162.830 L 234.830 130.830 C 235.581 130.080 236.003 129.062 236.003 128.000 C 236.003 126.938 235.581 125.920 234.830 125.170 Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
