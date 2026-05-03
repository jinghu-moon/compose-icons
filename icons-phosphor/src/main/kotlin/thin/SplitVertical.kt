package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorThinIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 152.000 C 212.000 154.209 210.209 156.000 208.000 156.000 L 132.000 156.000 L 132.000 222.340 L 157.170 197.170 C 158.733 195.607 161.267 195.607 162.830 197.170 C 164.393 198.733 164.393 201.267 162.830 202.830 L 130.830 234.830 C 130.080 235.581 129.062 236.003 128.000 236.003 C 126.938 236.003 125.920 235.581 125.170 234.830 L 93.170 202.830 C 91.607 201.267 91.607 198.733 93.170 197.170 C 94.733 195.607 97.267 195.607 98.830 197.170 L 124.000 222.340 L 124.000 156.000 L 48.000 156.000 C 45.791 156.000 44.000 154.209 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 149.791 212.000 152.000 ZM 48.000 108.000 L 208.000 108.000 C 210.209 108.000 212.000 106.209 212.000 104.000 C 212.000 101.791 210.209 100.000 208.000 100.000 L 132.000 100.000 L 132.000 33.660 L 157.170 58.830 C 158.733 60.393 161.267 60.393 162.830 58.830 C 164.393 57.267 164.393 54.733 162.830 53.170 L 130.830 21.170 C 130.080 20.419 129.062 19.997 128.000 19.997 C 126.938 19.997 125.920 20.419 125.170 21.170 L 93.170 53.170 C 91.607 54.733 91.607 57.267 93.170 58.830 C 94.733 60.393 97.267 60.393 98.830 58.830 L 124.000 33.660 L 124.000 100.000 L 48.000 100.000 C 45.791 100.000 44.000 101.791 44.000 104.000 C 44.000 106.209 45.791 108.000 48.000 108.000 Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
