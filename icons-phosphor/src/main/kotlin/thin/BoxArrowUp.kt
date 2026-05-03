package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorThinIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.580 70.210 L 203.580 38.210 C 202.902 36.855 201.516 35.999 200.000 36.000 L 56.000 36.000 C 54.484 35.999 53.098 36.855 52.420 38.210 L 36.420 70.210 C 36.143 70.766 35.999 71.379 36.000 72.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 72.000 C 220.001 71.379 219.857 70.766 219.580 70.210 ZM 58.470 44.000 L 197.530 44.000 L 209.530 68.000 L 46.470 68.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 76.000 L 212.000 76.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 162.830 133.170 C 164.393 134.733 164.393 137.267 162.830 138.830 C 161.267 140.393 158.733 140.393 157.170 138.830 L 132.000 113.660 L 132.000 184.000 C 132.000 186.209 130.209 188.000 128.000 188.000 C 125.791 188.000 124.000 186.209 124.000 184.000 L 124.000 113.660 L 98.830 138.830 C 97.267 140.393 94.733 140.393 93.170 138.830 C 91.607 137.267 91.607 134.733 93.170 133.170 L 125.170 101.170 C 125.920 100.419 126.938 99.997 128.000 99.997 C 129.062 99.997 130.080 100.419 130.830 101.170 Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
