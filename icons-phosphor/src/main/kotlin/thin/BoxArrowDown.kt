package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorThinIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.580 70.210 L 203.580 38.210 C 202.902 36.855 201.516 35.999 200.000 36.000 L 56.000 36.000 C 54.484 35.999 53.098 36.855 52.420 38.210 L 36.420 70.210 C 36.143 70.766 35.999 71.379 36.000 72.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 72.000 C 220.001 71.379 219.857 70.766 219.580 70.210 ZM 58.470 44.000 L 197.530 44.000 L 209.530 68.000 L 46.470 68.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 76.000 L 212.000 76.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 162.830 149.170 C 163.581 149.920 164.003 150.938 164.003 152.000 C 164.003 153.062 163.581 154.080 162.830 154.830 L 130.830 186.830 C 130.080 187.581 129.062 188.003 128.000 188.003 C 126.938 188.003 125.920 187.581 125.170 186.830 L 93.170 154.830 C 91.607 153.267 91.607 150.733 93.170 149.170 C 94.733 147.607 97.267 147.607 98.830 149.170 L 124.000 174.340 L 124.000 104.000 C 124.000 101.791 125.791 100.000 128.000 100.000 C 130.209 100.000 132.000 101.791 132.000 104.000 L 132.000 174.340 L 157.170 149.170 C 157.920 148.419 158.938 147.997 160.000 147.997 C 161.062 147.997 162.080 148.419 162.830 149.170 Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
