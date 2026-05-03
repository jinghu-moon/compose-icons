package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorThinIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 160.000 L 132.000 232.000 C 132.000 234.209 130.209 236.000 128.000 236.000 C 125.791 236.000 124.000 234.209 124.000 232.000 L 124.000 160.000 C 124.000 157.791 125.791 156.000 128.000 156.000 C 130.209 156.000 132.000 157.791 132.000 160.000 ZM 208.000 100.000 L 137.660 100.000 L 186.830 50.830 C 188.393 49.267 188.393 46.733 186.830 45.170 C 185.267 43.607 182.733 43.607 181.170 45.170 L 132.000 94.340 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 94.340 L 74.830 45.170 C 73.267 43.607 70.733 43.607 69.170 45.170 C 67.607 46.733 67.607 49.267 69.170 50.830 L 118.340 100.000 L 48.000 100.000 C 45.791 100.000 44.000 101.791 44.000 104.000 C 44.000 106.209 45.791 108.000 48.000 108.000 L 118.340 108.000 L 69.170 157.170 C 67.607 158.733 67.607 161.267 69.170 162.830 C 70.733 164.393 73.267 164.393 74.830 162.830 L 128.000 109.660 L 181.170 162.830 C 182.733 164.393 185.267 164.393 186.830 162.830 C 188.393 161.267 188.393 158.733 186.830 157.170 L 137.660 108.000 L 208.000 108.000 C 210.209 108.000 212.000 106.209 212.000 104.000 C 212.000 101.791 210.209 100.000 208.000 100.000 Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
